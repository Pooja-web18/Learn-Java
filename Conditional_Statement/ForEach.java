package Conditional_Statement;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//    Syntax of for-each loop
        for(int n : nums){
            System.out.println(n);
        }
    }
}
