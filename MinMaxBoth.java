import java.util.Scanner;

public class MinMaxBoth {

    // Method that returns both minimum and maximum
    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] result = findMinAndMax(numbers);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        sc.close();
    }
}
