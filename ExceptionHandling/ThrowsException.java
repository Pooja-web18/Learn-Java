package ExceptionHandling;

public class ThrowsException {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("catched the exception " + e.getMessage());
        }
    }

        static int getNumberFromArray ( int a[]) throws ArithmeticException {
            return a[8];
        }
    }


