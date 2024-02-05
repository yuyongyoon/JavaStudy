package ch09.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public long solution(String numbers) {
    	long answer = 0;
    	
    	// 방법1
    	String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	
    	for(int i=0; i < arr.length; i++) {
    		numbers = numbers.replace(arr[i], String.valueOf(i));
    	}
    	
    	// 방법2
        Map<String, String> numMap = new HashMap<String, String>();
        
        // numMap map에 넣기
        numMap.put("zero","0");
        numMap.put("one","1");
        numMap.put("two","2");
        numMap.put("three","3");
        numMap.put("four","4");
        numMap.put("five","5");
        numMap.put("six","6");
        numMap.put("seven","7");
        numMap.put("eight","8");
        numMap.put("nine","9");
        
        // map을 entrySet으로 쪼개 각 Entry에 넣어주기 반복
        for (Entry<String, String> entry : numMap.entrySet()) {

			numbers = numbers.replaceAll(entry.getKey(), entry.getValue());	// numbers에서 key와 동일한 문자 -> value 치환
		}
        
        answer = Long.parseLong(numbers); // 타입 변환
        
        return answer;
    }
}