public class SwitchString {
    public static void main(String[] args) {
        String LevelString= "Expert";
        int level = 0;
        switch(LevelString){
            case"Beginner":level=1;
                break;
            case"Intermediate":level=2;
                break;
            case"Expert":level=3;
                break;
        }
        System.out.println("Your level is :" + level);
    }
}
