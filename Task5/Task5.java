import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task5 {
    public static void main(String[] args) {
        System.out.printf("%n ---Part 1--- %n");
        System.out.printf("sameLetterPattern(\"ABAB\", \"CDCD\")   -> %b %n", sameLetterPattern("ABAB", "CDCD"));
        System.out.printf("sameLetterPattern(\"ABCBA\", \"BCDCB\") -> %b %n", sameLetterPattern("ABCBA", "BCDCB"));
        System.out.printf("sameLetterPattern(\"FFGG\", \"CDCD\")   -> %b %n", sameLetterPattern("FFGG", "CDCD"));
        System.out.printf("sameLetterPattern(\"FFFF\", \"ABCD\")   -> %b %n", sameLetterPattern("FFFF", "ABCD"));

        System.out.printf("%n ---Part 2--- %n");
        System.out.printf("spiderVsFly(\"H3\", \"E2\") -> %s %n", spiderVsFly("H3", "E2"));
        System.out.printf("spiderVsFly(\"A4\", \"B2\") -> %s %n", spiderVsFly("A4", "B2"));
        System.out.printf("spiderVsFly(\"A4\", \"C2\") -> %s %n", spiderVsFly("A4", "C2"));

        System.out.printf("%n ---Part 3--- %n");
        System.out.printf("digitsCount(4666)           -> %d %n", digitsCount(4666));
        System.out.printf("digitsCount(544)            -> %d %n", digitsCount(544));
        System.out.printf("digitsCount(121317)         -> %d %n", digitsCount(121317));
        System.out.printf("digitsCount(0)              -> %d %n", digitsCount(0));
        System.out.printf("digitsCount(12345)          -> %d %n", digitsCount(12345));
        System.out.printf("digitsCount(1289396387328L) -> %d %n", digitsCount(1289396387328L));

        System.out.printf("%n ---Part 4--- %n");
        System.out.printf("totalPoints([\"cat\", \"create\", \"sat\"],\"caster\") -> %d %n", totalPoints(new String[]{"cat", "create", "sat"}, "caster"));
        System.out.printf("totalPoints([\"trance\", \"recant\"], \"recant\")    -> %d %n", totalPoints(new String[]{"trance", "recant"}, "recant"));
        System.out.printf("totalPoints([\"dote\", \"dotes\", \"toes\", \"set\", \"dot\", \"dots\", \"sted\"],\"tossed\") -> %d %n", 
            totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));

        System.out.printf("%n ---Part 5--- %n");
        System.out.printf("longestRun([1, 2, 3, 5, 6, 7, 8, 9]) -> %d %n", longestRun(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.printf("longestRun([1, 2, 3, 10, 11, 15])    -> %d %n", longestRun(new int[]{1, 2, 3, 10, 11, 15}));
        System.out.printf("longestRun([5, 4, 2, 1])             -> %d %n", longestRun(new int[]{5, 4, 2, 1}));
        System.out.printf("longestRun([3, 5, 7, 10, 15])        -> %d %n", longestRun(new int[]{3, 5, 7, 10, 15}));
        
        System.out.printf("%n ---Part 6--- %n");
        System.out.printf("takeDownAverage([\"95%%\", \"83%%\", \"90%%\", \"87%%\", \"88%%\", \"93%%\"]) -> %s %n", 
            takeDownAverage(new String[]{"95%", "83%", "90%", "87%", "88%", "93%"}));
        System.out.printf("takeDownAverage([\"10%%\"]) -> %s %n", takeDownAverage(new String[]{"10%"}));
        System.out.printf("takeDownAverage([\"53%%\", \"79%%\"]) -> %s %n", takeDownAverage(new String[]{"53%", "79%"}));
        
        System.out.printf("%n ---Part 7--- %n");
        System.out.printf("rearrange(\"Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.\")          -> %s %n", 
            rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s."));
        System.out.printf("rearrange(\"the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!\") -> %s %n", 
            rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!"));
        System.out.printf("rearrange(\"4of Fo1r pe6ople g3ood th5e the2\")                  -> %s %n", 
            rearrange("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.printf("rearrange(\"is2 Thi1s T4est 3a\") -> %s %n", rearrange("is2 Thi1s T4est 3a"));
        System.out.printf("rearrange(\" \")                  -> %s %n", rearrange(" "));

        System.out.printf("%n ---Part 8--- %n");
        System.out.printf("maxPossible(9328, 456)   -> %d %n", maxPossible(9328, 456));
        System.out.printf("maxPossible(523, 76)     -> %d %n", maxPossible(523, 76));
        System.out.printf("maxPossible(9132, 5564)  -> %d %n", maxPossible(9132, 5564));
        System.out.printf("maxPossible(8732, 91255) -> %d %n", maxPossible(8732, 91255));

        System.out.printf("%n ---Part 9--- %n");
        System.out.printf("timeDifference(\"Los Angeles\", \"April 1, 2011 23:23\", \"Canberra\") -> %s %n", 
            timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
        System.out.printf("timeDifference(\"London\", \"July 31, 1983 23:01\", \"Rome\")          -> %s %n", 
            timeDifference("London", "July 31, 1983 23:01", "Rome"));
        System.out.printf("timeDifference(\"New York\", \"December 31, 1970 13:40\", \"Beijing\") -> %s %n", 
            timeDifference("New York", "December 31, 1970 13:40", "Beijing"));

        System.out.printf("%n ---Part 10--- %n");
        System.out.printf("isNew(3)     -> %b %n", isNew(3));
        System.out.printf("isNew(30)    -> %b %n", isNew(30));
        System.out.printf("isNew(321)   -> %b %n", isNew(321));
        System.out.printf("isNew(123)   -> %b %n", isNew(123));
        System.out.printf("isNew(5604)  -> %b %n", isNew(5604));
        System.out.printf("isNew(904)   -> %b %n", isNew(904));
        System.out.printf("isNew(409)   -> %b %n", isNew(409));
    }

    // Задание №1
    // Cоздайте функцию, которая возвращает true, если две строки имеют один и 
    //тот же буквенный шаблон, и false в противном случае.

    // Используем хэш-таблицу для связей буквенного шаблона - одному виду 
    //символа первой строки может быть поставлен только один вид символа второй
    public static boolean sameLetterPattern(String s1, String s2) {
        // Для хранения связей между символами строк
        Map<Character, Character> connections = new HashMap<Character, Character>();
        // Сначала проверим длину строк
        int length = s1.length();
        if (length == s2.length()) {
            // Проходим циклом по символам первой строки, записываем как ключ,
            //значение символ первой строки и символ второй строки в хэш-таблицу
            for (int i = 0; i < length; i++) {
                char keyChar = s1.charAt(i);
                char valueChar = s2.charAt(i);
                if (connections.containsKey(keyChar)) {
                    if (connections.get(keyChar) != valueChar) {
                        return false;
                    }
                } else {
                    connections.put(keyChar, valueChar);
                }
            }
            return true;
        }
        return false;
    }

    // Задание №2
    // Паутина определяется кольцами, пронумерованными от 0 до 4 от центра, и 
    //радиалами, помеченными по часовой стрелке сверху как A-H. Найти
    //кратчайший (геометрически) путь.

    public static class Spider {
        // Поля для отслеживания начальной и конечной точек
        private char currentRad;
        private int currentLevel;
        private char targetRad;
        private int targetLevel;
        private int currentRadIndex = 0;
        private int targetRadIndex = 0;

        // Поле доступных радиалов
        private final char[] radials = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        // В зависимости от количества радиалов, вычисляем на сколько радиалов
        //нужна разница, чтобы было выгоднее идти через центр паутины
        // Рассматриваем равнобедренный треугольник со сторонами 1 от центра паутины
        private final double beta = (180.-360./radials.length)/2.; // Угол при основании
        private final double base = 2.*Math.cos(beta*Math.PI/180.); // Основание между двумя радиалами
        // На основании угла, нужно рассчитать максимальное смещение индекса
        private int maxDiff = 0;
        {
            double currentDiff = 0;
            while (currentDiff < 2.) {
                maxDiff++;
                currentDiff += base;
            }   
        }         

        // Поле для построения пути
        private StringBuilder path = new StringBuilder();

        // Конструктор инициализирует начальную и конечную точки
        Spider(String start, String target) {
            currentRad = start.charAt(0);
            currentLevel = Character.getNumericValue(start.charAt(1));
            targetRad = target.charAt(0);
            targetLevel = Character.getNumericValue(target.charAt(1));

            // Вычисляем индексы радиалов
            for (int i = 0; i < radials.length; i++) {
                if (currentRad == radials[i]) {
                    currentRadIndex = i;
                }
                if (targetRad == radials[i]) {
                    targetRadIndex = i;
                }
            }
        }
        
        // Для добавления точек в путь
        private void appendPath() {
            path.append('-');
            path.append(currentRad);
            path.append(currentLevel);
        }

        // Для вычисления пути
        public String calculatePath() {
            // Добавляем начальное значение точки на паутине
            path.append(currentRad);
            path.append(currentLevel);    
            // Снижаемся по уровням паутины до уровня цели, т.к. кратчайший путь 
            //не будет идти через верхние части - всегда получается дольше
            while (currentLevel > targetLevel) {
                currentLevel--;
                appendPath();
            }
            // Когда на одном уровне с целью или ниже, нужно посмотреть на сколько
            //радиалов мы смещены от цели. 
            // Если в пределах двух радиалов, то смещаемся на нужный и поднимаемся
            //на верхний уровень, если необходимо
            // Если дальше двух радиалов, то кратчайший путь будет через центр
            //паутины, снижаемся до A0 и поднимаемся по нужному радиалу
            int diffRadIndex = currentRadIndex - targetRadIndex;
            boolean forward = false; // Направление для кратчайшего пути
            // Вычисляем разницу между радиалами (смещение индекса)
            if (diffRadIndex < 0) {
                diffRadIndex = -diffRadIndex;
                forward = true;
            }
            if (diffRadIndex > Math.ceil(radials.length/2.)) {
                diffRadIndex = radials.length - diffRadIndex;
            } 
            // Если мы достаточно далеко 
            if (diffRadIndex >= maxDiff) {
                // По уровням паутины снижаемся до A0
                while (currentLevel > 1) {
                    currentLevel--;
                    appendPath();
                }
                // Центр паутины
                currentLevel--;
                currentRad = radials[0];
                appendPath();
                currentRad = targetRad;
            // Если мы можем развернуться из центра
            } else if (currentLevel == 0) {
                currentRad = targetRad;
            // Если мы близко и можем дойти по радиалам
            } else {
                // Учитываем направление
                if (forward) {
                    do {
                        currentRadIndex++;
                        currentRadIndex %= radials.length;
                        currentRad = radials[currentRadIndex];
                        appendPath();
                    } while (currentRadIndex != targetRadIndex);
                } else {
                    do {
                        currentRadIndex--;
                        if (currentRadIndex < 0) {
                            currentRadIndex = radials.length;
                        }
                        currentRad = radials[currentRadIndex];
                        appendPath();
                    } while (currentRadIndex != targetRadIndex);
                }
            }
            // Последний шаг - поднимаемся до уровня цели, если это требуется
            //(это учитывает вариант, когда начало в A0)
            // Повышаемся по уровням до цели
            while (currentLevel != targetLevel) {
                currentLevel++;
                appendPath();
            };
        return path.toString();
        }
    }

    public static String spiderVsFly(String start, String target) {
        Spider s = new Spider(start, target);
        return s.calculatePath();
    }

    // Задание №3
    // Создайте функцию, которая будет рекурсивно подсчитывать количество цифр 
    //числа. Преобразование числа в строку не допускается, поэтому подход 
    //является рекурсивным.

    // Для рекурсивной функции определяем базовый случай, когда есть однозначное
    //число. Для остальных - рекурсивно вызываем эту функцию с числом без
    // последне
    public static int digitsCount(long num) {
        if (num < 10) {
            return 1;
        } else {
            return digitsCount(num/10) + 1;
        }
    }

    // Задание №4
    // Игроки пытаются набрать очки, формируя слова, используя буквы из 
    //6-буквенного скремблированного слова. Они выигрывают раунд, если им 
    //удается успешно расшифровать слово из 6 букв.
    // Создайте функцию, которая принимает в массив уже угаданных слов 
    //расшифрованное 6-буквенное слово и возвращает общее количество очков, 
    //набранных игроком в определенном раунде 345 = 123, 6 = 54

    // Используем хэш-таблицу для запоминания кол-во букв ответа (загаданного 
    //слова). Копируем таблицу, чтобы использовать при проверке 
    //отгаданного слова на правильность
    public static int totalPoints(String[] words, String answer) {
        // Для отслеживания числа букв
        Map<Character, Integer> letters = new HashMap<Character, Integer>(6);
        for (char c : answer.toCharArray()) {
            if (letters.containsKey(c)) {
                int num = letters.get(c);
                letters.put(c, num + 1);
            } else {
                letters.put(c, 1);
            }
        }
        int totalPoints = 0;
        // Для каждого отгаданного слова
        for (String word : words) {
            // Копируем для использования хэш-таблицу (чтобы не вычислять n раз)
            Map<Character, Integer> copyLetters = new HashMap<Character,Integer>(letters);
            // Проверяем на соотвествие
            boolean valid = true;
            for (char c : word.toCharArray()) {
                if (copyLetters.containsKey(c)) {
                    int num = copyLetters.get(c);
                    if (num == 0) {
                        valid = false;
                        break;
                    } else {
                        copyLetters.put(c, num - 1);
                    }
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                switch(word.length()) {
                    case 3:
                        totalPoints += 1;
                        break;
                    case 4:
                        totalPoints += 2;
                        break;
                    case 5:
                        totalPoints += 3;
                        break;
                    case 6:
                        totalPoints += 54;
                        break;
                    default:
                        break;
                }
            }
        }
        return totalPoints;
    }

    // Последовательный прогон-это список соседних последовательных целых чисел. 
    //Этот список может быть как увеличивающимся, так и уменьшающимся. 
    //Создайте функцию, которая принимает массив чисел и возвращает длину самого 
    //длинного последовательного запуска.

    public static int longestRun(int[] nums) {
        int increasing = 1; // Для отслеживания возрастающих последовательностей
        int descending = 1; // Для - нисходящих
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]-1) {
                increasing += 1;
                if (descending != 1) {
                    max = Math.max(max, descending);
                    descending = 1;
                }
            } else if (nums[i] == nums[i-1]+1) {
                descending += 1;
                if (increasing != 1) {
                    max = Math.max(max, increasing);
                    increasing = 1;
                }
            } else {
                if (increasing != 1) {
                    max = Math.max(max, increasing);
                    increasing = 1;
                }
                if (descending != 1) {
                    max = Math.max(max, descending);
                    descending = 1;
                }
            }
        }
        // Проверяем последний раз
        if (increasing != 1) {
            max = Math.max(max, increasing);
        }
        if (descending != 1) {
            max = Math.max(max, descending);
        }
        return max;
    }

    // Задание №6
    //Какой процент вы можете набрать на тесте, который в одиночку снижает 
    //средний балл по классу на 5%? Учитывая массив оценок ваших одноклассников, 
    //создайте функцию, которая возвращает ответ. Округлите до ближайшего 
    //процента.

    // Преобразуем из строк в числа, вычисляем среднее. По формуле вычисляем
    //нужное значение балла
    public static String takeDownAverage(String[] nums) {
        double sum = 0;
        int size = nums.length;
        for (String percent : nums) {
            // Преобразуем из строки в число
            int currentPercent = Integer.parseInt(percent.substring(0, percent.length()-1));
            sum += currentPercent;
        }
        double avg = sum/size;
        // (sum+n)/(size+1) = avg-5; n = (size+1)*(avg-5)-sum
        StringBuilder n = new StringBuilder();
        n.append((int)((size+1)*(avg-5.)-sum));
        n.append('%');
        return n.toString();
    }

    // Задание №7
    // Учитывая предложение с числами, представляющими расположение слова, 
    //встроенного в каждое слово, верните отсортированное предложение.
    
    // В хэш-таблицу записываем слова со значениями чисел в качестве ключей.
    //Числа извлекаем и получаем чистые слова с помощью метода replaceAll
    public static String rearrange(String s) {
        Map<Integer, String> placement = new HashMap<Integer, String>();
        String[] words = s.split(" ");
        for (String word : words) {
            int i = Integer.parseInt(word.replaceAll("\\D+",""));
            word = word.replaceAll("\\d+","");
            placement.put(i, word);
        }
        StringBuilder sb = new StringBuilder();
        for (String word : placement.values()) {
            sb.append(word);
            sb.append(' ');
        }
        return sb.toString();
    }

    // Задание №8
    // Напишите функцию, которая делает первое число как можно больше, меняя 
    //его цифры на цифры во втором числе

    // Преобразовываем в массивы цифр. Второй массив сортируем.
    //По цифре смотрим первое число и, если возможно и необходимо, 
    //записываем цифру из второго числа
    public static int maxPossible(int n1, int n2) {
        int size1 = digitsCount(n1);
        int size2 = digitsCount(n2);
        int[] n1_array = new int[size1];
        int[] n2_array = new int[size2];
        for (int i = 0; i < size2; i++) {
            n2_array[i] = n2%10;
            n2 = n2/10;
        }
        Arrays.sort(n2_array);
        int maxDigitIndex = size2-1;
        int maxDigit = n2_array[maxDigitIndex];
        for (int i = size1-1; i >= 0; i--) {
            n1_array[i] = n1%10;
            n1 = n1/10;
        }
        for (int i = 0; i < size1; i++) {
            int currentDigit = n1_array[i];
            if (currentDigit < maxDigit) {
                currentDigit = maxDigit;
                if (maxDigitIndex > 0) {
                    maxDigit = n2_array[--maxDigitIndex];
                } else {
                    maxDigit = 0;
                }
            }
            n1_array[i] = currentDigit;
        }
        int maxNum = 0;
        for (int n : n1_array) {
            maxNum = maxNum*10+n;
        }
        return maxNum;
    }

    // Задание №9
    // В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас 
    //в двух разных городах. Вам дается строка cityA и связанная с ней строка 
    //timestamp (time in cityA) с датой, отформатированной в полной нотации 
    //США, как в этом примере: "July 21, 1983 23:01"
    // Вы должны вернуть новую метку времени с датой и соответствующим временем 
    //в cityB, отформатированную как в этом примере: "1983-7-22 23:01"

    // Используем класс java.time.ZoneOffset; java.time.ZonedDateTime;
    //java.time.format.DateTimeFormatter для преобразования даты по часовым
    //поясам
    private static Map<String, ZoneOffset> offsets = new HashMap<String, ZoneOffset>() {{
        put("Los Angeles",  ZoneOffset.of("-08:00"));
        put("New York",     ZoneOffset.of("-05:00"));
        put("Caracas",      ZoneOffset.of("-04:30"));
        put("Buenos Aires", ZoneOffset.of("-03:00"));
        put("London",       ZoneOffset.of("+00:00"));
        put("Rome",         ZoneOffset.of("+01:00"));
        put("Moscow",       ZoneOffset.of("+03:00"));
        put("Tehrah",       ZoneOffset.of("+03:30"));
        put("New Delhi",    ZoneOffset.of("+05:30"));
        put("Beijing",      ZoneOffset.of("+08:00"));
        put("Canberra",     ZoneOffset.of("+10:00"));
    }};
    public static String timeDifference(String cityA, String time, String cityB) {
        // Разделяем строку времени и форматируем
        String[] parsed = time.split("(,\\s|:|\\s)");
        // Для преобразования в целочисленные значения
        int[] values = new int[parsed.length];
        // Преобразование названия месяца
        switch(parsed[0]) {
            case "January":     values[0] = 1;  break;
            case "February":    values[0] = 2;  break;
            case "March":       values[0] = 3;  break;
            case "April":       values[0] = 4;  break;
            case "May":         values[0] = 5;  break;
            case "June":        values[0] = 6;  break;
            case "July":        values[0] = 7;  break;
            case "August":      values[0] = 8;  break;
            case "September":   values[0] = 9;  break;
            case "October":     values[0] = 10; break;
            case "November":    values[0] = 11; break;
            case "December":    values[0] = 12; break;
        }
        // Преобразование остальных значений даты
        for (int i = 1; i < parsed.length; i++) {
            values[i] = Integer.parseInt(parsed[i]);
        }
        ZoneId timeZoneId = offsets.get(cityA);
        ZoneId newZoneId = offsets.get(cityB);
        ZonedDateTime date = ZonedDateTime
            // year, month, day, hours, minutes, seconds, nanoseconds, zoneId
            .of(values[2], values[0], values[1], values[3], values[4], 0, 0, timeZoneId);
        ZonedDateTime newDate = date.withZoneSameInstant(newZoneId);
        // Форматировать в 1999-9-9 23:59
        return DateTimeFormatter.ofPattern("yyyy-M-d HH:mm").format(newDate);
    }

    // Задание №10
    // Новое число-это число, которое не является перестановкой любого меньшего 
    //числа. 869-это не новое число, потому что это просто перестановка меньших 
    //чисел, 689 и 698. 509-это новое число, потому что оно не может быть 
    //образовано перестановкой любого меньшего числа 
    //(ведущие нули не допускаются).
    // Напишите функцию, которая принимает неотрицательное целое число и 
    //возвращает true, если целое число является новым числом, 
    //и false, если это не так.

    // Нужно найти по порядку цифру меньшую максимальной, тогда число не 
    //является новым, кроме случая, когда рассматриваем первую цифру числа и 
    //ноль т.е. 904 -> 0 хоть и меньше 9, но при перестановке не учитываем 
    //ведущий 0. max=9, 0<max(но первая цифра, так что смотрим дальше), 4<max
    //-> не новое 409
    //5604. max=5, 6>5, max=6, 0<max(т.к. уже не первая цифра числа - можно
    //переставить) -> не новое 5064
    //475 -> 457. по порядку max=4, 7>4, max=7, 5<max -> не новое 457
    public static boolean isNew(int num) {
        int size = digitsCount(num);
        int[] digits = new int[size];
        // Инициализируем массив
        for (int i = 0; i < size; i++) {
            digits[i] = num%10;
            num = num/10;
        }
        // Рассматриваем первый максимум
        boolean firstMax = true; 
        int max = digits[size-1];
        if (size > 1) {
            for (int i = size-2 ; i >= 0; i--) {
                //System.out.println(digits[i]);
                if (digits[i] >= max) {
                    max = digits[i];
                    firstMax = false;
                } else if (digits[i] != 0 || !firstMax) {
                    return false;
                }
            }
        }
        return true;
    }
}