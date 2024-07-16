class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        System.out.println(strlist.length);
        
        // 1. 각 반복문을 돌아가면서 [0], [1], [2] ... 배열의 원소 길이를 구한다.
        // 2. 구해진 원소의 길이를 다시 answer 배열에 넣는다.
        
        for(int i = 0; i < strlist.length; i++){
            int len = strlist[i].length(); 
            System.out.println("len :" + len);
            answer[i] = len;
        }
        return answer;
    }
}