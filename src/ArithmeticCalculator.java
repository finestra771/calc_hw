import java.util.ArrayList;

public class ArithmeticCalculator implements Calculator {
    private int num1;
    private int num2;
    private double result;
    private char operator;
    ArrayList<Double> res = new ArrayList();
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ArithmeticCalculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public double calc() {
        char operator=getOperator();
        switch (operator) {
            case '+':
                result=addOperator.operate(num1, num2);
                break;
            case '-':
                result=subtractOperator.operate(num1, num2);
                break;
            case '*':
                result=multiplyOperator.operate(num1, num2);
                break;
            case '/':
                if (num2 != 0) result=divideOperator.operate(num1, num2);
                else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = 0;
                }
        }
        addResult(result);
        return result;
    }

    //getter
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    //setter
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void addResult(double num) {
        res.add(num);
    }

    public void removeResult(int num) {
        res.remove(num);
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }
    public void inquiryResults() {
        for (Object i : res) {
            System.out.print(i + " ");
        }
    }
}
