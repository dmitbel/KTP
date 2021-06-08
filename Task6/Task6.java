import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args) {
        System.out.printf("%n ---Part 1--- %n");
        System.out.printf("hiddenAnagram(\"My world evolves in a beautiful space called Tesh.\", \"sworn love lived\") -> %s %n",
            hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived"));
        System.out.printf("hiddenAnagram(\"An old west action hero actor\", \"Clint Eastwood\")       -> %s %n",
            hiddenAnagram("An old west action hero actor.", "Clint Eastwood"));
        System.out.printf("hiddenAnagram(\"Mr. Mojo Rising could be a song title\", \"Jim Morrison\") -> %s %n",
            hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
        System.out.printf("hiddenAnagram(\"Banana? margaritas\", \"ANAGRAM\")               -> %s %n",
            hiddenAnagram("Banana? margaritas", "ANAGRAM"));
        System.out.printf("hiddenAnagram(\"D  e b90it->?$ (c)a r...d,,#~\", \"bad credit\") -> %s %n",
            hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
        System.out.printf("hiddenAnagram(\"Bright is the moon\", \"Bongo mirth\")           -> %s %n",
            hiddenAnagram("Bright is the moon", "Bongo mirth"));
        
        System.out.printf("%n ---Part 2--- %n");
        System.out.printf("collect(\"intercontinentalisationalism\", 6)                   -> %s %n", 
            Arrays.toString(collect("intercontinentalisationalism", 6)));
        System.out.printf("collect(\"strengths\", 3) -> %s %n", Arrays.toString(collect("strengths", 3)));
        System.out.printf("collect(\"pneumonoultramicroscopicsilicovolcanoconiosis\", 15) -> %s %n", 
            Arrays.toString(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)));

        System.out.printf("%n ---Part 3--- %n");
        System.out.printf("nicoCipher(\"mubashirhassan\", \"crazy\")      -> %s %n",
            nicoCipher("mubashirhassan", "crazy"));
        System.out.printf("nicoCipher(\"myworldevolvesinhers\", \"tesh\") -> %s %n",
            nicoCipher("myworldevolvesinhers", "tesh"));
        System.out.printf("nicoCipher(\"andiloveherso\", \"tesha\")  -> %s %n",
            nicoCipher("andiloveherso", "tesha"));
        System.out.printf("nicoCipher(\"edabitisamazing\", \"matt\") -> %s %n",
            nicoCipher("edabitisamazing", "matt"));
        System.out.printf("nicoCipher(\"iloveher\", \"612345\")      -> %s %n",
            nicoCipher("iloveher", "612345"));

        System.out.printf("%n ---Part 4--- %n");
        System.out.printf("twoProduct([1,  2, -1,  4,  5,  6,  10, 7], 20) -> %s %n", 
            Arrays.toString(twoProduct(new int[]{1,  2, -1,  4,  5,  6,  10, 7}, 20)));
        System.out.printf("twoProduct([1, 2, 3, 9, 4, 5, 15, 3], 45) -> %s %n", 
            Arrays.toString(twoProduct(new int[]{1, 2, 3, 9, 4, 5, 15, 3}, 45)));
        System.out.printf("twoProduct([1,  2, -1,  4,  5,  6,  10, 7], 20) -> %s %n", 
            Arrays.toString(twoProduct(new int[]{1, 2, 3, 9, 4, 15, 3, 5}, 45)));
        System.out.printf("twoProduct([1, 2, 3, 4, 5,  6, 7, 8, 9, 10], 10) -> %s %n", 
            Arrays.toString(twoProduct(new int[]{1, 2, 3, 4, 5,  6, 7, 8, 9, 10}, 10)));
        System.out.printf("twoProduct([100, 12, 4, 1, 2], 15) -> %s %n", 
            Arrays.toString(twoProduct(new int[]{100, 12, 4, 1, 2}, 15)));

        System.out.printf("%n ---Part 5--- %n");
        System.out.printf("isExact(6)   -> %s %n", Arrays.toString(isExact(6)));
        System.out.printf("isExact(24)  -> %s %n", Arrays.toString(isExact(24)));
        System.out.printf("isExact(125) -> %s %n", Arrays.toString(isExact(125)));
        System.out.printf("isExact(720) -> %s %n", Arrays.toString(isExact(720)));

        System.out.printf("%n ---Part 6--- %n");
        System.out.printf("fractions(0.(6)) -> %s %n", fractions("0.(6)"));
        System.out.printf("fractions(1.(1)) -> %s %n", fractions("1.(1)"));
        System.out.printf("fractions(3.(142857)) -> %s %n", fractions("3.(142857)"));
        System.out.printf("fractions(0.19(2367)) -> %s %n", fractions("0.19(2367)"));
        System.out.printf("fractions(0.1097(3)) -> %s %n", fractions("0.1097(3)"));

        System.out.printf("%n ---Part 7--- %n");
        System.out.printf("pilish_string(\"33314444\") -> %s %n", pilish_string("33314444"));
        System.out.printf("pilish_string(\"TOP\") -> %s %n", pilish_string("TOP"));
        System.out.printf("pilish_string(\"X\") -> %s %n", pilish_string("X"));
        System.out.printf("pilish_string(\"\") -> %s %n", pilish_string(""));

        System.out.printf("%n ---Part 8--- %n");
        System.out.printf("generateNonconsecutive(1) -> %s %n", generateNonconsecutive(1));
        System.out.printf("generateNonconsecutive(2) -> %s %n", generateNonconsecutive(2));
        System.out.printf("generateNonconsecutive(3) -> %s %n", generateNonconsecutive(3));
        System.out.printf("generateNonconsecutive(4) -> %s %n", generateNonconsecutive(4));
        System.out.printf("generateNonconsecutive(5) -> %s %n", generateNonconsecutive(5));

        System.out.printf("%n ---Part 9--- %n");
        System.out.printf("isValid(\"a\")          -> %s %n", isValid("a"));
        System.out.printf("isValid(\"aabbcd\")     -> %s %n", isValid("aabbcd"));
        System.out.printf("isValid(\"aaabbbcccc\") -> %s %n", isValid("aaabbbcccc"));
        System.out.printf("isValid(\"aabbccddeefghi\")    -> %s %n", isValid("aabbccddeefghi"));
        System.out.printf("isValid(\"abcdefghhgfedecba\") -> %s %n", isValid("abcdefghhgfedecba"));
        
        System.out.printf("%n ---Part 10--- %n");
        System.out.printf("sumsUp([1, 2, 3, 4, 5])  -> %s %n", Arrays.deepToString(sumsUp(new int[] {1, 2, 3, 4, 5})));
        System.out.printf("sumsUp([1, 2, 3, 7, 9])  -> %s %n", Arrays.deepToString(sumsUp(new int[] {1, 2, 3, 7, 9})));
        System.out.printf("sumsUp([10, 9, 7, 2, 8]) -> %s %n", Arrays.deepToString(sumsUp(new int[] {10, 9, 7, 2, 8})));
        System.out.printf("sumsUp([1, 6, 5, 4, 8, 2, 3, 7]) -> %s %n", Arrays.deepToString(sumsUp(new int[] {1, 6, 5, 4, 8, 2, 3, 7})));
    }

    // Задание №1
    // Функция для нахождения анаграмм в строке

    //  Используем HashMap для хранения символов pattern как ключей и счётчика их количества как значений. 
    //Копируем эту карту, в случае если понадобится начать заново (current_available).
    //  Используем chArray для хранения записанных символов, т.к. знаем, что анаграмма будет состоять из pattern_length 
    //символов.
    //  Проходим циклично по строке input, добавляя доступные символы из current_available, если находим доступный 
    //символ, но его количество кончилось, то убираем из chArray символы, пока не найдём нужный попутно возвращая 
    //символы в current_available.
    //  В случае буквы, которая вообще не имеется в карте current_available начинаем заново - т.е. обнуляем все
    //переменные, следящие за добавлением символов в chArray.
    public static String hiddenAnagram(String input, String pattern) {
        // Для хранения символов, которые можно использовать в анаграмме
        HashMap<Character, Integer> available = new HashMap<>();
        // Т.к. в pattern могут быть ненужные символы
        int pattern_length = 0;
        for (char ch : pattern.toCharArray()) {
            char lch = Character.toLowerCase(ch);
            if (available.containsKey(lch)) {
                available.put(lch, available.get(lch) + 1);
                pattern_length++;
            }
            else if (Character.isAlphabetic(ch)) {
                available.put(lch, 1);
                pattern_length++;
            }
        }
        // Копируем HashMap, чтобы не пересчитывать при неудаче
        HashMap<Character, Integer> current_available = new HashMap<>(available);
        // Для создания строки анаграммы и смещения в случае неудачи
        char[] chArray = new char[pattern_length];
        // Для отслеживания длины рассматриваемого участка
        int current_length = 0; 
        for (char ch : input.toCharArray()) {
            // В случае если символ имеется в доступных
            char lch = Character.toLowerCase(ch);
            if (current_available.containsKey(lch) ) {
                // Если остались неиспользованные, то просто записываем
                if (current_available.get(lch) > 0) {
                    current_available.put(lch, current_available.get(lch) - 1);
                    chArray[current_length] = lch;
                    // Проверяем длину и возвращаем успешно составленную анаграмму
                    current_length++;
                    if (current_length == pattern_length) {
                        return new String(chArray);
                    }
                }
                // Если не осталось, то убираем с начала chArray, пока не получится 
                //добавить, т.е. пока не найдём такой же символ в chArray
                else {
                    int i = 0;
                    do {
                        // Возвращаем значения в доступные
                        current_available.put(chArray[i], current_available.get(chArray[i]) + 1);
                    } while (chArray[i++] != lch || i == pattern_length-1);
                    // Смещаем массив chArray влево
                    for (int j = i; j < pattern_length; j++) {
                        chArray[j-i] = chArray[j];
                    }
                    // Мы убрали i символов
                    current_length -= i;
                    // Добавляем текущий
                    current_available.put(lch, current_available.get(lch) - 1);
                    chArray[current_length] = lch;
                    // Проверяем длину и возвращаем успешно составленную анаграмму
                    current_length++;
                    if (current_length == pattern_length) {
                        return new String(chArray);
                    }
                }
            }
            // Если такой буквы нет в доступных начинаем заново
            else if (Character.isAlphabetic(ch)) {
                // Перезаписываем переменные
                current_available = new HashMap<>(available);
                chArray = new char[pattern_length];
                current_length = 0;
            }
        }
        return "notfound!";
    }

    // Задание №2
    // Функция возвращает срезы длины n в алфавитном порядке (рекурсивно)

    //  Используем ArrayList для добавления следующих срезов, вызывая функцию
    //рекурсивно. Для сортировки используем Collections.sort().
    //  Преобразовываем в массив и возвращаем
    public static String[] collect(String input, int n) {
        ArrayList<String> slices = new ArrayList<>();
        // Для добавления необходима строка больше или равной длины среза n
        if (input.length() >= n) {
            slices.add(input.substring(0, n));
            for (String elem : collect(input.substring(n), n)) {
                slices.add(elem);
            }
            Collections.sort(slices);
            return slices.toArray(new String[slices.size()]);
        }
        else {
            return new String[0];
        }
    }

    // Задание №3
    // Функция, закодирующая строку в шифр Nico

    public static String nicoCipher(String input, String key) {
        // Пока длина строки не будет кратна длине ключа, добавляем пробелы
        while (input.length() % key.length() != 0) {
            input = input + ' ';
        }
        // Создаём key.length() массивов длины input.length()/key.length()+1
        //Где первый элемент будет равен символу ключа, а остальные -
        //принадлежащие ему столбцы.
        char[][] table = new char[key.length()][input.length()/key.length()+1];
        for (int i = 0; i < key.length(); i++) {
            table[i][0] = key.charAt(i);
        }
        for (int i = 0; i < input.length(); i++) {
            table[i%key.length()][i/key.length()+1] = input.charAt(i);
        }
        // Сортируем по первому символу массивы
        Arrays.sort(table, (a, b) -> Integer.compare(a[0], b[0]));
        // Перестраиваем строку
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(table[i%key.length()][i/key.length()+1]);
        }
        return sb.toString();
    }

    // Задание №4
    // Создайте метод, который принимает массив arr и число n и возвращает массив из двух целых чисел из arr, 
    //произведение которых равно числу n следующего вида: [value_at_lower_index, value_at_higher_index]

    public static int[] twoProduct(int[] nums, int n) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i]*nums[j] == n) {
                    return new int[]{nums[j], nums[i]};
                }
            }
        }
        return new int[0];
    }

    // Задание №5
    // Создайте рекурсивную функцию, которая проверяет, является ли число точной верхней границей факториала n.

    // Создаём функцию для второго аргумента - числа n, на которое делим num. Если успешно делится и остаётся 1
    //возвращаем n и затем возвращаем массив.
    public static int[] isExact(int num) {
        int n = isExactLoop(num, 1);
        if (n != -1) {
            return new int[]{num, n};
        }
        return new int[0];
    }
    public static int isExactLoop(int num, int n) {
        if (num <= 0 || num%n != 0) {
            return -1;
        }
        if (num/n == 1) {
            return n;
        }
        return isExactLoop(num/n, n+1);
    }

    // Задание №6
    // Преобразование бесконечно повторяющейся дроби

    // Наибольший общий делитель
    private static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public static String fractions(String num) {
        String[] parts = num.split("\\.\\(|\\.|\\(|\\)");
        if (parts.length == 3) {
            // Целая часть
            int i = Integer.parseInt(parts[0]);
            // Дробная часть
            int dp = Integer.parseInt(parts[1]);// Для подсчёта кол-ва 0 в делителе
            // Периодическая часть
            int p = Integer.parseInt(parts[2]); // Для подсчёта кол-ва 9 в делителе
            // Подсчёт знаменателя
            int denom = Integer.parseInt(parts[1] + parts[2]) - dp;
            // Подсчёт делителя
            int divisor = 0;
            while (p != 0) {
                divisor *= 10;
                divisor += 9;
                p /= 10;
            }
            while (dp != 0) {
                divisor *= 10;
                dp /= 10;
            }
            denom = denom + i*divisor;
            // Деление на наибольший общий делитель
            int gcd = gcd(denom, divisor);
            denom /= gcd;
            divisor /= gcd;
            return String.valueOf(denom) + '/' + String.valueOf(divisor);
        }
        else if (parts.length == 2) {
            // Целая часть
            int i = Integer.parseInt(parts[0]);
            // Периодическая часть
            int p = Integer.parseInt(parts[1]); // Для подсчёта кол-ва 9 в делителе
            int denom = p;
            // Подсчёт делителя
            int divisor = 0;
            while (p != 0) {
                divisor *= 10;
                divisor += 9;
                p /= 10;
            }
            // Подсчёт знаменателя
            denom = denom + i*divisor;
            // Деление на наибольший общий делитель
            int gcd = gcd(denom, divisor);
            denom /= gcd;
            divisor /= gcd;
            return String.valueOf(denom) + '/' + String.valueOf(divisor);
        }
        return "not a periodic fraction: " + String.valueOf(num);
    }

    // Задание №7
    // Преобразовать строку в серию слов, где каждое имеет длину цифры числа Пи

    // Проходим циклично, добавляя подстроки длиной текущей цифры. Обрабатываем случаи, когда не осталось символов и
    //возвращаем полученное значение.
    public static String pilish_string(String input) {
        StringBuilder sb = new StringBuilder(); // Для создания строки
        String pi = "314159265358979";
        int i = 0; // Позиция в строке input
        int j = 0; // Позиция в строке pi
        // Цикл для передвижения по строке input
        while (true) {
            int current_digit = Character.getNumericValue(pi.charAt(j));
            int remaining = input.length() - i;
            // В случае если не хватает строки input повторяем последний символ
            if (current_digit > remaining) {
                while (i < input.length()) {
                    sb.append(input.charAt(i));
                    i++;
                };
                if (i != 0) {
                    for (int k = 0; k < current_digit - remaining; k++) {
                        sb.append(input.charAt(i-1));
                    }
                }
                // Возвращаем получившуюся строку
                return sb.toString();
            }
            // В противном случае, просто добавляем k=current_digit символов строки input
            else {
                for (int k = 0; k < current_digit; k++) {
                    sb.append(input.charAt(i+k));
                }
                i += current_digit;
                // Если больше не осталось символов, возвращаем
                if (i == input.length()) {
                    return sb.toString();
                }
                j += 1;
            }
            sb.append(' ');
        }
    }

    // Задание №8
    // Сгенерировать все непоследовательные двоичные строки размером n
    // Например: 0 1; 00 01 10; 000 001 010 100 101;

    // Начинаем со строки длиной n, со всеми нулями (0; 00; 000; 0000)
    // Добавляем по единице на каждое место, запоминаем эти записи (origin_entries). К ним также добавляем
    //по единице на каждое доступное место. Так проделываем пока не получим все записи.
    // Например 000 -> 001 010 100 -> 101; 0000 -> 0001 0010 0100 1000 -> 0101 1001 1010.

    // Класс для работы с двоичными строками этого задания
    private static class Nonconsecutive {
        private int n; // Размер строк
        private StringBuilder sb = new StringBuilder(); // Для построения строки на вывод
        private ArrayList<String> origin_entries = new ArrayList<>();  // Для хранения просмотренных строк
        private ArrayList<String> new_entries = new ArrayList<>(); // Для хранения новых строк

        Nonconsecutive(int n) {
            this.n = n;
        }

        // Вставляет в origin_entry единицу на индекс i и записывает результат в new_entries
        private void createNewEntry(String origin_entry, int i) {
            StringBuilder new_entry = new StringBuilder(origin_entry);
            new_entry.setCharAt(i, '1');
            String new_entry_s = new_entry.toString();
            if (!new_entries.contains(new_entry_s)) {
                sb.append(' ');
                sb.append(new_entry_s);
                new_entries.add(new_entry_s);
            }
        }

        // Метод вычисляет все возможные записи
        public String calculate() {
            // Сначала заполняем нулями
            StringBuilder first = new StringBuilder();
            for (int i = 0; i < n; i++) {
                first.append('0');
            }
            // Добавляем нулевую строку 
            origin_entries.add(first.toString());
            sb.append(first.toString());
            // Теперь рассматриваем все возможные строки путём добавления единиц в
            //строки, расмотренные в предыдущем этапе "00" -> "01", "10"
            // Максимум единиц в записи может быть n+1/2
            for (int j = 0; j < n+1/2; j++) {
                // Для строк размером больше 1 рассматриваем несколько вариантов, куда можно вставить единицу
                if (n > 1) {
                    // Для каждой записи из origin_entries пытаемся вставить единицу
                    for (String entry : origin_entries) {
                        // Пробуем добавить с конца в начало
                        if (entry.charAt(n-1) == '0' && entry.charAt(n-2) == '0') {
                            createNewEntry(entry, n-1);
                        }
                        // В середину
                        if (n > 2) {
                            for (int k = n-2; k > 1; k--) {
                                if (entry.charAt(k+1) == '0' && entry.charAt(k) == '0' && entry.charAt(k-1) == '0') {
                                    createNewEntry(entry, k);
                                }
                            }
                        }
                        // В самое начало
                        if (entry.charAt(0) == '0' && entry.charAt(1) == '0') {
                            createNewEntry(entry, 0);
                        }
                    }
                    // Когда добавили единицы ко всем записям origin_entries, теперь меняем на new_entries
                    origin_entries = new ArrayList<>(new_entries);
                }
                // Для строк размером 1, просто добавляем ещё одну запись
                else {
                    origin_entries.add("1");
                    sb.append(" 1");
                }
            }
            return sb.toString();
        }
    }
    // Вызываем
    public static String generateNonconsecutive(int n) {
        Nonconsecutive entries = new Nonconsecutive(n);
        return entries.calculate();
    }

    // Задание №9
    // Необходимо, чтобы символы строки встречались равное количество раз за исключением того случая, когда условие
    //выполнится, если убрать любой 1 символ.

    // Для удовлетворения условия, необходимо, чтобы было одно частовстречающееся количество (n) и возможен 1 вид 
    //символа, который будет встречаться 1 раз или n+1 раз. В таком случае его можно будет убрать и будет равное
    //кол-во видов символов
    public static String isValid(String input) {
        // Для каждого символа записываем, сколько раз он встречается.
        HashMap<Character, Integer> quantity = new HashMap<>();
        for (Character ch : input.toCharArray()) {
            if (quantity.containsKey(ch)) {
                quantity.put(ch, quantity.get(ch) + 1);
            }
            else {
                quantity.put(ch, 1);
            }
        }
        // Для каждого количества вида символа записываем, сколько раз оно встречается.
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (Integer q : quantity.values()) {
            if (frequency.containsKey(q)) {
                frequency.put(q, frequency.get(q) + 1);
            }
            else {
                frequency.put(q, 1);
            }
        }
        // Проверяем не может быть больше двух видов количеств и один из видов должен встречаться 1 или n+1 раз.
        if (frequency.keySet().size() == 1) {
            return "YES";
        }
        if (frequency.keySet().size() == 2) {
            Integer[] entries = frequency.keySet().toArray(new Integer[2]);
            Integer[] values = frequency.values().toArray(new Integer[2]);
            // В случае, когда количество values[0] более часто встречается, а количество values[1] встречается с 
            //частотой 1, а значение entries[1] 1 или n+1 раз.
            if (values[0] > values[1] && values[1] == 1 && (entries[1] == 1 || entries[1] == entries[0]+1)) {
                return "YES";
            }
            // В противном, аналогичном случае
            if (values[1] > values[0] && values[0] == 1 && (entries[0] == 1 || entries[0] == entries[1]+1)) {
                return "YES";
            }
        }
        return "NO";
    }

    // Задание №10
    // Возвратить массивы пар, суммирующихся до восьми

    // Циклично проходим сначала массива в конец, вторым циклом рассматриваем предыдущие значения и записываем пары,
    //(текущее + предыдущее) если они суммируются до 8.
    public static int[][] sumsUp(int[] nums) {
        ArrayList<int[]> pairs = new ArrayList<>(nums.length-1); 
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] + nums[j] == 8) {
                    if (nums[i] > nums[j]) {
                        pairs.add(new int[]{nums[j], nums[i]});
                    }
                    else {
                        pairs.add(new int[]{nums[i], nums[j]});
                    }
                }
            }
        }
        return pairs.toArray(new int[pairs.size()][2]);
    }
}
