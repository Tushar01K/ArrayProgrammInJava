package Array;

public class printindexofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50 };
		int ele = 40;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				System.out.println(i);
				cnt++;
			}

		}
		if (cnt == 0)
			System.out.println(" not found");

	}

}
