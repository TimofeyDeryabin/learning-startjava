public class IfElseStatementTheme {

    public static void main(String[] args) {
        
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        byte age = 25;
        if(age > 20) {
            System.out.println("Вы уже достаточно взрослый, чтобы выпить вина на своем дне рождении");
        } else {
            System.out.println("Давай купим тебе на день рождения детского шампанского малыш!");
        }

        boolean isMan = true;
        if(!isMan) {
            System.out.println("Приятно иметь дело с красивой дамой!");
        } else {
            System.out.println("Мужиииииик!");
        }

        float height = 1.95f;
        if(height < 1.8) {
            System.out.println("Тебе бы подрасти дружок, а то ты до корзины не достаешь в прыжке");
        } else {
            System.out.println("Шакил О-Нил гордился бы тобой!");
        }

        String name = "Timofey";
        char nameFirstLetter = name.charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.println("M = мужество");
        } else if(nameFirstLetter == 'I') {
            System.out.println("I = интеллект");
        } else {
            System.out.println("Классное имя бро!");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        double num1 = 3.14;
        double num2 = -12234321.9302929;
        if(num1 == num2) {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        } else if(num1 > num2) {
            System.out.println("Число " + num1 + " = max, а число " + num2 + " = min");
        } else {
            System.out.println("Число " + num1 + " = min, а число " + num2 + " = max");
        }

        System.out.println("\n3. Проверка числа\n");
        int num3 = 23445;
        if(num3 == 0) {
            System.out.println("Число " + num3 + " равно нулю");
        } else {
            boolean isEven = num3 % 2 == 0;
            if(isEven) {
                if(num3 > 0) {
                    System.out.println("Число " + num3 + " четное и положительное");
                } else {
                    System.out.println("Число " + num3 + " четное и отрицательное");
                }
            } else {
                if(num3 > 0) {
                    System.out.println("Число " + num3 + " нечетное и положительное");
                } else {
                    System.out.println("Число " + num3 + " нечетное и отрицательное");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 229;
        int num5 = 249;
        System.out.println("Исходные числа = " + num4 + " и " + num5);
        byte units4 = (byte) (num4 % 10);
        byte units5 = (byte) (num5 % 10);
        boolean isEqualsUnits = units4 == units5;
        byte dozens4 = (byte) (num4 % 100 - units4);
        byte dozens5 = (byte) (num5 % 100 - units5);
        boolean isEqualsDozens = dozens4 == dozens5;
        byte hundreds4 = (byte) (num4 / 100);
        byte hundreds5 = (byte) (num5 / 100);
        boolean isEqualsHundreds = hundreds4 == hundreds5;
        if(isEqualsUnits) {
            System.out.println("Цифры в разрядах единиц одинаковые и равны: " + units4);
        } 
        if(isEqualsDozens) {
            System.out.println("Цифры в разрядах десятков одинаковые и равны: " + dozens4);
        }
        if(isEqualsHundreds) {
            System.out.println("Цифры в разрядах сотен одинаковые и равны: " + hundreds4);
        }
        if(!isEqualsUnits && !isEqualsDozens && !isEqualsHundreds) {
            System.out.println("В разрядах чисел равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char sym = '\u0057';
        if(sym >= '0' && sym <= '9') {
            System.out.println("Символ: " + sym + " является цифрой");
        } else if(sym >= 'A' && sym <= 'Z') {
            System.out.println("Символ: " + sym + " является заглавной буквой");
        } else if(sym >= 'a' && sym <= 'z') {
            System.out.println("Символ: " + sym + " является строчной буквой");
        } else {
            System.out.println("Символ: " + sym + " не является ни буквой, ни числом");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        double deposit = 300_000;
        double income;
        if(deposit > 0 && deposit < 100_000) {
            income = deposit * 0.05;
            System.out.println("Сумма вклада = " + deposit);
            System.out.println("Начисленные проценты за год = " + income);
            System.out.println("Итоговая сумма с процентами = " + (deposit + income));
        } else if(deposit >= 100_000 && deposit <= 300_000) {
            income = deposit * 0.07;
            System.out.println("Сумма вклада = " + deposit);
            System.out.println("Начисленные проценты за год = " + income);
            System.out.println("Итоговая сумма с процентами = " + (deposit + income));
        } else if(deposit > 300_000) {
            income = deposit * 0.1;
            System.out.println("Сумма вклада = " + deposit);
            System.out.println("Начисленные проценты за год = " + income);
            System.out.println("Итоговая сумма с процентами = " + (deposit + income));
        } else {
            System.out.println("На вкладе денег нет");
        }

        System.out.println("\n7. Определение оценки по предметам\n");
        byte historyPercentages = 59;
        byte codingPercentages = 91;
        byte historyScore;
        if(historyPercentages < 0 || historyPercentages > 100) {
            historyScore = -1;
            System.out.println("Оценка не верна");
        } else if(historyPercentages <= 60) {
            historyScore = 2;
            System.out.println("Оценка 2 - история");
        } else if(historyPercentages <= 73) {
            historyScore = 3;
            System.out.println("Оценка 3 - история");
        } else if(historyPercentages <= 91) {
            historyScore = 4;
            System.out.println("Оценка 4 - история");
        } else {
            historyScore = 5;
            System.out.println("Оценка 5 - история");
        }
        byte codingScore;
        if(codingPercentages < 0 || codingPercentages >100) {
            codingScore = -1;
            System.out.println("Оценка не верна");
        } else if(codingPercentages <= 60) {
            codingScore = 2;
            System.out.println("Оценка 2 - программирование");
        } else if(codingPercentages <= 73) {
            codingScore = 3;
            System.out.println("Оценка 3 - программирование");
        } else if(codingPercentages <= 91) {
            codingScore = 4;
            System.out.println("Оценка 4 - программирование");
        } else {
            codingScore = 5;
            System.out.println("Оценка 5 - программирование");
        }
        double averageScore = (historyScore + codingScore) / 2;
        System.out.println("Средний балл оценок по предметам: " + averageScore);
        double averagePersentages = (historyPercentages + codingPercentages) / 2;
        System.out.println("Средний % по предметам: " + averagePersentages);

        System.out.println("\n8. Расчет прибыли за год\n");
        int rent = 5000;
        income = 13000;
        int netCost = 9000;
        int yearProfit = ((int) income - netCost - rent) * 12;
        if(yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int outlay = 567;
        byte hundreds = (byte) (outlay / 100);
        byte ostatok = (byte) (outlay % 100);
        byte dozens = (byte) (ostatok / 10);
        byte units = (byte) (ostatok % 10);
        byte hundredsCount = 10;
        byte dozensCount = 5;
        int unitsCount = 50;
        if(hundreds > hundredsCount) {
            dozens += (hundreds - hundredsCount) * 10;
            hundreds = hundredsCount;
        }
        if(dozens > dozensCount) {
            units += (dozens - dozensCount) * 10;
            dozens = dozensCount;
        } 
        if(units > unitsCount) {
            System.out.println("В банкомате недостаточно средств");
        } else {
            int summa = hundreds * 100 + dozens * 10 + units;
            if(summa == outlay) {
                System.out.println("Запрошенная сумма будет выдана банкнотами:");
                System.out.println("100 USD - " + hundreds + " шт.");
                System.out.println("10 USD - " + dozens + " шт.");
                System.out.println("1 USD - " + units + " шт.");
                System.out.println("Выдаваемая сумма = " + summa + " USD");
            } else {
                System.out.println("Ошибка расчета суммы выдачи. Обратитесь пожалуйста немного позже.");
            }
        }
    }
}