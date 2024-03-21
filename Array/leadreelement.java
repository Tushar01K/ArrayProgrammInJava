package Array;

import java.util.Arrays;
import java.util.Iterator;

public class leadreelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 44, 77, 66, 22, 33, 55, 44 };
		for (int i = 0; i < a.length; i++)
		{
			int cnt = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]> a[i])
					cnt++;
			}

			if (cnt == 0)
				System.out.println(a[i]);

		}
	}
}
