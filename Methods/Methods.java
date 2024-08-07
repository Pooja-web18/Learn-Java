package Methods;

public class Methods {
    static void change(int a) {
        a = 96;
    }

    static void change2(int[] arr) {
        arr[0] = 96;
    }

    static void tellJokes() {
        System.out.println("I invented a new world!\n" + "Plagiarism");
    }

    public static void main(String[] args) {
        tellJokes();
        int[] marks = {52, 72, 64, 76, 96};
//       Case1: changing the Integer:
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is:" + x);

//        Case2: Changing the Array
        int[] marks1 = {52, 72, 64, 76, 96};
        int x1 = 45;
        change2(marks1);
        System.out.println("The value of x1 after running change is:" + marks1[0]);
    }
}
