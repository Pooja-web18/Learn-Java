public class PracticeArray {
    public static void main(String[] args) {
        //P1:Create an array of 5 floats and calculate their Sum
        float[] marks = {45.7f, 67.8f, 63.4f, 99.3f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of the sum:" + sum);


        //P2:Write a program to find out whether given integer is present in array or not
        float[] marks1 = {45.7f, 67.8f, 63.4f, 99.3f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element : marks1) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in this array");
        } else {
            System.out.println("The value is not present in this array ");

        }


        //P3:Calculate the average marks from an array contaning marks of all student in physics using for each loop
        float[] marks2 = {45.7f, 67.8f, 63.4f, 99.3f, 100.0f};
        float sum1 = 0;
        for (float element : marks2) {
            sum1 = sum1 + element;
        }
        System.out.println("The value of Average marks is:" + sum / marks.length);


        //P4:Add two matrices of size 2*3
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { //Row number of times
            for (int j = 0; j < mat1[i].length; j++) { //column number of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        for (int i = 0; i < mat1.length; i++) { //Row number of times
            for (int j = 0; j < mat1[i].length; j++) { //column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }


        //P5:Write a program to reverse an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            //Swap a[i] and a[l-1-i]
            // a b temp
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }


        //P6:Find the Maximum element in an array
        int[] arr1 = {1, 21, 3, 455, 5, 43, 67};
        int max = 0;
        for (int element : arr1) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The maximum value of the element is:" + max);


        // Minimum value
        int[] arr2 = {1, 21, 5, 465, 8, 45, 87};
        int min = arr[0];
        for (int e : arr2) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("the minimum value of the element is:" + min);


//        find whether an array is sorted or not
        int[] arr3 = {1, 2, 3, 4, 5, 34, 67};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
