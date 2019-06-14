public class Main {

    public static void funcNoParam() {
        System.out.println("Функция без параметров");
    }

    public static void funcWithOneParam(int a) {
        System.out.println("В функцию передается 1 параметр: " +  a);
    }

    public static void funcWithTwoParam(int firstDigit, int secondDigit) {
        System.out.println("В функцию передается 2 параметров: " + firstDigit + " и " + secondDigit);
    }

    public static void funcWithSevenParam(int a, int b, int с, int d, int e, int f, int g) {
        System.out.println("В функцию передается 7 параметров: " + a + " и " + b + " и " + с + " и " + d + " и " + e + " и " + f  + " и " + g );
    }

    public static void funcCountRun(int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday) {
        final int dayInWeek = 7;
        int summ = sunday + monday + tuesday + wednesday + thursday + friday + saturday;
        System.out.println("За неделю пройдено: " + summ + " км");
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
        digit = digit + 1;
        System.out.println("Increments: " + digit);
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



    // Home work:
    // Cerate sub method
    // Create mult method
    // void and int




    public static void main(String[] args) {
        wart(1);
        summ(50,10);

        int x = wart(10);

//        System.out.println("Increments and return: " + x);

//        System.out.println("Summ 3 + 5 = "  + summ(10, 5));

//        System.out.println("Summ 3 + 5 = "  + summ(1, incrementAndReturn(1)));
//        System.out.println("Summ 3 + 5 = "  + summ(incrementAndReturn(1), 1));

//       System.out.println("Summ 3 + 5 = "  + summ(incrementAndReturn(1), incrementAndReturn(1)));

//        System.out.println("Function as value: " + summ(1, incrementAndReturn(summ(incrementAndReturn(1),incrementAndReturn(1))) ));


        System.out.println("quotient:" + x);
        System.out.println("Sub 50 / 10 = " + sub(50,10));
        System.out.println("Mult 15 / 5 = " + mult(15,5));

        multAndPrint(2, 2);

        funcNoParam();
        funcWithOneParam(1);
        funcWithTwoParam(1, 2);
        funcWithSevenParam(1, 2, 3, 4, 5, 6, 7);
        funcCountRun(0, 2, 1, 3, 1, 4, 0);
        funcWithOneParam(1, 2);

    }
}
