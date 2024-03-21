package Array;

public class firstoddtheneven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int ecnt = 0;
		int ocnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ecnt++;
				System.out.println(a[i]);
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				ocnt++;
				System.out.println(a[j]);
			}

		}

	}

}
