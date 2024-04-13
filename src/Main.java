import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическую операцию полностью (числа вводятся от 1 до 10 включительно, " +
                "например  4 + 6 или 4 - 6 или 4 * 6 или 4 / 6):");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        try {
            System.out.println(calc(operation));
        } catch (Exception e) {
            System.out.print("throws Exception");
        }
    }

    public static String calc(String input) throws Exception{
        String[] arrayString = input.split("\\s+");

        int a = Integer.parseInt(arrayString[0]);
        int b = Integer.parseInt(arrayString[2]);
        String arithmeticOperation = arrayString[1];

        String result = "throws Exception";

        if ((a > 10) || (a < 1) || (b > 10) || (b < 1) || (arrayString.length > 3)) {
            try {
                throw new Exception();
            } catch (Exception e) {
                return result;
            }
        }

        switch (arithmeticOperation) {
            case "+":
                result = Integer.toString(a + b);
                break;
            case "-":
                result = Integer.toString(a - b);
                break;
            case "*":
                result = Integer.toString(a * b);
                break;
            case "/":
                result = Integer.toString(a / b);
                break;
            default:
                break;
        }
        return result;
    }
}