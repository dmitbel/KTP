import java.util.Arrays;

class Task3 {
    public static void main(String[] args) {
        System.out.printf("%n ---Part 1--- %n");
        Object[][] cities;
        cities = new Object[][]{
            {"Nice", 942208},{"Abu Dhabi", 1482816},
            {"Naples", 2186853},{"Vatican City", 572}};
        System.out.printf("millionsRounding([[\"Nice\", 942208],[\"Abu Dhabi\", 1482816],[\"Naples\", 2186853],[\"Vatican City\", 572]])%n -> %s%n", 
            Arrays.deepToString(millionsRounding(cities)));
        cities = new Object[][]{
            {"Manila", 13923452},{"Kuala Lumpur", 7996830},{"Jakarta", 10770487}};
        System.out.printf("millionsRounding([[\"Manila\", 13923452],[\"Kuala Lumpur\", 7996830],[\"Jakarta\", 10770487]])%n -> %s%n", 
            Arrays.deepToString(millionsRounding(cities)));

        System.out.printf("%n ---Part 2--- %n");
        System.out.printf("otherSides( 1) -> %s%n", Arrays.toString(otherSides(1)));
        System.out.printf("otherSides(12) -> %s%n", Arrays.toString(otherSides(12)));
        System.out.printf("otherSides( 2) -> %s%n", Arrays.toString(otherSides(2)));
        System.out.printf("otherSides( 3) -> %s%n", Arrays.toString(otherSides(3)));

        System.out.printf("%n ---Part 3--- %n");
        System.out.printf("rps(\"камень\", \"бумага\")   -> %s%n", rps("камень","бумага"));
        System.out.printf("rps(\"бумага\", \"камень\")   -> %s%n", rps("бумага","камень"));
        System.out.printf("rps(\"бумага\", \"ножницы\")  -> %s%n", rps("бумага","ножницы"));
        System.out.printf("rps(\"ножницы\", \"ножницы\") -> %s%n", rps("ножницы","ножницы"));
        System.out.printf("rps(\"ножницы\", \"бумага\")  -> %s%n", rps("ножницы","бумага"));

        System.out.printf("%n ---Part 4--- %n");
        System.out.printf("warOfNumbers([2, 8, 7, 5])                              -> %d%n", warOfNumbers(new int[]{2,8,7,5}));
        System.out.printf("warOfNumbers([12, 90, 75])                              -> %d%n", warOfNumbers(new int[]{12, 90, 75}));
        System.out.printf("warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) -> %d%n", warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));

        System.out.printf("%n ---Part 5--- %n");
        System.out.printf("reverseCase(\"Happy Birthday\") -> %s%n", reverseCase("Happy Birthday"));
        System.out.printf("reverseCase(\"many thanks\")    -> %s%n", reverseCase("many thanks"));
        System.out.printf("reverseCase(\"SpOnTaNeOuS\")    -> %s%n", reverseCase("SpOnTaNeOuS"));

        System.out.printf("%n ---Part 6--- %n");
        System.out.printf("inatorInator(\"Shrink\") -> %s%n", inatorInator("Shrink"));
        System.out.printf("inatorInator(\"Doom\") -> %s%n", inatorInator("Doom"));
        System.out.printf("inatorInator(\"EvilClone\") -> %s%n", inatorInator("EvilClone"));

        System.out.printf("%n ---Part 7--- %n");
        System.out.printf("doesBrickFit(1, 1, 1, 1, 1) -> %b%n", doesBrickFit(1, 1, 1, 1, 1));
        System.out.printf("doesBrickFit(1, 2, 1, 1, 1) -> %b%n", doesBrickFit(1, 2, 1, 1, 1));
        System.out.printf("doesBrickFit(1, 2, 2, 1, 1) -> %b%n", doesBrickFit(1, 2, 2, 1, 1));

        System.out.printf("%n ---Part 8--- %n");
        System.out.printf("totalDistance(70.0, 7.0, 0, false) -> %.2f%n", totalDistance(70.0, 7.0, 0, false));
        System.out.printf("totalDistance(36.1, 8.6, 3, true)  -> %.2f%n", totalDistance(36.1, 8.6, 3, true));
        System.out.printf("totalDistance(55.5, 5.5, 5, false) -> %.2f%n", totalDistance(55.5, 5.5, 5, false));

        System.out.printf("%n ---Part 9--- %n");
        System.out.printf("mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) -> %.2f%n", mean(new int[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.printf("mean([2, 3, 2, 3])                      -> %.2f%n", mean(new int[]{2, 3, 2, 3}));
        System.out.printf("mean([3, 3, 3, 3, 3])                   -> %.2f%n", mean(new int[]{3, 3, 3, 3, 3}));

        System.out.printf("%n ---Part 10--- %n");
        System.out.printf("parityAnalysis(243) -> %b%n", parityAnalysis(243));
        System.out.printf("parityAnalysis(12)  -> %b%n", parityAnalysis(12));
        System.out.printf("parityAnalysis(3)   -> %b%n", parityAnalysis(3));
    }

    // Задание №1
    // Учитывая массив городов и населения, верните массив, в котором все население округлено до 
    // ближайшего миллиона.

    // Округляем целую часть от деления на миллион и умножаем на миллион
    public static Object[][] millionsRounding(Object[][] cities) {
        for (int i = 0; i < cities.length; i++) {
            cities[i][1] = (int)Math.round((double)(int)cities[i][1]/1_000_000d)*1_000_000;
        }
        return cities;
    }

    // Задание №2
    // Учитывая самую короткую сторону треугольника 30° на 60° на 90°, 
    // вы должны найти другие 2 стороны (верните самую длинную сторону, сторону средней длины).

    // Преобразовываем, вычисляем, возвращаем.
    public static double[] otherSides(int side0) {
        double side1 = Math.round((double)side0*Math.sqrt(3d)*100d)/100d;
        double side2 = (double)side0*2;
        return new double[]{side1, side2};
    }

    // Задание №3
    // Создайте функцию, имитирующую игру "камень, ножницы, бумага". Функция принимает 
    //входные данные обоих игроков (камень, ножницы или бумага), первый параметр от 
    //первого игрока, второй от второго игрока. Функция возвращает результат как таковой:
    //"Игрок 1 выигрывает", "Игрок 2 выигрывает", "Ничья".

    // С помощью if проверяем возможные варианты
    public static String rps(String c1, String c2) {
        if (c1.equals(c2))
            return "Ничья";
        // У первого игрока камень
        if (c1.toLowerCase().equals("камень")) {
            if (c2.toLowerCase().equals("бумага"))
                return "Игрок 2 выиграл";
            return "Игрок 1 выиграл";
        }
        // У первого игрока бумага
        if (c1.toLowerCase().equals("бумага")) {
            if (c2.toLowerCase().equals("ножницы"))
                return "Игрок 2 выиграл";
            return "Игрок 1 выиграл";
        }
        // У первого игрока ножницы
        if (c1.toLowerCase().equals("ножницы")) {
            if (c2.toLowerCase().equals("камень"))
                return "Игрок 2 выиграл";
            return "Игрок 1 выиграл";
        }
        return "Неверный ввод";
    }

    // Задание №4
    // Создайте функцию, которая берет массив целых чисел, суммирует четные и нечетные числа отдельно, 
    // а затем возвращает разницу между суммой четных и нечетных чисел.

    // Подсчитываем суммы чётных и нечётных чисел, возвращает модуль от разницы
    public static int warOfNumbers(int[] nums) {
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                sum_even += nums[i];
            else
                sum_odd += nums[i];
        }
        return Math.abs(sum_even - sum_odd);
    }

    // Задание №5
    // Учитывая строку, создайте функцию для обратного обращения. 
    // Все буквы в нижнем регистре должны быть прописными, и наоборот.

    // Посимвольно проверяем регистр и добавляем в StringBuilder с обратным регистром
    public static String reverseCase(String s) {
        StringBuilder s_caseReversed = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                s_caseReversed.append(Character.toUpperCase(c));
            else
                s_caseReversed.append(Character.toLowerCase(c));
        }
        return s_caseReversed.toString();
    }

    // Задание №6
    // Создайте функцию, которая принимает строку из одного слова и выполняет следующие действия:
    // Конкатенирует inator до конца, если слово заканчивается согласным, в противном случае вместо него конкатенирует  -inator
    // Добавляет длину слова исходного слова в конец, снабженный '000'.

    // В зависимости от последнего символа конкантенируем нужную строку с помощью оператора switch, 
    // затем преобразовываем длину изначальной строки в строку и конкантенируем, затем конкантенируем "000"
    public static String inatorInator(String s) {
        int s_length = s.length();
        StringBuilder s_inator = new StringBuilder(s);
        switch (Character.toLowerCase(s.charAt(s_length-1))) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y': s_inator.append("-inator ");
                break;
            default: s_inator.append("inator ");
        }
        s_inator.append(String.valueOf(s_length)).append("000");
        return s_inator.toString();
    }

    // Задание №7
    // Напишите функцию, которая принимает три измерения кирпича: высоту(a), ширину(b) и глубину(c) 
    // и возвращает true, если этот кирпич может поместиться в отверстие с шириной(w) и высотой(h).

    // Проверяем на совпадение площади отверстия с площадями сторон кирпича
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (a*b == w*h || a*c == w*h || b*c == w*h);
    }

    // Задание №8
    // Напишите функцию, которая принимает топливо (литры), расход топлива (литры/100 км), пассажиров, 
    // кондиционер (логическое значение) и возвращает максимальное расстояние, которое может проехать автомобиль.

    // Вычисляем, в зависимости от входных параметров изменяем потребление.
    public static double totalDistance(double petrol, double base_consumption, int passengers, boolean conditioner) {
        double consumption = base_consumption;
        for (int i = 0; i < passengers; i++)
            consumption += 0.05*base_consumption;
        if (conditioner)
            consumption += 0.1*consumption;
        return petrol/consumption*100;
    }

    // Задание №9
    // Создайте функцию, которая принимает массив чисел и возвращает среднее значение (average) всех этих чисел.

    // Вычисляем сумму, делим на длину массива.
    public static double mean(int[] nums) {
        double sum = 0d;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        return sum / nums.length;
    }

    // Задание №10
    // Создайте функцию, которая принимает число в качестве входных данных и возвращает true, 
    // если сумма его цифр имеет ту же четность, что и все число. В противном случае верните false.

    // Вычисляем сумму цифр, сравниваем результаты остатка от деления на 2
    public static boolean parityAnalysis(int num) {
        int sum_digits = 0;
        int num_digits = num;
        while (num_digits > 0) {
            sum_digits += num_digits % 10;
            num_digits = num_digits / 10;
        }
        return (num % 2 == sum_digits % 2);
    }