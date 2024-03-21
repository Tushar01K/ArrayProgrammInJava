package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int evencnt = 0;
		int oddcnt = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)
				evencnt++;
			else
				oddcnt++;

		}
		int[] evenarr = new int[evencnt];
		int[] oddarr = new int[oddcnt];
		int evenindex = 0;
		int oddindex = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				evenarr[evenindex] = a[i];
				evenindex++;
			} else {
				oddarr[oddindex] = a[i];
				oddindex++;
			}

		}
		//System.out.println(Arrays.toString(evenarr));
		//System.out.println(Arrays.toString(oddarr));
		for (int i = 0; i < oddarr.length; i++) {
			System.out.print(oddarr[i]+" " );
		
			
		}
		System.out.println();
		for (int i = 0; i <evenarr.length; i++) {
			System.out.print(evenarr[i]+" ");
			
		}
	}
}