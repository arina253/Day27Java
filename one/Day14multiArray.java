package one;

public class Day14multiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MULTIDIMENSIONAL ARRAYS

		int[][] marks3 = new int[3][4];             //Method 1 of defining array
		marks3[0][0] = 1;
		marks3[0][1] = 2;
		marks3[0][2] = 3;
		marks3[0][3] = 4;

		marks3[1][0] = 11;
		marks3[1][1] = 22;
		marks3[1][2] = 33;
		marks3[1][3] = 44;

		marks3[2][0] = 555;
		marks3[2][1] = 666;
		marks3[2][2] = 777;
		marks3[2][3] = 888;

		System.out.println(marks3[1][2]);

		// Program 1
		
		//int [][] marks3 = {{1,2,3,4},{11,22,33,44},{555,666,777,888}};     //Method 2 of defining array

		// {1,2,3,4}
		// {11,22,33,44}
		// {555,666,777,888}

		// for loop

		for (int i = 0; i < marks3.length; i++) {
			System.out.println(i);
			int[] arr = marks3[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		
		//Program 2
		
		int [][]numbers2 = {
				{11,22,33},
				{44,55,66},
				{77,88,99},
		};
		
		for (int t = 0; t < numbers2.length; t++) {
		int [] arr2 = numbers2[t];
		for (int t1 = 0; t1 < arr2.length;t1++) {
		System.out.println(arr2[t1]);
		
			
		}
		
		}
		
		//while loop
		//Program 3
		
		int r1 = 0;
		while (r1 < numbers2.length) {
			
			int arr2[]=numbers2[r1];
			
			int c1 = 0;
			while (c1 < arr2.length) {
				System.out.println(arr2[c1]);
				c1++;
			}
			r1++;
		}
		
		
		//Program 4
		//using for each loop
		
		for (int []row:numbers2) {
			for (int col : row) {
				System.out.println(col);
			}
		}

		
		
		
	}
	
}


