import java.util.Scanner;

class StringLengthFinder {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a word: ");
            String input = sc.next();

            System.out.println("Custom Length: " + findLength(input));
            System.out.println("Built-in Length: " + input.length());

        } finally {
            sc.close();
        }
    }
}