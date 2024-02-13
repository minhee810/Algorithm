class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String str = my_string; 
        int length = my_string.length(); 
        
        
        answer = str.substring(length-n, length);
        
        
        return answer;
    }
}