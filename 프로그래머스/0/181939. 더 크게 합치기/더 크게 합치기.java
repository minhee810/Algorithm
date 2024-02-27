class Solution { // 9,  91 
    public int solution(int a, int b) {
        int answer = 0;
        String str_a = String.valueOf(a); 
        String str_b =  String.valueOf(b); 
        int ab = Integer.parseInt(str_a + str_b);  // 991
        int ba = Integer.parseInt(str_b + str_a);   // 919
            
        if(ab > ba){
            return ab; 
        }else {
            return ba;
        }
    }
}