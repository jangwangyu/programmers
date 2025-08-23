class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = (n * 6) / gcd(6, n);
        return answer / 6;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    
}