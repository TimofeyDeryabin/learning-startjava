class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte coreNum = 8;
        System.out.println("Количество ядер процессора = " + coreNum);
        short coreFrequenсy = 3200;
        System.out.println("Частота процессора = " + coreFrequenсy + " МГц");
        int compCost = 105_000;
        System.out.println("Стоимость компьютера = " + compCost + " руб.");
        long videoCardModel = 1660;
        System.out.println("Модель видеокарты: " + videoCardModel);
        float motherBoardVoltage = 1.44f;
        System.out.println("Напряжение на материнской плате = " + motherBoardVoltage + " Вольт");
        double outPower = 550.34;
        System.out.println("Выходная мощность = " + outPower + " Ватт");
        char mBFirstLetter = 'G';
        System.out.println("Первая буква названия материнской платы: " + mBFirstLetter);
        boolean expensive = true;
        System.out.print("Дорогой ли компьютер? - ");
        if (expensive) {
            System.out.println("Да! Очень!");
        } else {
            System.out.println("Да нет, норм");
        }
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        short penPrice = 100;
        short bookPrice = 200;
        short totalPrice = (short) (penPrice + bookPrice);
        float sale = totalPrice * 0.11f;
        float totalPriceWithSale = totalPrice - sale;
        System.out.println("Сумма скидки при покупке ручки и книги вместе = " + sale + " руб.");
        System.out.println("Общая стоимость ручки и книги со скидкой = " + totalPriceWithSale + " руб.");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte minMaxByteNum = 127;
        System.out.println("\nПервоначальное значение переменной minMaxByteNum: " + minMaxByteNum);
        System.out.println("Минимально возможное число типа данных byte: " + ++minMaxByteNum);
        System.out.println("Максимально возможное число типа данных byte: " + --minMaxByteNum);
        short minMaxShortNum = 32767;
        System.out.println("\nПервоначальное значение переменной minMaxShortNum: " + minMaxShortNum);
        System.out.println("Минимально возможное число типа данных short: " + ++minMaxShortNum);
        System.out.println("Максимально возможное число типа данных short: " + --minMaxShortNum);
        int minMaxIntNum = 2147483647;
        System.out.println("\nПервоначальное значение переменной minMaxIntNum: " + minMaxIntNum);
        System.out.println("Минимально возможное число типа данных int: " + ++minMaxIntNum);
        System.out.println("Максимально возможное число типа данных int: " + --minMaxIntNum);
        long minMaxLongNum = 9223372036854775807L;
        System.out.println("\nПервоначальное значение переменной minMaxLongNum: " + minMaxLongNum);
        System.out.println("Минимально возможное число типа данных long: " + ++minMaxLongNum);
        System.out.println("Максимально возможное число типа данных long: " + --minMaxLongNum);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        
        System.out.println("\nСпособ перестановки: С помощью третьей переменной");
        System.out.println("Исходные значения переменных = " + num1 + " и " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных = " + num1 + " и " + num2);
        
        System.out.println("\nСпособ перестановки: С помощью арифметических операций - через сумму");
        System.out.println("Исходные значения переменных = " + num1 + " и " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных = " + num1 + " и " + num2);
        
        System.out.println("\nСпособ перестановки: С помощью арифметических операций - через разность");
        System.out.println("Исходные значения переменных = " + num1 + " и " + num2);
        num1 = num1 - num2;
        num2 = num2 + num1;
        num1 = num2 - num1;
        System.out.println("Новые значения переменных = " + num1 + " и " + num2);

        System.out.println("\nСпособ перестановки: С помощью арифметических операций - через произведение");
        System.out.println("Исходные значения переменных = " + num1 + " и " + num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("Новые значения переменных = " + num1 + " и " + num2);

        System.out.println("\nСпособ перестановки: С помощью побитовой операции ^");
        System.out.println("Исходные значения переменных = " + num1 + " и " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Новые значения переменных = " + num1 + " и " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char symbol1 = '#';
        System.out.println((int) symbol1 + " = " + symbol1);
        char symbol2 = '&';
        System.out.println((int) symbol2 + " = " + symbol2);
        char symbol3 = '@';
        System.out.println((int) symbol3 + " = " + symbol3);
        char symbol4 = '^';
        System.out.println((int) symbol4 + " = " + symbol4);
        char symbol5 = '_';
        System.out.println((int) symbol5 + " = " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char symbol6 = '/';
        char symbol7 = '\\';
        char symbol8 = '(';
        char symbol9 = ')';
        System.out.println("    " + symbol6 + symbol7);
        System.out.println("   " + symbol6 + "  " + symbol7);
        System.out.println("  " + symbol6 + symbol5 + symbol8 + " " + symbol9 + symbol7);
        System.out.println(" " + symbol6 + "      " + symbol7);
        System.out.println("" + symbol6 + symbol5 + symbol5 + symbol5 + symbol5 + symbol6 + symbol7 + symbol5 + symbol5 + symbol7);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        byte num4 = 123;
        byte hundreds = (byte) (num4 / 100);
        byte ostatok = (byte) (num4 % 100);
        byte desyatki = (byte) (ostatok / 10);
        byte edinici = (byte) (ostatok % 10);
        int proizvedeniye = hundreds * desyatki * edinici;
        byte summa = (byte) (hundreds + desyatki + edinici);
        System.out.println("Число " + num4 + " содержит:");
        System.out.println("    " + hundreds + " сотен\n" + "    " + desyatki + " десятков\n" + "    " + edinici + " единиц");
        System.out.println("Сумма его цифр = " + summa);
        System.out.println("А произведение = " + proizvedeniye);

        System.out.println("\n9. Вывод времени\n");
        int time = 89399;
        byte hours = (byte) (time / 3600);
        short ostatok1 = (short) (time % 3600);
        byte minuts = (byte) (ostatok1 / 60);
        byte seconds = (byte) (ostatok1 % 60);
        System.out.println(hours + ":" + minuts + ":" + seconds);
    }
}