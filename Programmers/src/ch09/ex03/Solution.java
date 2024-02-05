package ch09.ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution
{
    public int solution(int []arrA, int []arrB) {
        int answer = 0;
   
//        System.out.println("before");
//        System.out.print("A: ");
//        printArr(arrA);
//        System.out.print("B: ");
//        printArr(arrB);

        // 정렬
    	System.out.println("\nafter");
        arrA = makeSort(arrA);
        arrB = makeSort(arrB);
        
        // 최솟값 구하기
    	System.out.println("\nResult");
        answer = minSum(arrA, arrB);

        return answer;
    }
    
    public int minSum(int []arrA, int []arrB) {
    	int min = 0;
    	int sum = 0;
    	int a = 0; 
    	int b = 0;
    	
    	System.out.println(arrB.length);
    	for (int i = 0; i < arrA.length; i++) {
    		System.out.print(arrA[i]+" * "+arrB[arrB.length-1-i]+" = ");
    		min = (arrA[i]*arrB[(arrB.length-1)-i]);
			System.out.println(min);
		}
    	return min;
    }
    
    public int [] makeSort(int []arr) {
    	int temp=0;
    	
    	for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
    	printArr(arr);
    	
    	return arr;
    }
    
    public void printArr(int []arr) {
    	System.out.println("배열 확인");
    	//출력
    	for (int i = 0; i < arr.length; i++) {
			System.out.println(i+ " : " +arr[i]);
		}
    	System.out.println();
    }
   
}