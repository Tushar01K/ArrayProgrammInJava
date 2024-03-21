package Array;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 3, 1, 5, 6, 7 };
		int uni = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;

			}
			if (cnt == 0)
				uni++;

		}
		int b[] = new int[uni];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;

			}
			if (cnt == 0)
				b[index++] = a[i];

		}
		for (int x : b) {
			System.out.print(x + " ");

		}

	}

}
