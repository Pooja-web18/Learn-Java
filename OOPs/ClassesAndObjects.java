package OOPs;

public class ClassesAndObjects {
    public static void main(String[] args) {
//        'S1' and 'S2' are objects of the class
//        when we create 'S1','S2', using 'new Student()', means we are creating a new 'Student' object in memory
     Student S1 = new Student();
     S1.name ="Rohan";
     S1.read();
     S1.write();
     Student S2 = new Student();
     S2.name ="James";
     S2.write();
     S2.read();
    }
}
//'Student' is a class.it has two data fields:name(a String) and age(a int)
//It also has two methods 'read' and 'write',which define the behavior of the student
class Student {
    String name ;
    int age ;

    void read(){
        System.out.println( name + " is reading");
    }
    void write(){
        System.out.println( name + " is writing");
    }
}
