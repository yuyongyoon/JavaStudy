package ch09.ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 23);
		map.put("nam", 24);
		map.put("yun", 25);
		map.put("jin", 26);
		
		
		// map의 key로 set 만들기
		Set<String> keySet = map.keySet();				

		System.out.println("Map 값 꺼내기1 [code review]");
		// map -> set -> iterator(key/value) -> get(key)
		Iterator<String> iter = keySet.iterator();		// set을 iterator화 시킴
		
		while (iter.hasNext()) {						// iter 요소(key)가 없을 때까지 반복
			String key = (String) iter.next();			// iter 요소(key) 하나씩 뽑아
			System.out.println(key+" : "+map.get(key));	// map에서 해당 key의 value 뿌리기
		}

		System.out.println("\nMap 값 꺼내기2");
		// map -> set -> iterator(key/value) -> get(key)
		for (Iterator it = keySet.iterator(); it.hasNext();) {
			String key = (String) it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
		System.out.println("\nMap 값 꺼내기3 [code review]");
		// map -> set<Entry<key,value>> -> iterator(entry) -> get(key,value)
		Set<Entry<String, Integer>> entrySet = map.entrySet();				// map -> Entry<key,value>형태로 Set에 저장
		Iterator<Entry<String, Integer>> entryIter = entrySet.iterator();	// set -> entry형태로 Iterator화
		
		while (entryIter.hasNext()) {
			Entry<String, Integer>entry = entryIter.next();					// iterator 요소를 entry에 하나씩 저장
			System.out.println(entry.getKey()+" : "+entry.getValue());		// entry의 key, value 각각 출력
		}
		
				
	}

}
