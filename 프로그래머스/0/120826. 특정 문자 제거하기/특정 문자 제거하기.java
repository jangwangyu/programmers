class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.toString(arr[i]).equals(letter)){
                continue;
            }
            answer+=arr[i];
        }
        return answer;
    }
}