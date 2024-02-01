package ch09.ex02;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Java1");
		set.add("Java2");
		set.add("Java3");
		set.add("Java4");
		set.add("Java5");
		System.out.println(set+" : "+set.size());
		
		// new는 객체 복사 -> 중복이 아닌 다른 객체
		HashSet<Member> member = new HashSet<Member>();
		
		member.add(new Member());
		member.add(new Member());
		
		System.out.println(set+" : "+member.size());
		System.out.println();
		
		set.remove("Java");
		
		// set 출력1
		Iterator<String> iter = set.iterator();
		
		System.out.println("출력 방법1");
		while(iter.hasNext()) {
			System.out.println(iter.next());	
		}
		System.out.println();
		
		// set 출력2
		System.out.println("출력 방법2");
		for (String i : set) {
			System.out.println(i);
		}
		System.out.println();

	}

}

class Member {
	
}
