package javaBasics;

public class Twodimarray {

	public static void main(String[] args) {
	
		int arr[][] = new int[3][5];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 21;
		arr[0][4] = 45;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[1][3] = 80;
		arr[1][4] = 70;
		
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		arr[2][3] = 10;
		arr[2][4] = 11;
		
		System.out.println("no.of rows: "+arr.length);//no.of rows
		System.out.println("no.of columns: "+arr[0].length);//no.of columns
		System.out.println(arr[1][1]);
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[0].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}
