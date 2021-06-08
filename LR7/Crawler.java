import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Crawler {
    /** Исходный URL */
    private URLDepthPair origin; 
    /** Максимальная глубина */
    private int max_depth;
    /** Для хранения пар */
    private LinkedList<URLDepthPair> closed = new LinkedList<URLDepthPair> ();
    private LinkedList<URLDepthPair> available = new LinkedList<URLDepthPair> ();

    public static final String HREF_PREFIX = "<a href=\"";
    public static final String URL_PREFIX = "http://";
    public static final Pattern URL_REGEX = Pattern.compile(HREF_PREFIX + URL_PREFIX + "(\\S+)(\">|\"\\s)");

    public Crawler(String origin_url, int max_depth) {
        origin = new URLDepthPair(origin_url, 0);
        this.max_depth = max_depth;
        available.add(origin);
        while(!available.isEmpty()) {
            URLDepthPair current = available.removeFirst();
            closed.add(current);
            processURL(current);
        }
    }

    /** Обрабатывает очередную пару URL, Depth. В случае достижения максимальной глубины возвращаем false */
    private boolean processURL(URLDepthPair pair) {
        Socket socket;
        String url = pair.getURL();
        int current_depth = pair.getDepth();
        // Разделяем url на host и path:
        int path_i = url.indexOf("/");
        String path;
        String host;
        if (path_i > 0) {
            host = url.substring(0, path_i);
            path = url.substring(path_i, url.length());
        }
        else {
            host = url;
            path = "/";
        }
        // Проверяем на максимальную глубину, если равна или больше, то больше
        //не ищем страницы
        if (current_depth >= max_depth) {
            return false;
        }
        try {
            socket = new Socket(host, 443);
            socket.setSoTimeout(16*1000);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            pw.println("GET " + path + " HTTP/1.1");
            pw.println("Host: " + host);
            pw.println("Connection: close");
            pw.println("");
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println(input);
                // Если строка не пустая ищем url
                if (input.length() > 0) {
                    Matcher m = URL_REGEX.matcher(input);
                    while(m.find()) {
                        String new_url = m.group(1);
                        URLDepthPair new_pair = new URLDepthPair(new_url, current_depth+1);
                        if (!closed.contains(new_pair) && !available.contains(new_pair)) {
                            available.add(new_pair);
                        }
                    }
                }
            }
            socket.close();
        } catch (Exception e) {
            System.out.println(e.toString() + " URL:" + url.toString());
        }
        return true;
    }

    public LinkedList<URLDepthPair> getSites() {
        return this.closed;
    }

    public static void main(String[] args) {
        Crawler crawler;
        // Адрес с которого начнётся просмотр
        if (args.length != 0) {
            try {
                crawler = new Crawler(args[0], Integer.parseInt(args[1]));
                LinkedList<URLDepthPair> closed = crawler.getSites();
                System.out.println("Found pages:");
                for (URLDepthPair pair : closed) {
                    System.out.println('\t' + pair.toString());
                }
                System.out.println("End of found pages");
            } catch (IllegalArgumentException e) {
                System.out.println("usage: java Crawler <URL><depth>");
                throw(e);
            }
        }
        else {
            System.out.println("usage: java Crawler <URL><depth>");
        }
    }
}