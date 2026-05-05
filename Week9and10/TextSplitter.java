import java.util.Scanner;

class TextSplitter {

    public static int countWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        return count;
    }

    public static String[] splitText(String text) {
        int words = countWords(text);
        String[] result = new String[words];

        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = splitText(text);
        String[] builtin = text.split(" ");

        System.out.println("Arrays equal: " + compareArrays(custom, builtin));

        sc.close();
    }
}