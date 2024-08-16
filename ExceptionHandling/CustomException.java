package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        try {
            if (age > 100) {
//                throw new MyException("My Error is this");
                throw new ArithmeticException();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

}