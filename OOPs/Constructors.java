package OOPs;

public class Constructors {
    public static void main(String[] args) {
//        Complex num1 = new Complex(); //in this Complex() is a default constructor
       Complex num1 = new Complex(2,3);
//        num1.a = 3;
//        num1.b = 3;
        num1.print();
    }
}
class Complex {
    int a, b;

// this type of constructor always present by default
//    public Complex() {
//        a = 0;
//        b = 0;
//    }

//    when we make other constructor which is not default const. then the  'Complex()' this constructor  will not work

    public Complex(int real, int imag) {
        a = real;
        b = imag;
    }

    void print(){
        System.out.println(a+ " + " + b + "i");
    }
}
