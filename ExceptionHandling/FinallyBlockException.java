package ExceptionHandling;

public class FinallyBlockException {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("helloWorld");
        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will run always");
        }
//        We can also use finally block after try block
//        finally block always run if any excpetion is there or not And  we can use finally block for one time
//        when the exception is not create then the catch block is not run
        System.out.println("Bye World");
    }
}
