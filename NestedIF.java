public class NestedIF {
    public static void main(String[] args) {
//        NestedIf:
        int age = 20;
        int weight = 80;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
              }

        //        NestedIf-else
        int age1 = 25;
        int weight1 = 48;
        if (age1 >= 18) {
            if (weight1 > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");

            }
        }else{
            System.out.println("Age must be greater that 18");
        }
    }
}


