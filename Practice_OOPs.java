class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }

}
//for problem2
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}

//For problem3
class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Practice_OOPs {
    public static void main(String[] args) {

//Problem 1:Create a class Employee with following properties and methods:Salary,getSalary,name,getName,Setname
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

//        Problem2:creating a class cellphone with method to print"ringing...", "Vibrating..."etc
        CellPhone vivo = new CellPhone();
        vivo.ring();
        vivo.vibrate();
        vivo.callFriend();

//        Create a class square with a method to initialize its side, calculating aera, perimeter etc
           Square sq = new Square();
           sq.side = 3;
           System.out.println(sq.area());
           System.out.println(sq.perimeter());
    }


}
