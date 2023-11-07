import java.util.Scanner;

public class OperationMain {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("请输入第二个数字:");
        int secondNumber = scanner.nextInt();

        System.out.println("请输入运算符号:");
        String calculateSymbol = scanner.next();

        Operation operation = OperationFactory.buildOperation(calculateSymbol);
        operation.setInputFirst((double) firstNumber);
        operation.setInputSecond((double) secondNumber);
        System.out.println(operation.operation());

    }
}
