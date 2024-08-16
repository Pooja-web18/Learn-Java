package AccessModifiers;

public class PrivateSpecifier {
    private int data = 40;
//Here the data variable of the example class is private and this variable accessed from same class itself

    public static void main(String[] args) {
        PrivateSpecifier ps = new PrivateSpecifier();
        System.out.println("Data is : " + ps.data);
//        Data variable is accessible in the same class where it is definedd

//        Same program as previous but single modification

//       private int data;
//        public static void main(String[] args){
//            ps.data = 40;
//        Here we set the value of the variable here using the object of example
//            PrivateSpecifiers ps = new PrivateSpecifiers();
//        System.out.println("Data is : " + ps.data);
        }


    }


