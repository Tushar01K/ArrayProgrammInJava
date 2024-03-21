package Array;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70};
		int startindex=0;
		int endindex=a.length-1;
		
		while(startindex<endindex) {
			
			int temp =a[startindex];
			a[startindex]=a[endindex];
			a[endindex]=temp;
			startindex++;
			endindex--;
			
		}
		//print array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}

	}

}
