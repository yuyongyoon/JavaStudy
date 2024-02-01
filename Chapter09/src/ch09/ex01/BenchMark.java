package ch09.ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchMark {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		List<String> lnk = new LinkedList<String>();
		
		for (int i = 0; i < 100; i++) {
			arr.add("data");
			lnk.add("data");
		}
		
		long startT = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++) {
			lnk.add(55, "data");
		}
		long endT = System.currentTimeMillis();
		System.out.println("linked : "+(endT-startT)+"ms");

		startT = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++) {
			arr.add(55, "data");
		}
		endT = System.currentTimeMillis();
		System.out.println("array : "+(endT-startT)+"ms");
		
	}

}
