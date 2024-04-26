import java.util.ArrayList;

public class Calculator {
    private int num1;
    private int num2;
    private int result;
    ArrayList<Integer> res = new ArrayList();

    public int calculate(char operator) {
        switch (operator) {
            case '+':
                add(num1, num2);
                break;
            case '-':
                sub(num1, num2);
                break;
            case '*':
                mul(num1, num2);
                break;
            case '/':
                if (num2 != 0) div(num1, num2);
                else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = 0;
                }
        }
        return result;
    }

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int sub(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int mul(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int div(int num1, int num2) {
        result = num1 / num2;
        return result;
    }

    //getter
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResult() {
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

    public void addResult(int num) {
        res.add(num);
    }

    public void removeResult(int num) {
        res.remove(num);
    }

    public void inquiryResults() {
        for (Object i : res) {
            System.out.print(i + " ");
        }
    }
}
