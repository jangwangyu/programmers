class Solution {
    public int solution(int slice, int n) {
        int answer = 0; // 피자 수
        while(n > 0){ // 사람의 수가 0보다 크면 실행
            answer += 1; // 사람의 수가 0보다 크면 피자 수 1 증가
            n =  n - slice; // 사람 - slice (slice가 0 이하면 반복문 종료)
        }
        
        return answer;
    }
}