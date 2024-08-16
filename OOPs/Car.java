package OOPs;

//Constructor Overloading
    public class Car {
        private String make;
        private String model;
        private int year;
        private String color;
        private double price;

        public Car (String make, String model) {
            this.make = make;
            this.model = model;
            this.year = 2018;
            this.color = "red";
            this.price = 0.0;

        }
        public Car(String make, String model, int year) {
            this(make, model);
            this.year = year;
        }
        public Car (String make, String model1, int year, String color) {
            this(make, model1 , year);
            this.color = color;
        }
        public Car (String make, String model1, int year, String color, double price) {
            this(make, model1, year, color);
            this.price = price;
        }
        public void displayDetails(){
            System.out.println("Car details:");
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
            System.out.println("Price: " + price);
            System.out.println();
        }

        public static void main(String[] args) {
           Car car1 = new Car("Toyota", "Corolla");
            Car car2 = new Car("Honda","Civic", 2022);
            Car car3 = new Car("Ford", "Mustang", 2023, "White");
            Car car4 = new Car("tesla","Model3", 2023, "Black", 49999.9);

            car1.displayDetails();
            car2.displayDetails();
            car3.displayDetails();
            car4.displayDetails();
        }
    }