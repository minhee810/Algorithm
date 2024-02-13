import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        char[] charArray = a.toCharArray(); 
        
        for(char c : charArray){
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}