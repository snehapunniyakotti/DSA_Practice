package sorting1;

import java.util.Arrays;

public class bubbleSortAlgorithm {

	public static void main(String[] args) {
		int[] notSorted = {43,656,2,86,35,0,6};
		System.out.println(Arrays.toString(notSorted) );
		System.out.println("((((((((((((((((((((((((((");
		bubbleSort(notSorted);
		System.out.println(Arrays.toString(notSorted));
	}
	
	static int[] bubbleSort(int[] sortList) {
		int len = sortList.length;
		for(int i = len-1; i>=0;i--) {
			for(int j =0;j<=i-1;j++) {
				if(sortList[j]>sortList[j+1]) {
					int temp = sortList[j];
					sortList[j] = sortList[j+1];
					sortList[j+1]=temp;
				}
			}
		}
		
		return sortList;
	}
}
