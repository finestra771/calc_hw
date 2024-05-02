import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> implements Calculator {
    private T num1;
    private T num2;
    private double result;
    private String operator;
    ArrayList<Double> res = new ArrayList<>();
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public double calc() throws ArithmeticException {
        String operator = getOperator();
        OperatorType operatorType = OperatorType.fromSymbol(operator);

        switch (operatorType) {
            case ADDITION:
                setResult(addOperator.operate(num1.doubleValue(), num2.doubleValue()));
                break;
            case SUBTRACTION:
                setResult(subtractOperator.operate(num1.doubleValue(), num2.doubleValue()));
                break;
            case MULTIPLICATION:
                setResult(multiplyOperator.operate(num1.doubleValue(), num2.doubleValue()));
                break;
            case DIVISION:
                setResult(divideOperator.operate(num1.doubleValue(), num2.doubleValue()));
        }
        return result;
    }

    //getter
    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    //setter
    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void addResult(double num) {
        res.add(num);
    }

    public void removeResult(int num) {
        res.remove(num);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void inquiryResults() {
        if (!res.isEmpty()) {
            res.forEach(System.out::println);
        } else {
            System.out.println("No results to display.");
        }
    }
}
