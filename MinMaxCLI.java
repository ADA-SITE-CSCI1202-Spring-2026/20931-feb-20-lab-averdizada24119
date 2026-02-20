public class MinMaxCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("provide elements");
            return;
        }

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]); // convert string to int
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

