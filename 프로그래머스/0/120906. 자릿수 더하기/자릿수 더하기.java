class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        
        // 1. 10으로 나눈다. 
        // 2. 나머지를 answer에 더해준다. 
        // 3. for문을 얼마나 돌려야 하나. 
        // 10으로 나누면 나머지가 가장 끝 자리의 수가 된다. 그 수를 answer에 더해준다. 
            
        for(int i = 0; i <= str.length(); i++){
            answer += n % 10; 
            n = n/10;
        }
        // i = 0 -> 1234%10 = 4 
        //         1234/10 = 123
        // i = 1 -> 123 % 10 = 3 
        //         123/10 = 12
        return answer;
    }
}