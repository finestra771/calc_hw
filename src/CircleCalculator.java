import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    private int result;
    private ArrayList<Double> res_circle = new ArrayList();
    private static final double pi = 3.14; //pi는 변하지 않는 값이기 때문에 static final 작성
    private static int radius;

    public CircleCalculator() {
        this.res_circle.clear();
        this.radius = 0;
    }
    public double calc() {
        double result = pi * getRadius() * getRadius();
        res_circle.add(result);
        return result;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void inquiryCircleResults() {
        for (Object i : res_circle) {
            System.out.print(i + " ");
        }
    }
}
