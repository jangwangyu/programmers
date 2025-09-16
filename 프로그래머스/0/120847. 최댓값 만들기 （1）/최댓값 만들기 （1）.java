class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max2 = num;
            }
            answer = max1 * max2;
        }
        return answer;
    }
}