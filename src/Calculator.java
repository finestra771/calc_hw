public class Calculator {
    public int num1;
    public int num2;
    public int result;

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
}
