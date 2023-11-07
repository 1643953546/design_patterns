public class OperationFactory {
    public static Operation buildOperation(String operator){
        switch (operator) {
            case "/":
                return new DivisionOperation();
            case "+":
                return new AddOperation();
            default:
                System.out.println("输入错误的运算符号.");
                return null;
        }
    }
}
