package Array;

import Conditional.Maxnum;

public class findminelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {77,22,44,21,11,66,55,78,90,33};
	 //int min=Integer.MAX_VALUE;
	// int max =Integer.MIN_VALUE;
	 
	 int min=a[0];
	 int max=a[0];
	 for(int i=0;i<a.length;i++) {
		 
		 if(a[i]<min)
			 min=a[i];

		 if(a[i]>max)
			 max=a[i];
	
		 
	 }
		
System.out.println("min element : "+min);

System.out.println("max element : "+max);
	}

}
