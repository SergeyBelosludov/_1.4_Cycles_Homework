public class Main {
    public static void main(String[] args) {
        System.out.println("------");
        { // Задание 1 (38 минут)
            int n = 0;
            while (n < 10) {
                n++;
                System.out.print(n + " ");
            }
            System.out.println();
            for (n = 10; n <= 10 && n > 0; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        {
            System.out.println("------");
        }

        { // Задание 2 (30 минут)
            int dayFriday = 5; // тут ведь любое исло можно поставить в переменную? знаение важно ведь после фор
            for (dayFriday = 5; dayFriday <= 31; dayFriday++) {
                if (dayFriday % 7 == 5) {
                    System.out.println("Today is Friday, " + dayFriday + "-th number. It is necessary to prepare a report.");
                }
            }
        }

        {
            System.out.println("------");
        }

        { // Задание 3 (37 минут)
            int todayYear = 2022;
            int beginning = todayYear - 200;
            int end = todayYear + 100;
            for (todayYear = beginning; todayYear >= beginning && todayYear <= end; todayYear++) {
                if (todayYear % 79 == 0) {
                    System.out.println(todayYear);
                }
            }
        }
    }
}