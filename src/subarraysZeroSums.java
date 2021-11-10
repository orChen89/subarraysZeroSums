import java.util.Scanner;

public class subarraysZeroSums {

    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the array length: ");

        final int[] arr = new int[SCANNER.nextInt()];

        System.out.println("Please enter the array values: ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = SCANNER.nextInt();

        }
        System.out.println("The amount of subArrays with 0 sum are: " + Array0sums(arr));
    }
    public static int Array0sums (int[] arr) {
        int counter0Sums = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0){
                counter0Sums++;
            }

        } return counter0Sums;
    }
}




