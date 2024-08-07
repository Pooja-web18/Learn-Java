package Operators;

public class ArithmaticOperators {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c= 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a % c = " + (a % c));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
//        diffrence in d++ and ++d
        System.out.println("d++  = " + (d++));
        System.out.println("++d = " + (++d));
    }

    public static class AssignmentOperators {
        public static void main(String[] args) {

            int num1= 10, num2 = 20;

            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

    //        Adding and assigning values
            num1 += num2;

    //        subtracting and assigning values
            num1 -= num2;

    //        Multiplying and assigning values
            num1 *= num2;

    //        Dividing and assigning values
            num1 /= num2;

    //        Moduling and assigning values
            num1 %= num2;

            System.out.println("num1 = " + num1);

        }
    }
}
