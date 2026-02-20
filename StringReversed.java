import java.util.Scanner;

public class StringReversed {

    // Method that returns the reversed string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = reverseString(text);

        System.out.println("Reversed string: " + result);

        sc.close();
    }
}

