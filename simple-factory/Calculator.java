import java.io.Console;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("请输入第二个数字:");
        int secondNumber = scanner.nextInt();

        System.out.println("请输入运算符号:");
        String calculateSymbol = scanner.next();

        double calculateResult = 0;

        switch (calculateSymbol) {
            case "X":
                calculateResult = firstNumber * secondNumber;
                break;
            case "/":
                calculateResult = firstNumber / secondNumber;
                break;
            case "+":
                calculateResult = firstNumber + secondNumber;
                break;
            case "-":
                calculateResult = firstNumber - secondNumber;
                break;
            default:
                System.out.println("输入错误的运算符号.");
                break;
        }

        System.out.println("计算结果为:" + calculateResult);

    }
}
