import java.util.Scanner;

public class Main {

    public static void funcNoParam() {
        System.out.println("Функция без параметров");
    }

    public static void funcWithOneParam(int a) {
        System.out.println("В функцию передается 1 параметр: " + a);
    }

    public static void funcWithTwoParam(int firstDigit, int secondDigit) {
        System.out.println("В функцию передается 2 параметров: " + firstDigit + " и " + secondDigit);
    }

    public static void funcWithSevenParam(int a, int b, int с, int d, int e, int f, int g) {
        System.out.println("В функцию передается 7 параметров: " + a + " и " + b + " и " + с + " и " + d + " и " + e + " и " + f + " и " + g);
    }

    public static void countDayInYear(int January, int February, int March, int April, int May, int June, int July, int August, int September, int October, int
            November, int December) {
        final int monthsayear = 12;
        int summ = January + February + March + April + May + June + July + August + September + October +
                November + December;
        System.out.println("Всего дней в году: " + summ + " дней");
    }

    public static void countDayInSpring(int March, int April, int May) {
        final int monthaSpring = 3;
        int summ = March + April + May;
        System.out.println("Всего дней весной: " + summ + " дней");
    }

    public static void countDayInSummer(int June, int July, int August) {
        final int monthaSummer = 3;
        int summ =  June + July + August ;
        System.out.println("Всего дней летом: " + summ + " дней");
    }

    public static void countDayInAutumn(int September, int October, int November) {
        final int monthaAutumn = 3;
        int summ = September + October + November;
        System.out.println("Всего дней осенью: " + summ + " дней");
    }

    public static void countDayInWinter(int December,int January, int February ) {
        final int monthawinter = 3;
        int summ = December + January + February ;
        System.out.println("Всего дней зимой: " + summ + " дней");
    }

    public static int funcWithOneParam(int a, int b) {
        a = a + 1;
        System.out.println("Функция funcWithOneParam переопределена с двумя параметрами");

        {
            int x;
            int y = 1;
            int z = 2;

            x = y + z;

            x = x + x;

        }

        int x;
        int y = 1;
        int z = 2;
        int f = 3;

        x = y + z + f;

        if(x > 1) {
            y = f + z;
        }

        y = 2;

        return a;
    }









    public static void increment(int digit) {
//        digit = digit + 1;
        int x, y;
        x = digit++;
        System.out.println("x: " + x + " digit: " + digit);
        y = ++digit;
        System.out.println("y: " + y + " digit: " + digit);
//        System.out.println("Increments: " + digit);

        System.out.println((5 + 2) * (3 + 7));
    }

    public static int incrementAndReturn(int digit) {
        digit = digit + 1;
        System.out.println("Increments and return: " + digit);
        return digit;
    }

    public static int wart(int digit) {
        digit = digit / 5;
        System.out.println("quotient: " + digit);
        return digit;
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a / b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int multAndPrint(int a, int b) {
        a = a * b;
        System.out.println("Выводим произаедение из метода: " + a);
        return a;
    }

    public static String getAnsver() {
        Scanner in = new Scanner(System.in);
        String ansver = in.nextLine();
//        in.close();
        return ansver;
    }

    public static void selectYearOrWinterShort(String season) {
        if(season.equalsIgnoreCase("Year")) {
            countDayInYear(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        } else {
            countDayInWinter(31,31,28);
        }
    }

    public static void selectYearOrWinterLong(String season) {
        if(season.equalsIgnoreCase("Year")) {
            countDayInYear(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        } else {
            countDayInWinter(31,31,29);
        }
    }



    public static void main(String[] args) {
//        wart(1);
//        summ(50,10);

//        int x = wart(10);

//        System.out.println("Increments and return: " + x);

//        System.out.println("Summ 3 + 5 = "  + summ(10, 5));

//        System.out.println("Summ 3 + 5 = "  + summ(1, incrementAndReturn(1)));
//        System.out.println("Summ 3 + 5 = "  + summ(incrementAndReturn(1), 1));

//       System.out.println("Summ 3 + 5 = "  + summ(incrementAndReturn(1), incrementAndReturn(1)));

//        System.out.println("Function as value: " + summ(1, incrementAndReturn(summ(incrementAndReturn(1),incrementAndReturn(1))) ));


//        System.out.println("quotient:" + x);
//        System.out.println("Sub 50 / 10 = " + sub(50,10));
//        System.out.println("Mult 15 / 5 = " + mult(15,5));

//        multAndPrint(2, 2);

//        funcNoParam();
//        funcWithOneParam(1);
//        funcWithTwoParam(1, 2);
//        funcWithSevenParam(1, 2, 3, 4, 5, 6, 7);
//        funcWithOneParam(1, 2);


//        increment(5);

        

        System.out.println("Какой период времени использовать для расчета? (Spring/Summer/Autumn/Winter/Year):");
        String season = getAnsver();

        if (season.equalsIgnoreCase("Spring")) {
            countDayInSpring(31, 30, 31);
        } else if (season.equalsIgnoreCase("Summer")) {
            countDayInSummer(30, 31, 31);
        } else if (season.equalsIgnoreCase("Autumn")) {
            countDayInAutumn(30, 31, 30);
        } else if (season.equalsIgnoreCase("Year") || season.equalsIgnoreCase("Winter")) {

            System.out.println("Год высокосный? (YES/NO):");
            String ansver = getAnsver();

            if (ansver.equalsIgnoreCase("NO")) {
                selectYearOrWinterShort(season);
            } else if (ansver.equalsIgnoreCase("YES")) {
                selectYearOrWinterLong(season);
            } else System.out.println("Неверный ответ!");
        } else System.out.println("Неверный ответ!");



//          System.out.println("Год высокосный? (YES/NO):");
//          String ansver = b.nextLine();
//          b.close();

//        if(ansver.equalsIgnoreCase("NO")) {
//            countDayInYear(31,28,31,30,31,30,31,31,30,31,30,31);
//        } else if(ansver.equalsIgnoreCase("YES")) {
//            countDayInYear(31,29,31,30,31,30,31,31,30,31,30,31);
//       } else System.out.println("Неверный ответ!");




    }
}
