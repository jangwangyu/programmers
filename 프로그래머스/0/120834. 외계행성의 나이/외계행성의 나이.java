class Solution {
    public String solution(int age) { // 배열 집어넣어야함 0 ~ 10 a ~ j
        String answer = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(char c : answer.toCharArray()){
            int digit = c - '0';
            char b = (char)('a' + digit);
            sb.append(b);
        }
        
        return sb.toString();
    }
}