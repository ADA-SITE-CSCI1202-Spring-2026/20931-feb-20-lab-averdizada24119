import java.util.Scanner;

public class MinMaxScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("provide the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum: " + findMinimum(arr));
        System.out.println("Maximum: " + findMaximum(arr));
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}

