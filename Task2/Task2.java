public class Task2{
    public static void main(String[] args) {
        System.out.printf("%n ---Part 1--- %n");
        System.out.printf("oppositeHouse(1,  3) -> %d %n", oppositeHouse(1, 3));
        System.out.printf("oppositeHouse(2,  3) -> %d %n", oppositeHouse(2, 3));
        System.out.printf("oppositeHouse(3,  5) -> %d %n", oppositeHouse(3, 5));
        System.out.printf("oppositeHouse(5, 46) -> %d %n", oppositeHouse(5, 46));

        System.out.printf("%n ---Part 2--- %n");
        System.out.printf("nameShuffle(   \"Donald Trump\") -> %s %n", nameShuffle("Donald Trump"));
        System.out.printf("nameShuffle(\"Rosie O'Donnell\") -> %s %n", nameShuffle("Rosie O'Donnell"));
        System.out.printf("nameShuffle(  \"Seymour Butts\") -> %s %n", nameShuffle("Seymour Butts"));

        System.out.printf("%n ---Part 3--- %n");
        System.out.printf("discount(1500, 50) -> %.2f %n", discount(1500, 50));
        System.out.printf("discount(89,   20) -> %.2f %n", discount(89, 20));
        System.out.printf("discount(100,  75) -> %.2f %n", discount(100, 75));

        System.out.printf("%n ---Part 4--- %n");
        System.out.printf("differenceMaxMin({10, 4, 1, 4, -10, -50, 32, 21}) -> %d %n", differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.printf("differenceMaxMin({44, 32, 86, 19})                -> %d %n", differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.printf("%n ---Part 5--- %n");
        System.out.printf("equal(3, 4, 3) -> %d %n", equal(3, 4, 3));
        System.out.printf("equal(1, 1, 1) -> %d %n", equal(1, 1, 1));
        System.out.printf("equal(3, 4, 1) -> %d %n", equal(3, 4, 1));

        System.out.printf("%n ---Part 6--- %n");
        System.out.printf("reverse(\"Hello World\")               -> %s %n", reverse("Hello World"));
        System.out.printf("reverse(\"The quick brown fox.\")      -> %s %n", reverse("The quick brown fox."));
        System.out.printf("reverse(\"Edabit is really helpful!\") -> %s %n", reverse("Edabit is really helpful!"));

        System.out.printf("%n ---Part 7--- %n");
        System.out.printf("programmers(147, 33, 526) -> %s %n", programmers(147, 33, 526));
        System.out.printf("programmers(33, 72, 74)   -> %s %n", programmers(33, 72, 74));
        System.out.printf("programmers(1, 5, 9)      -> %s %n", programmers(1, 5, 9));

        System.out.printf("%n ---Part 8--- %n");
        System.out.printf("getXO(\"ooxx\")    -> %b %n", getXO("ooxx"));
        System.out.printf("getXO(\"xooxx\")   -> %b %n", getXO("xooxx"));
        System.out.printf("getXO(\"ooxXm\")   -> %b %n", getXO("ooxXm"));
        System.out.printf("getXO(\"zpzpzpp\") -> %b %n", getXO("zpzpzpp"));
        System.out.printf("getXO(\"zzoo\")    -> %b %n", getXO("zzoo"));

        System.out.printf("%n ---Part 9--- %n");
        System.out.printf("bomb(\"Здесь бомба.\")                   -> %s %n", bomb("Здесь бомба."));
        System.out.printf("bomb(\"Как думаешь, здесь есть БОМБА?\") -> %s %n", bomb("Как думаешь, здесь есть БОМБА?"));
        System.out.printf("bomb(\"Любая другая строка.\")           -> %s %n", bomb("Любая другая строка."));

        System.out.printf("%n ---Part 10--- %n");
        System.out.printf("sameAscii(\"a\", \"a\")           -> %b %n", sameAscii("a", "a"));
        System.out.printf("sameAscii(\"AA\", \"B@\")         -> %b %n", sameAscii("AA", "B@"));
        System.out.printf("sameAscii(\"EdAbIt\", \"EDABIT\") -> %b %n", sameAscii("EdAbIt", "EDABIT"));
    }

    // Задание №1
    // Теша шел по прямой улице, по обеим сторонам которой стояло ровно n одинаковых домов. 
    // Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева. (5 3 1) (2 4 6)
    // Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер дома на противоположной стороне.

    // Если номер дома нечётный, то вычитаем из последнего чётного номера (удвоенная длина улицы lenght) номер нечётного + 1 (num + 1)
    // Если номер дома чётный, то к удвоенной разнице длины улицы (lenght) и половины чётного номера (num/2) прибавляем 1
    public static int oppositeHouse(int num, int lenght) {
        if (num % 2 != 0) {
            return (lenght*2 - num +1);
        }
        else {
            return (2*(lenght - num/2) + 1);
        }
    }

    // Задание №2
    // Создайте метод, который принимает строку (имя и фамилию человека) и возвращает строку с заменой имени и фамилии.

    // Используем StringBuilder для эффективной конкантенации строк
    // Используем цикл for, чтобы конкантенировать слова в обратном порядке
    public static String nameShuffle(String s) {
        String[] name = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = name.length - 1; i >= 0; i--) {
            result.append(name[i]);
            if (i != 0) // В конце пробел не ставим
                result.append(' ');
        }
        return result.toString();
    }

    // Задание №3
    // Создайте функцию, которая принимает два аргумента: исходную цену и процент скидки в виде целых чисел и возвращает конечную цену после скидки.

    // Явно преобразовываем целочисленные значения цены и скидки, вычисляем цену после скидки
    public static double discount(int price, int dc) {
        return (double)price - (double)dc * price / 100.0d;
    }

    // Задание №4
    // Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.

    // С помощью цикла проходим через все элементы массива и ищем максимум и минимум
    public static int differenceMaxMin(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int elem : nums) {
            if (elem > max)
                max = elem;
            if (elem < min)
                min = elem;
        }
        return max-min;
    }

    // Задание №5
    // Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и возвращает количество целых чисел, имеющих одинаковое значение.

    // Сравниваем аргументы, в зависимости от результатов сравнения возвращаем количество одинаковых
    public static int equal(int n1, int n2, int n3) {
        if (n1 == n2 && n2 == n3) // Проверка на совпадение трёх аргументов
            return 3;
        if (n1 == n2 || n2 == n3 || n1 == n3) // Проверка совпали ли хотя бы 2 аргумента
            return 2;
        return 0;
    }

    // Задание №6
    // Создайте метод, который принимает строку в качестве аргумента и возвращает ее в обратном порядке.

    // Используем StringBuilder для эффективной конкантенации символов
    // Используем цикл for, чтобы конкантенировать символы строки в обратном порядке
    public static String reverse(String s){
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    // Задание №7
    // Вы наняли трех программистов и (надеюсь) платите им. 
    // Создайте функцию, которая принимает три числа (почасовая заработная плата каждого программиста) 
    // и возвращает разницу между самым высокооплачиваемым программистом и самым низкооплачиваемым.

    // Ищем минимум и максимум, возвращаем разницу
    public static int programmers(int n1, int n2, int n3) {
        int max = n1;
        int min = n1;
        if (n2 < min)
            min = n2;
        if (n2 > max)
            max = n2;
        if (n3 < min)
            min = n3;
        if (n3 > max)
            max = n3;
        return max - min;
    }

    // Задание №8
    // Создайте функцию, которая принимает строку, проверяет, 
    // имеет ли она одинаковое количество x и o и возвращает либо true, либо false.

    // С помощью цикла посимвольно рассматриваем строку, если нужный символ увеличиваем
    // соотвествующий счётчик
    public static boolean getXO(String s) {
        int count_x = 0;
        int count_o = 0;
        for (int i = 0; i < s.length(); i++ ) {
            if (Character.toLowerCase(s.charAt(i)) == 'x') // Невосприимчивость к 
                count_x++;
            if (s.charAt(i) == 'o')
                count_o++;
        }
        return (count_x == count_o);
    }

    // Задание №9
    // Напишите функцию, которая находит слово "бомба" в данной строке. 
    // Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".

    // С помощью цикла проверяем все подстроки длины слова на совпадение с нужным словом (бомба)
    public static String bomb(String s) {
        final String to_find = "бомба".toLowerCase();
        int word_lenght = to_find.length();
        int i = 0; // Для прохода по строке
        int j = 0; // Для прохода по подстроке
        while (i < s.length()) {
            if (Character.toLowerCase(s.charAt(i)) == to_find.charAt(j)) {
                i += 1;
                j += 1;
                if (j >= word_lenght)
                    return "ПРИГНИСЬ!";
            }
            else {
                i += 1;
                j = 0;
            }
                
        }
        return "Расслабься, бомбы нет";
    }

    // Задание №10
    // Возвращает true, если сумма значений ASCII первой строки совпадает с суммой 
    // значений ASCII второй строки, в противном случае возвращает false.

    // С помощью циклов считаем суммы значений ASCII
    public static boolean sameAscii(String s1, String s2) {
        int sum1 = 0;
        int sum2 = 0;
        // Используем toCharArray, чтобы преобразовывать символы в код Ascii
        for (char c : s1.toCharArray()) {
            sum1 += (int)c;
        }
        for (char c : s2.toCharArray()) {
            sum2 += (int)c;
        }
        return (sum1 == sum2);
    }
}