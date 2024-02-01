package ch08.ex01;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 1
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        answer = sb.reverse().toString();
        
        // 2
        int len = my_string.length();
        char[] reverse = new char[len];
        for(int i=0; i < len; i++) {
        	reverse[i] = my_string.charAt(len-1-i);
        }
        answer = reverse.toString();
        
        
        return answer;
    }
}