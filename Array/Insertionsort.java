package Array;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {33,55,11,77,66,88};
		for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j = i-1;
			for (; j>=0; j--) {
				if(a[j]>temp)
				{
					a[j+1]=a[j];
				}
				else
					break;
			}
			
			a[j+1]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
