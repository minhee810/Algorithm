import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        // 최빈값 : 주어진 값 중에서 가장 자주 나오는 값    
        int answer = 0;
        Arrays.sort(array); // 요소 정렬
        
        int max = array[array.length - 1]; 
        int[] count = new int[max+1]; 

        for(int i = 0; i < array.length; i++){
            int number = array[i];
            count[number]++; // 각 숫자의 등장 횟수를 count 배열에 누적하여 저장 
            // count[array[i]]++;
        }
        
        int top = count[0]; 
        
        for(int i = 1; i < count.length; i++){
            if(top < count[i]){
                top = count[i];
                answer = i;
            }else if(top == count[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}