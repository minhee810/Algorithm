class Solution {
    public int[] solution(int money) {
        
        int[] answer = new int[2];
        
        // 1. 최대로 마실 수 있는 아메리카노의 잔수 
        int cup = money / 5500;   
        
        // 2. 남는 돈 
        int changes = money % 5500; 
        
        answer[0] = cup; 
        answer[1] = changes; 
        
        return answer;
    }
}