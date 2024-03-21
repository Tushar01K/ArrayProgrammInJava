package Array;

import java.util.Arrays;

public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,1,3,4,7};
		//Arrays.sort(a);
		System.out.println("triplet pairs <12");
		for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
			for (int k = j+1; k < a.length; k++) {
				
				//System.out.println(a[i]+" "+a[j]+" "+a[k]);    //for all triplets
				
			
				if(a[i]+a[j]+a[k]<12)

					System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
			
		}
			
		}
		

	}

}
