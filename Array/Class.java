package Array;

import java.util.Iterator;

public class Class {

	public static void main(String[] args) {

		int scnt = 0;
		int end = 5;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= end; j++) {
				if (j <= scnt) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			scnt++;
			end--;
		}
	}

}
