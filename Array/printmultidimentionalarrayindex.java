package Array;

public class printmultidimentionalarrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int []c= {7,8,9};
		int [][]arr= {a,b,c};
		for (int i = 0; i < arr.length; i++)
		{
			//for (int j = 0; j < arr.length; j++) 
			for(int j=0;j<arr[i].length;j++ ){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
