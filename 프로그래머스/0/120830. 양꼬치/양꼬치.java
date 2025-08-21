class Solution {
    public int solution(int n, int k) {
        int a = (n / 10) * 2000; // 서비스 음료수 값
        int answer = (n * 12000) + (k * 2000) - a;
        return answer;
    }
}