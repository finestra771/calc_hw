import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;


//        int[] res=new int[10];
        int num = 0;
        while (flag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            Calculator calc = new Calculator();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            int result = 0;
            calc.setNum1(firstNum);
            calc.setNum2(secondNum);
            result = calc.calculate(operator);

            calc.addResult(result);
//            num++;
//            if (num > 10) {
//                int[] newres = new int[10];
//                for (int i = 0; i < 9; i++) {
//                    newres[i] = res[i];
//                }
//                newres[9] = result;
//            }
            System.out.println("결과: " + result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String line=sc.next();
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
