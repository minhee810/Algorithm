class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String comp = ineq + eq; // <= 
        System.out.println(comp);
        
        if(comp.equals(">=")){
          answer = n >= m ? 1 : 0; 
        }else if(comp.equals("<=")){
          answer = n <= m ? 1 : 0;
        }else if(comp.equals(">!")){
          answer = n > m ? 1 : 0;
        }else if(comp.equals("<!")){
          answer = n < m ? 1 : 0;
        }
            
        
        return answer;
    }
}