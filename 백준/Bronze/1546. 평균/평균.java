import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 3
        int[] A = new int[N]; // 길이가 3인 배열 생성

//        for (int i = 0; i < A.length; i++) { // 길이가 3인 배열에 입력되는 성적 저장
//            A[i] += sc.nextInt(); // A 배열에 입력되는 값 저장하기
//        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < A.length; i++) {
            int tmp = sc.nextInt();
            if (tmp > max) {
                max = tmp;
            }
            sum += tmp;
        }

        System.out.println(sum*100.0/max/N);
    }
}