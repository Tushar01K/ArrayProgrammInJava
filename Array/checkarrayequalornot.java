package Array;

public class checkarrayequalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 40, 40, 50 };

		if (a.length == b.length) {
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == b[i])
					cnt++;
			}
			if (cnt == a.length) {

				System.out.println("array is equale");

			} else {

				System.out.println("array  is not equal");
			}

		} else {

			System.out.println("not equal");

		}
	}

}
