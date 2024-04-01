class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        // 짝수 홀수 마다 각각의 배열의 크기 지정 
        if(n % 2 == 0){
            answer = new int[n / 2]; 
        }else{
            answer = new int[(n + 1) / 2]; 
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = (i * 2) + 1; 
        }
        
        return answer; 

    }
}