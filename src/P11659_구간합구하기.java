import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // 질의 개수, 숫자 개수 10만개 일 경우 scanner 보다는 BufferedReader 가 더욱 적합 
        BufferedReader bufferedReader = 
            new BufferedReader(new InputStreamReader(System.in));

            // 한줄로 데이터가 길게 들어올 경우 값을 분리하여 사용함 => StringTokenizer
            StringTokenizer stringTokenizer = 
                new StringTokenizer(bufferedReader.readLine()); // 예제의 1번째 줄을 받아옴. 
                int suNo = Integer.parseInt(stringTokenizer.nextToken());
                int quizNo = Integer.parseInt(stringTokenizer.nextToken());
                 
                // 합배열 선언 
                long[]S = new long[suNo + 1]; // 데이터를 배열은 0번 인덱스가 있는데, 이를 무시하고 질의를 바로 쓰고자 1로 시작하게 설정 

                stringTokenizer = 
                new StringTokenizer(bufferedReader.readLine());
                for (int i=1; i<=suNo; i++){
                    S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
                }

                for(int q=0; q<=quizNo; q++){
                    stringTokenizer = 
                    new StringTokenizer(bufferedReader.readLine());
                    int i = Integer.parseInt(stringTokenizer.nextToken());
                    int j = Integer.parseInt(stringTokenizer.nextToken());
                    System.out.println(S[j]-S[i-1]);
                }
    }
}
