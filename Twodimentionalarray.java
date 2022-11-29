package Array;

import java.util.Scanner;

public class Twodimentionalarray  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int column;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns of the 2 dimensional Arrays");
		row=sc.nextInt();
		column=sc.nextInt();
		String[][]name=new String [row][column];
		System.out.println("Enter the string values of array");
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				name[i][j]=sc.next();
			}
		}
		
		System.out.println("My Array is");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}