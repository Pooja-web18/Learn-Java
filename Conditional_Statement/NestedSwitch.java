package Conditional_Statement;

public class NestedSwitch {
    public static void main(String[] args) {
//        C-CSE, E-ECE, M-ME
        char branch = 'C';
        int CollegeYear = 4;
        switch(CollegeYear){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch(branch) {
                    case 'C':
                        System.out.println("Operating Sysytem, Java, Data steucture");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch(branch) {
                    case 'C':
                        System.out.println("Computer Organization, Multimedia");
                        break;
                    case 'E':
                        System.out.println("Fundamental of logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch(branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, Multimedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology , thermal Engineering");
                        break;
                }
                break;

        }
    }
}
