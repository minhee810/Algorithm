class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군 개미 : 5 
        // 병정 개미 : 3 
        //  일  개미 : 1 
        
        // 여치 : 체력 23 
        // 장군 개미 4 + 병정 개미 1 -> 20 + 3 = 23 
        // 사냥감의 체력 hp가 매개변수로 주어질 때, 
        // 사냥감의 체력에 딱 맞게 
        // 최소한의 병력을 구하려면 몇마리의 개미 필요한지 리턴
        int jang = 0;
        int byeong = 0; 
        int ill = 0; 
        
        if(hp >= 5){
            jang = hp/5; 
            System.out.println("장군개미 : " + jang);
           hp = hp - (5 * jang);
        }
        
        if(hp >= 3){
            byeong = hp / 3; 
            System.out.println("병 개미 : " + byeong);
            hp = hp - (3 * byeong);
        }
        
        if(hp >= 1){
            ill = hp / 1; 
            System.out.println("일 개미 : " + ill);
            hp = hp - (1 * ill); 
        }
        answer = jang + byeong + ill;
        System.out.println("answer : " + answer);
        return answer;
    }
}