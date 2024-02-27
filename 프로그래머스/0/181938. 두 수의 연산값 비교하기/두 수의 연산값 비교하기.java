class Solution {  // 2, 91 
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = ""+a;
        String strB = ""+b; 
        String strAB = strA + strB; // 291 
        int ab = Integer.parseInt(strAB); 
        int ab2 = 2*a*b;  // 364
        
        return ab > ab2 ? ab : ab2; 
    }
}