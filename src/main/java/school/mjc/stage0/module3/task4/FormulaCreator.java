package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;

        double firstPart = 9 * Math.pow(a, 2) - 5 * b + 2 + a - 7;

        double secondPart = (a + b - 4 * a * b) / 2;

        double result = firstPart * secondPart;

        System.out.println(result);
    }
}
