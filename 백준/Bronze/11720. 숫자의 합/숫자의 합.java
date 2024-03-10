import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 숫자의 개수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum 에 더하여 누적하기
        }

        System.out.println(sum);
        
    }
}