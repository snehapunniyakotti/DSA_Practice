package sorting1;

import java.util.Arrays;

public class SelectionSortAlgorithm {
	
	public static void main(String[] args) {
		int[] notSorted = {45,3,5,65,234,56,78};
		System.out.println(Arrays.toString(notSorted) );
		System.out.println("((((((((((((((((((((((((((");
	    selectionSortMethod(notSorted);
		System.out.println(Arrays.toString(notSorted));
	}
	
	static int[]  selectionSortMethod(int[] sortList) {
		int len = sortList.length;
		for(int i=0;i<len-2;i++) {
			int min = i;
			for(int j = i ; j<len-1;j++) {
				if(sortList[j]<sortList[min]) {
					min = j;
				}
			}
			int temp = sortList[i];
			sortList[i] = sortList[min];
			sortList[min] = temp;
		}

		return sortList;
	}

}
