package Array;

import java.util.Arrays;

public class interleaving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		char[] s2 = { 'x', 'y', 'z' };
		char[] s3 = new char[s1.length + s2.length];
		int maxlen = -1;
		if (s1.length > s2.length) {

			maxlen = s1.length;

		} else {

			maxlen = s2.length;
		}
		int index = 0;
		for (int i = 0; i < maxlen; i++) {
			// add s1 ele in s3
			if (i < s1.length) {

				s3[index++] = s1[i];
				//index++;
			}
			if (i < s2.length) {

				s3[index++] = s2[i];
				//index++;
			}
		}
		System.out.println(Arrays.toString(s3));
	}

}
