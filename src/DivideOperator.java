public class DivideOperator implements Operator {
    public double operate(double num1, double num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
    }
}
