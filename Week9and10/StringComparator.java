import java.util.Scanner;

class StringComparator {

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = scanner.next();

        System.out.print("Enter second string: ");
        String text2 = scanner.next();

        boolean userResult = compareStrings(text1, text2);
        boolean builtInResult = text1.equals(text2);

        System.out.println("User-defined comparison: " + userResult);
        System.out.println("Built-in equals(): " + builtInResult);
    }
}