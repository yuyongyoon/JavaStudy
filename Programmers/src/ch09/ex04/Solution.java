package ch09.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int[] arrS = new int[s.length()];
        int i = 0;
        
        // 문자열 찢어서 배열에 하나씩 저장
        for (String shape : s.split("")) {
//			System.out.println(shape);
			
        	if(shape.equals(")")) {
				arrS[i] = -1;
			}else if(shape.equals("(")) {
				arrS[i] = 1;
			}
			i++;
		}
        
        // 문제 찾기
        int sum = 0;
        for (int j = 0; j < arrS.length; j++) {
			if(arrS[0] == -1 || arrS[arrS.length-1] == 1) {
				answer = false;
			} else {
				sum += arrS[j];
			}
			
		}
        if(sum != 0) {
        	answer = false;
        }
        
        // test
//        for (int h = 0; h < arrS.length; h++) {
//			System.out.println(arrS[h]);
//		}
//        
        return answer;
    }
}