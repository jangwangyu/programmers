import java.util.*;

class Solution {
    public String solution(String letter) {
        
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], String.valueOf((char)('a' + i)));
        }
        
        // 입력 문자열을 공백 기준으로 나눔
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String code : arr) {
            sb.append(map.get(code));
        }
        
        return sb.toString();
    }
}