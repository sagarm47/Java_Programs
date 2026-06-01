package array;

public class secondHighestNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int largestNum = 0, secondLargestNum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = num[i];
            } else if (num[i] > secondLargestNum) {
                secondLargestNum = num[i];
            }
        }
        System.out.println("Largest Number is- " + largestNum);
        System.out.println("Second Largest Number is- " + secondLargestNum);
    }
}
