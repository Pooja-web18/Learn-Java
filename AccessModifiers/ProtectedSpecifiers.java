package AccessModifiers;

 class P{
   protected int data = 45;//Protected instance variable
 }
public class ProtectedSpecifiers {
    public static void main(String[] args) {
        P obj = new P();
        System.out.println("Data is :" + obj.data);
        //Access protected instance variable in other class
    }
}
