package userinput;

import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value;
		int number;
		char myvalue;
		Double per;
		short number1;
		long number2;
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one string, one int, one char, one double value one , one short and long value :- ");
//		value=sc.nextLine();
		value=sc.next();
		number=sc.nextInt();
		myvalue=sc.next().charAt(0);
		per=sc.nextDouble();
		number1=sc.nextShort();
		number2=sc.nextLong();
		System.out.println(value+number+myvalue+per+number1+number2);
//		System.out.println(value);
		
	}
	
}