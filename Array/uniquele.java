package Array;

public class uniquele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {11,22,33,44,11,55,66,44,33,88,99};
int uniqueele=0;
for(int i=0;i<a.length;i++) {
	
	
	int cnt=0;
for(int j=0;j<i;j++) {
	
	if(a[i]==a[j])
		cnt++;
	
}
if(cnt==0)
uniqueele++;
}
System.out.print(uniqueele);
	}

}
