import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    슈도 코드 작성하기
    suNo(숫자 개수), quizNo(질의개수) 저장하기
    for(숫자 개수만큼 반복하기) {
        합 배열 생성하기 (S[i] = S[i-1] + A[i])
    }

    for(질의 개수만큼 반복하기){
        질의 범위 받기(i~j)
        구간 합 출력하기 (S[j]-S[i-1])
    }
     */

    public static void main(String[] args) throws IOException {

        // 데이터의 갯수가 많을 경우 스캐너보다는 버퍼드리더로 데이터 받기
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        // 한줄로 길게 데이터가 들어올 경우 int 로 받기 힘듦.
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());

        // 첫 줄 받기
        int suNo = Integer.valueOf(stringTokenizer.nextToken());  // 5
        int quizNo = Integer.valueOf(stringTokenizer.nextToken());  // 3

        // 둘째 줄 받기
        // 들어오자마자 합배열 생성
        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());  // 5 4 3 2 1

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i-1] + Integer.valueOf(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.valueOf(stringTokenizer.nextToken());
            int j = Integer.valueOf(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }

    }
}