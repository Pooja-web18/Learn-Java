public class NewSwitchCase {
    public static void main(String[] args) {
        String day ="Sunday";
        switch(day)
        {
            case "Saturday","Sunday" ->System.out.println("6am");
            case "Monday" ->System.out.println("7am");
            default ->System.out.println("8am");
        }

        String result = "";
        switch(day){
            case "Saturday","Sunday" ->result ="6am";
            case "Monday" ->result = "7am";
            default ->result = "8am";
        }
        System.out.println(result);

//        or we can write like this also
        String day1 = "Wednesday";
        String result1 ="";

        result1 = switch(day1){
            case "Saturday","Sunday" -> "6am";
            case "Monday" -> "7am";
            default -> "8am";
        };
        System.out.println(result1);
    }
}
