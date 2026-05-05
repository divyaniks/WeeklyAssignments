import java.util.Scanner;

class BMICalculator {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;

            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            input[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        display(calculateBMI(input));
        sc.close();
    }
}