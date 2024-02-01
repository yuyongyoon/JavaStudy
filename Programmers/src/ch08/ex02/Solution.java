package ch08.ex02;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // 1
        char spell;
        for(int i = 0; i<my_string.length(); i++) {
        	spell = my_string.charAt(i);
        	int j = 0;
        	while(j < n) {
        		answer += spell;
        		j++;
        	}
        	
        }
        // 2
        StringBuffer sb = new StringBuffer();
        String[] arr = my_string.split("");	// 문자 뽑아내기
        
        for(String str:arr) {
        	sb.append(str.repeat(n));
        }
        
        answer = sb.toString();
        	
        return answer;
    }
}