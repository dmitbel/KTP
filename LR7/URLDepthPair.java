public class URLDepthPair {
    private String URL;
    private int depth;

    URLDepthPair(String URL, int depth) {
        // Не учитываем последний слэш, чтобы не было дубликатов
        if (URL.charAt(URL.length()-1) == '/') {
            this.URL = URL.substring(0, URL.length()-1);
        }
        else {
            this.URL = URL;
        }
        this.depth = depth;
    }

    public String getURL() {
        return URL;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "depth:" + Integer.toString(depth) + '\t' + URL;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(this.getClass())) {
            URLDepthPair obj_pair = (URLDepthPair)obj;
            return this.getURL().equals(obj_pair.getURL());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return URL.hashCode();
    }

}