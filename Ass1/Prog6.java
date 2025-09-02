package FPP.Ass1;

public class Prog6 {

    public static void secondMin(int[] num) {

        // Initialize min and second min with very large values
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                secMin = min;        // previous min becomes second min
                min = num[i]; // new min
            } else if (num[i] < secMin && num[i] != min) {
                secMin = num[i]; // update second min
            }
        }

        // Handle case where the second minimum doesn't exist
        if (secMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum exists.");
        } else {
            System.out.println("Second Minimum is: " + secMin);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(numbers);
    }
}
