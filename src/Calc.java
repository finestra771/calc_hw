import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Calculator calc = new Calculator();
//        int[] res=new int[10];
        int num = 0;
        while (flag) {
            System.out.print("사칙연산은 1, 원의 넓이 구하기는 2를 선택하세요: ");
            switch (sc.nextInt()) {

                case 1:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int firstNum = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int secondNum = sc.nextInt();

                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
                    int result = 0;
                    calc.setNum1(firstNum);
                    calc.setNum2(secondNum);
                    result = calc.calculate(operator);

                    System.out.println("결과: " + result);
                    calc.addResult(result);
                    break;
                case 2:
                    System.out.print("원의 반지름을 입력하세요: ");
                    int radius = sc.nextInt();
                    calc.setRadius(radius);
                    double circle_result = calc.calculateCircleArea(calc.getRadius());
                    System.out.println("결과: " + circle_result);
                    break;
                default:
                    System.out.println("잘못된 입력값입니다. 프로그램을 종료합니다.");
                    flag = false;
            }
//            num++;
//            if (num > 10) {
//                int[] newres = new int[10];
//                for (int i = 0; i < 9; i++) {
//                    newres[i] = res[i];
//                }
//                newres[9] = result;
//            }
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String line = sc.next();
            if (line.equals("remove")) {
                calc.removeResult(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                calc.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")) flag = false;
        }
    }
}
