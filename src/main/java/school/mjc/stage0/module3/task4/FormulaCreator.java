package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;

        byte nine = 9;
        byte two = 2;
        byte five = 5;
        byte seven = 7;
        byte four = 4;
        double firstPart = nine * a * a - five * b + two + a - seven;

        double secondPart = (a + b - four * a * b) / two;

        double result = firstPart * secondPart;

        System.out.println(result);

    }
}
