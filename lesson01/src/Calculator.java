public class Calculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        char operand = '/';

        String caption = num1 + " " + operand + " " + num2 + " = ";

        if (operand == '+') {
            System.out.println(caption + (num1 + num2));
        } else if (operand == '-') {
            System.out.println(caption + (num1 - num2));
        } else if (operand == '/') {
            if (num2 == 0) {
                System.out.println("Division by zero!");
            } else {
                // Точное деление
                System.out.println(caption + ((float) num1 / num2));
                // Целочисленное деление
                System.out.println(caption + (num1 / num2));
            }
        } else if (operand == '*') {
            System.out.println(caption + (num1 * num2));
        } else if (operand == '%') {
            System.out.println(caption + (num1 % num2));
        } else if (operand == '^') {
            int result = num1;
            for (int i = 2; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(caption + result);
        }
    }
}
