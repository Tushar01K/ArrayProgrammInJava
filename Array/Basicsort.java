
package Array;

public class Basicsort {
public static void main(String []args) {
	int[]a= {55,33,22,55,77,11,44};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				
			}
			
		}
		
	}

	//System.out.println(Arrays.toString(a));
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		
	} 
}
}
