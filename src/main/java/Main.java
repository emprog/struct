public class Main {

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
        System.out.println("Summ 50 / 10 = " + summ(50,10));
        System.out.println("Summ 15 / 5 =" + summ(15,5));

    }
}
