class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int a = 1;
            for(int j = 0; j < n; j++){
                if(emergency[i] < emergency[j]){
                    a++;
                }
            }
            answer[i] = a;
        }
        
        return answer;
    }
}