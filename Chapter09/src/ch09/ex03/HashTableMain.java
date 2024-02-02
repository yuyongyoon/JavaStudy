package ch09.ex03;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashTableMain {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("sss", 99);
		map.put("kkk", 98);
		
		for(int i=34; i<95; i++) {
			map.put(String.valueOf(i), i);
		}
		
		boolean contain = map.containsKey("45");
		System.out.println("45 : "+contain);
		
		contain = map.containsValue(99);
		System.out.println("99 : "+contain);
		System.out.println(map.get("64"));
		
		System.out.println("===================");
		
		// 값으로 키를 찾는 방법1
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (String key : map.keySet()) {
			int val = map.get(key);
			if(val == input) {
				System.out.println(val+" : "+key);
			}
		}
		
		// 값으로 키를 찾는 방법2
		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			if(val == input) {
				System.out.println(val+" : "+key);
			}
		}
		
		// =======================================================
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
	
		
		while (it.hasNext()) {
			Entry<String,Integer> entry = it.next();

			if(entry.getValue().equals(input)) {
				System.out.println(entry.getKey());
				
			}
			
		}
		
	}
	
}
