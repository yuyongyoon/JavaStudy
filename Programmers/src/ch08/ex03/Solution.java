package ch08.ex03;

// 자릿수 나누는 문제(매우 중요)
public class Solution {
    public String solution(int age) {
        String answer = "";
        
        // 1 
        String pa = "abcdefghij";				//각 위치별로 바꿀 문자 나열
        StringBuilder builder = new StringBuilder();
        
        while(age > 0) {
        	// 자릿수 뒤에부터 문자로 변환
            builder.append(pa.charAt(age%10));	// 0 0 1 
        	age /= 10;       					// 10 1 0
        }
        answer = builder.reverse().toString();
        
        // 2
        String str = String.valueOf(age);	// 숫자 -> 문자열
        String[] strAge = str.split("");	// 문자열 -> 문자 배열로 저장
        
        for(String s : strAge) {				// 문자 배열을 문자 하나씩 꺼내기
        	int numAge = Integer.parseInt(s);	// 문자->숫자로 변환
        	answer += (char)(numAge+97);		// 숫자->문자 변환 후 정답에 하나씩 저장
        }
        
        
        return answer;
    }
    
}