class Solution {
    public int solution(int n) { // n = n
        int answer = 0; 
        
        // 1. for(){} : 반복문을 돌려서 a, b 수를 증가시켜야한다. 
        // 2. if(){} : if문을 통해 a * b == n인 경우를 카운트 해야한다.  
        for(int i = 1; i <= n; i++){ // 100 
            if(n % i == 0) answer++;
        }
        return answer;
    }
}