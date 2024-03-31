class Solution {
    public String solution(String code) {
        String ret = "";
        
        int mode = 0;
        int len = code.length();
        char[] codeArr = code.toCharArray();
        
        if (code.isEmpty()) {
            return "EMPTY";
        }

        
        for(int i = 0; i < len; i++){
           
            if(mode == 0){
                
                if(codeArr[i] != '1'){
                    if(i%2 == 0){
                        ret += codeArr[i];
                    }
                }else{
                    mode = 1;
                }
            
            }else if(mode == 1){
                
                if(codeArr[i] != '1'){ //5
                    if(i%2 == 1){
                        ret += codeArr[i];
                    }
                }else{
                    mode = 0;
                }
                
            }
       }
    
        if(ret.equals("")){
            ret = "EMPTY";
        }

        
        return ret;
    }
}