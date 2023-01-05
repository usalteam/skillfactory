import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        boolean isFinish = false;
        boolean isResult = true;
        int operand2 = 0;
        char operation = 0;

        System.out.println("vvedite operand 1");

        int result = scannerInt();
        Scanner scanner = new Scanner(System.in);

        while (!isFinish) {
            System.out.println("vvedite tip operacii, dostupnye znacheniya: +, -, *, /, C, s");
            operation = scanner.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                System.out.println("vvedite operand 2");
                operand2 = scannerInt();
            }

            switch (operation) {
                case '+':
                    result = result + operand2;
                    break;
                case '-':
                    result = result - operand2;
                    break;
                case '*':
                    result = result * operand2;
                    break;
                case '/':
                    result = result / operand2;
                    break;
                case 'C':
                    result = 0;
                    break;
                case 's':
                    isFinish = true;
                    break;
                default:
                    isResult = false;
                    System.out.println("neizvestnaya operaciya, dostupnye znacheniya: +, -, *, /, C, s");
            }
            if (isResult) {
                System.out.println("result = " + result);
            } else {
                isResult = true;
            }
        }

    }

    public static int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        return result;
    }
}