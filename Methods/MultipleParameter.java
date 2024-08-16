package Methods;

public class MultipleParameter {
    static void myMethod(String name, int age){
        System.out.println(name + " is " + age + " years old.");
    }
    public static void main(String[] args) {
        myMethod("John" , 10);
        myMethod("Jane" , 20);
        myMethod("Jack" , 30);
    }
}
