package Arrays;

public class SingleDimensional {
    public static void main(String[] args) {
//        float [] marks = {98.3f, 45.6f, 79.8f, 99.4f, 80.2f};
//        System.out.println(marks.length);
//        System.out.println(marks[3]);
//        String[] students = {"harry", "rohan","shubham","Sameer"};
//        System.out.println(students.length);
//        System.out.println(students[3]);

        int[] marks = {98, 45, 79, 99, 80};
        System.out.println(marks.length);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

//        we can write this using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
//        displaying in reverse order
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
//    Quick quiz: displaying the array(for-each loop)
        for (int element : marks) {
            System.out.println(element);

        }
    }
}
