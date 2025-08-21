class Solution {
    public int solution(int angle) {
        int num = 0;
        int answer = 0;
        if(0 < angle && angle < 90){
            num = 1;
        }else if(angle == 90){
            num = 2;
        }else if(90 < angle && angle < 180){
            num = 3;
        }else if(angle == 180){
            num = 4;
        }
        answer = num;
        return answer;
    }
}