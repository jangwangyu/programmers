class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        
        int a = money / coffee;
        int b = money % coffee;
        
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}