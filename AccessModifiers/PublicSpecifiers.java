package AccessModifiers;

class PT{
    public int data = 30;
//    Public instance variable and accessible in other classes
}
public class PublicSpecifiers {
    public static void main(String[] args) {
        PT obj =new PT();
        System.out.println("Data is "+obj.data);
    }

}

