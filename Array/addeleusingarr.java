package Array;
import java.util.Scanner;

public class addeleusingarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arr");
		int size=sc.nextInt();
		int a[] = new int [size];
		System.out.println("enter the element");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
