public class Main {
    static int printTaskNumber;

    public static void t() {
        printTaskNumber++;
        System.out.println("Задание №" + printTaskNumber);
    }

    public static void main(String[] args) {
        System.out.println("Список заданий 1");
        t();
        int save = 0;
        int month = 0;
        while (save <= 2_459_000) {
            month++;
            save += 15_000;
            System.out.printf("Месяц %s, сумма накоплений равно %s рублей.%n", month, save);
        }
        System.out.println("Всего месяцев " + month);
        System.out.println("Всего наокплений " + save);
        t();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i1 = 10; i1 >= 1; i1--) {
            System.out.print(i1 + " ");
        }
        System.out.println("");
        t();
        int population = 12_000_000;
        int death = 8 * population / 1000;
        int birth = 17 * population / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birth - death;
            System.out.printf("Год %s, численность населения составляет %s.%n", year, population);
        }
        System.out.println("Список заданий 2");
        t();
        int total = 0;
        int percent = 7;
        int i2 = 0;
        while (total < 12_000_000) {
            i2++;
            total += 15000;
            total = total + percent * total / 100;
            System.out.printf("Месяц %s, сумма накоплений составляет %s%n", i2, total);
        }
        System.out.println("Всего месяцев " + i2);
        System.out.println("Всего накоплений " + total);
        t();
        int total2 = 0;
        int percent2 = 7;
        int i3 = 0;
        while (total2 <= 12_000_000) {
            i3++;
            total2 += 15000;
            total2 = total2 + percent2 * total2 / 100;
            if (i3 % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %s%n", i3, total2);
            }
        }
        System.out.println("Всего месяцев = " + i3);
        System.out.println("Всего накоплений = " + total2);
        t();
        int total3 = 0;
        int percent3 = 7;
        int i4 = 0;
        while (i4 <= 9 * 12) {
            i4++;
            total3 += 15000;
            total3 = total3 + percent3 * total3 / 100;
            if (i4 % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %s%n", i4, total3);
            }
        }
        System.out.println("Всего месяцев = " + i4);
        System.out.println("Всего накоплений = " + total3);
        t();
        int friday = 7;
        int s = 1;
        while (s < 31) {
            s++;
            if (s % friday == 0)
                System.out.printf("Сегодня пятница, %s-е число, необходимо подготовить отчет%n", s);
        }
        t();
        int today = 2022;
        int after = today + 100;
        int before = today - 200;
        do {
            before++;
            if (before % 79 == 0) {
                System.out.println(before);
            }
        } while (before <= after);
        t();
        int x = 2;
        for (int y = 1; y <= 10; y++) {
            int z = x * y;
            System.out.println(x + " * " + y + " = " + z);
        }


    }


}

