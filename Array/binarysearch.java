package Array;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 55, 22, 33, 44, 55, 66, 77, 88, 99 };
		int start = 0;
		int end = a.length - 1;
		int cnt = 0;
		int ele = 55;
		while (start <= end) {
			int mid = start + end / 2;
			if (ele == a[mid]) {
				cnt++;
				System.out.println("found at index :"+mid);
				break;
			}

			if (ele > a[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (cnt == 0)
			System.out.println("not found");

	}
}
