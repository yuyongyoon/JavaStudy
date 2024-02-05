package ch09.ex01;

import java.util.HashMap;
import java.util.Map;

// 자릿수 나누는 문제(매우 중요)
public class Solution {
    public String solution(String letter) {
        String answer = "";
        
//        Stringi morse = {
//        		".-":"a","-...":"b","-.-.":"c","-..":"d",".":"e","..-.":"f",
//        	    "--.":"g","....":"h","..":"i",".---":"j","-.-":"k",".-..":"l",
//        	    "--":"m","-.":"n","---":"o",".--.":"p","--.-":"q",".-.":"r",
//        	    "...":"s","-":"t","..-":"u","...-":"v",".--":"w","-..-":"x",
//        	    "-.--":"y","--..":"z"
//        };
        
//        System.out.println(letter);
        
        Map<String, String> morse = new HashMap<String, String>();
        
        // morse map에 넣기
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");
        
        
        // letter 공백 제거 -> 문자 하나씩 저장
        String[] letters = letter.split(" ");

        StringBuilder builder = new StringBuilder();
        for(String str : letters) {
        	builder.append(morse.get(str));
        }
        
        answer = builder.toString();
               
        return answer;
    }
}