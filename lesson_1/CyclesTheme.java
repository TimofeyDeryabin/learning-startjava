public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumUneven = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumUneven += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumUneven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        byte num1 = 10;
        byte num2 = 5;
        byte num3 = -1;
        if (num1 < num2) {
            num1 = (byte) (num1 + num2);
            num2 = (byte) (num1 - num2);
            num1 = (byte) (num1 - num2);
        }
        if (num1 < num3) {
            num1 = (byte) (num1 + num3);
            num3 = (byte) (num1 - num3);
            num1 = (byte) (num1 - num3);
        }
        if (num3 > num2) {
            num3 = (byte) (num3 + num2);
            num2 = (byte) (num3 - num2);
            num3 = (byte) (num3 - num2);
        }
        for (i = 0; i < 1; i++) {
            System.out.println(num2);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        short num4 = 1234;
        short remainder = num4;
        byte sum = 0;
        short reverseNum = 0;
        i = 1000;
        int j = 1;
        while (i > 0) {
            sum += (byte) (remainder / i);
            reverseNum += (short) ((remainder / i) * j);
            remainder %= (short) i;
            i /= 10;
            j *= 10;
        }
        System.out.println("Исходное число в обратном порядке = " + reverseNum);
        System.out.println("Сумма цифр исходного числа = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        i = 1;
        for (j = 0; i < 24; i += 2, j++) {
            if (j == 5) {
                System.out.println();
                j = 0;
            }
            System.out.printf("%3d", i);
        }
        for ( ; j < 5; j++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        int num5 = 3_242_592;
        int remainder1 = num5;
        i = 1_000_000;
        byte count = 0;
        while (i > 0) {
            num3 = (byte) (remainder1 / i);
            if (num3 == 2) {
                count++;
            }
            remainder1 %= i;
            i /= 10;
        }
        boolean even = count % 2 == 0;
        System.out.printf("Число %d содержит %d ", num5, count);
        if (even) {
            System.out.println("(четное) количество двоек");
        } else {
            System.out.println("(нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        i = 0;
        while (i < 5) {
            j = 4 - i;
            while (j >= 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        i = 0;
        do {
            if (i <= 2) {
                j = 0;
                do {
                    System.out.print("$");
                    j++;
                } while (j < 1 + i);
            } else {
                j = 4 - i;
                do {
                    System.out.print("$");
                    j--;
                } while (j >= 0);
            }
            System.out.println();
            i++;
        } while (i < 5);
        System.out.println();

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%4s%6s%n", "Dec", "Char");
        char sym;
        for (i = 1; i <= 47; i += 2) {
            sym = (char) i;
            System.out.printf("%4d%6s%n", i, sym);
        }
        for (i = 98; i <= 122; i += 2) {
            sym = (char) i;
            System.out.printf("%4d%6s%n", i, sym);
        }
        System.out.println();

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int palindrom = 1234321;
        remainder1 = palindrom;
        int reversePalindrom = 0;
        for (i = 1_000_000, j = 1; i > 0; i /= 10, j *= 10) {
            reversePalindrom += (remainder1 / i) * j;
            remainder1 %= i;
        }
        if (palindrom == reversePalindrom) {
            System.out.println("Число " + palindrom + " является палиндромом");
        } else {
            System.out.println("Число " + palindrom + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int happyNumber = 739685;
        remainder1 = happyNumber;
        int leftNumberPart = 0;
        int rightNumberPart = 0;
        int leftPartSum = 0;
        int rightPartSum = 0;
        float k = 100;
        for (i = 100_000, j = 0; i > 0; i /= 10, j++, k /= 10) {
            if (j < 3) {
                leftPartSum += remainder1 / i;
                leftNumberPart += (remainder1 / i) *k;
            } else {
                rightPartSum += remainder1 / i;
                rightNumberPart += (remainder1 / i) * k * 1000;
            }
            remainder1 %= i;
        }
        System.out.println("Исходное число = " + happyNumber);
        System.out.println("Сумма цифр " + leftNumberPart + " = " + leftPartSum);
        System.out.println("Сумма цифр " + rightNumberPart + " = " + rightPartSum);
        if (leftPartSum == rightPartSum) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%11s%10s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf("%4s", "|");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n___|________________________\n");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
