import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;


//        int[] res=new int[10];
        ArrayList<Integer> res = new ArrayList();
        int num = 0;
        while (flag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            int result = 0;
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum != 0) result = firstNum / secondNum;
                    else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        result = 0;
                    }
            }
            res.add(result);
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
            String line=sc.nextLine();
            System.out.println((int)line.charAt(0));
            if (line.equals("remove")) {
                res.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.nextLine().equals("inquiry")) {
                for (Object i : res) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit")) flag = false;
        }
    }
}
