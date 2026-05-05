import java.util.Scanner;
class FactorCalculator {

    public static int[] getFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int value : factors) sum += value;
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int value : factors) product *= value;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum: " + findSum(factors));
        System.out.println("Product: " + findProduct(factors));
        System.out.println("Sum of Squares: " + findSumOfSquares(factors));
    }
}