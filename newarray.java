package Array;

import java.util.Scanner;
public class newarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of  elemnts");
		int n=sc.nextInt();
		int[] myarray=new int[n];
		for (int i=0;i<n;i++) {
			myarray[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			System.out.println(myarray[i]);
		}

	}

}
