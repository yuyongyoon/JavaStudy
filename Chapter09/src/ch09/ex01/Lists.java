package ch09.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Lists {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>(3);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		arr.add("collection");
		arr.add("thread");
		arr.add("java IO");
		arr.add("network");	// 배열과 달리 예외 발생X
		arr.add(3, "lambda");
		
		System.out.println(arr);
		
		System.out.println("size: "+arr.size());
		System.out.println("=========================");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + ":"+arr.get(i));
		}
		System.out.println();
		
		String val = arr.remove(3);
		System.out.println("remove "+val);
		System.out.println("=========================");
		
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println("=========================");
		
		// 배열 -> arraylist
		// arrya -> list -> arraylist
		// arrya -> list
		String[] arr2 = {"collection", "thread", "java IO", "network"};
		List<String> list2 = Arrays.asList(arr2);
		
		System.out.println(list2.size());
		
//		list2.add("Collect"); //array -> list 변환 후 수정X
		
		// list -> arrlist
		ArrayList<String> arrList = new ArrayList<String>();
		
		System.out.println("list -> arralist: "+arrList.addAll(list2));	// addAll(Collecion)
		 // array -> list 변환 후 수정X
		System.out.println("add 문자 to arrList: "+arrList.add("Collect"));
		System.out.println("=========================");
		
		//arraylist == vector : 동시 접근 막음
		List<Integer> sc = new Vector<Integer>();
		
		sc.add(70);
		sc.add(80);
		sc.add(90);
		sc.add(100);
		
		System.out.println("before: "+sc.set(0, 100));	// 기존값을 반환하고 새로운 값으로 초기화됨
		System.out.println("aftre: "+sc.get(0));
		
		System.out.println("\n39 included: "+sc.contains(39));
		
		System.out.println("\nwhere is 90: "+sc.indexOf(90));
		
		sc.clear();
		System.out.println("\nis empty: "+sc.isEmpty());
		
		
	}

}
