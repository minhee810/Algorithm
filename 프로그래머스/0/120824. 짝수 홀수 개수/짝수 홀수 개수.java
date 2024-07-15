
class Solution {
    public int[] solution(int[] num_list) { // 1, 2, 3, 4, 5 -> 배열의 길이 4 
        int[] answer = new int[2]; // 짝수와 홀수의 개수를 담기 answer 배열의 길이가 2 answer[0], answer[1]
        // num_list : 정수가 담긴 리스트 
        for(int i=0; i < num_list.length; i++){  // i = 3
            if(num_list[i] % 2 == 0){ // x
                answer[0] += 1;  // answer[0] = 1 
            }else { // o 
                answer[1] += 1;  // answer[1] = 2 
            }
        }
    
        return answer;
    }
}