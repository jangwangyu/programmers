class Solution {
    public int solution(int[] array) {
        // 1. min, max 찾기
        int min = array[0], max = array[0];
        for (int v : array) {
            if (v < min) min = v;
            if (v > max) max = v;
        }

        // 2. 배열 만들기
        int[] count = new int[max - min + 1];
        for (int v : array) {
            count[v - min]++;
        }

        // 3. 최빈값 찾기
        int mode = 0;     
        int modeCount = 0; 
        boolean tie = false; 

        for (int i = 0; i < count.length; i++) {
            if (count[i] > modeCount) {
                modeCount = count[i];
                mode = i;       
                tie = false;    
            } else if (count[i] == modeCount) {
                tie = true;     
            }
        }

        return tie ? -1 : mode + min;
    }
}
