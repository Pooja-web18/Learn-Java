
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("And My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

//        Instantiating a new Employee Object
        Employee harry = new Employee();
        Employee john = new Employee();

//        Setting Attributes
         harry.id = 15;
         harry.name = "CodeWithHarry";
         harry.salary = 2000;
        int salary2 = harry.getSalary();
        System.out.println("Salary for harry :" + salary2);

        john.id = 12;
         john.name = "john doe";
         john.salary = 3000;
        int salary = john.getSalary();
        System.out.println("Salary for john :" + salary);

//         Printing the Attributes
        System.out.println(harry.id);
        System.out.println(harry.name);
//        Or we can write like this also
        harry.printDetails();
        john.printDetails();


    }
}
