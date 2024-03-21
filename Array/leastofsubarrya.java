package Array;

public class leastofsubarrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,7,90,20,5,50,40};
		int k=3;
		int min= Integer.MAX_VALUE;
		int startindex=-1;
		for (int i = 0; i <= a.length-3; i++) {
			int sum=0;
			for (int j= i; j <i+k; j++) {
				sum=sum+a[j];
				
				
			}
			int avg=sum/k;
			if(avg<min) {
				min=avg;
				startindex=i;
			}
			
		}
	System.out.println(min);
	System.out.println(startindex);

	}

}
