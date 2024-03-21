package Array;

public class unicpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 2 };
		int uniqueele = 0;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;
			}
			if (cnt == 0) {

				uniqueele++;

			}

		}
		int[] b = new int[uniqueele];
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;

			}
			if (cnt == 0) {
				b[index] = a[i];
				index++;

			}

		}
		System.out.println("***** original pairs ******");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i] + " " + a[j]);
			}

		}

		System.out.println("****unique pairs*****");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i] + " " + b[j]);
			}

		}

	}

}
