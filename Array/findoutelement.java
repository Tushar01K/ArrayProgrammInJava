package Array;

public class findoutelement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int ele=40;
		int cnt=0;
		int[] a= {10,20,30,40,20,50};

		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]==ele) {
				
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("not found");
		else
			System.out.println("found");
	}

}
