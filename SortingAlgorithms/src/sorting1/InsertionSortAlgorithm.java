package sorting1;

import java.util.Arrays;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		int[] notSorted = {-34,-4,0,7845,343,6,61,35,4};
		System.out.println(Arrays.toString(notSorted) );
		System.out.println("((((((((((((((((((((((((((");
		insertSortMethod(notSorted);
		System.out.println(Arrays.toString(notSorted));
	}
	
	static int[] insertSortMethod(int[] sortList) {
		int len = sortList.length;
		for(int i=0;i<len;i++) {
			int j = i;
			while(j>0 && sortList[j-1]>sortList[j]) {
				int temp = sortList[j];
			    sortList[j]	=sortList[j-1];
			    sortList[j-1]=temp;
			    
			    j--;
			}
		}
		
		
		return sortList;
	}
}
