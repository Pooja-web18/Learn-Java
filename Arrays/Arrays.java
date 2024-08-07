package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int age[]; //declaration
        age = new int[5]; //memory allocation
//        Or we can write this
//        int age[]= new int[5]; //Declaration and Memory allocation

//        Initialization
        age[0] = 5;
        age[1]= 2;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age.length);

//        Declaration, memory allocation and initialization
        int marks[] ={98, 12, 45, 13, 65};
        System.out.println(marks[0]);

        //Example2
        String names[] = {"Ram" , "Harish", "karan", "Monty"};
        for (int i = 0; i <names.length ; i++) {
            System.out.println("Name is " + names[i]);
        }

        for(String name: names){
            System.out.println("For each " +name);
        }


    }

}

