package switchcase;

import java.util.Scanner;

public class switchcase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the operation to be performed ");
		Scanner sc=new Scanner(System.in);
		char operation=sc.next().charAt(0);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		switch(operation)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*+num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default :
			System.out.println("I am not implemented");
		}
		System.out.println("I am continued");

	}

}