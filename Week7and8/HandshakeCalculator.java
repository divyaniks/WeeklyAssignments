import java.util.Scanner;
class HandshakeCalculator {

    // Method to calculate handshakes
    public int calculateHandshakes(int numberOfStudents) {
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return totalHandshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        HandshakeCalculator calculator = new HandshakeCalculator();
        int result = calculator.calculateHandshakes(students);

        System.out.println("Maximum number of handshakes: " + result);
    }
}