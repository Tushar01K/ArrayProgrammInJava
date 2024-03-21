package Array;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {22,11,44,55,77,88};
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]>a[min]) {
					
					min=j;
				}
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
				
				
			}
			
		}
		//System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}

	}

}
