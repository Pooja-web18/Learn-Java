package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello guys");

        try {
            int resule =  5/0;
            System.out.println(a[8]);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("tried to access the out of bound element");
//        }catch(ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//        }
//        Or we can write this like this
         catch(ArrayIndexOutOfBoundsException |ArithmeticException e){
             System.out.println("Handling the exception");
            }
//        this will give us error called 'ArrayIndexOutOfBoundException', Index 8 out of bounds for length 5
        catch(Exception e){
            System.out.println("All Excpetion handled");
        }

        System.out.println("Bye guys");
    }
}
