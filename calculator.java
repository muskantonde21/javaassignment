package ifelse;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter operator you want:-");
		Scanner sc=new Scanner(System.in);
		String op=sc.next();
		System.out.println("Enter the numbers you want:-");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if (op.equalsIgnoreCase("Addition")){
			System.out.print(num1+num2);	
		}else if (op.equalsIgnoreCase("substraction")) {
			System.out.print(num1-num2);
		}else if (op.equalsIgnoreCase("multiplication")) {
			System.out.print(num1*num2);
		}else if (op.equalsIgnoreCase("division")) {
			System.out.println(num1/num2);
		}else {
			System.out.println("something went wrong");
		}

	}

}
