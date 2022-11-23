package strings;
import java.util.Scanner;
public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String value=new String("   python   ");
		System.out.println(value.charAt(0));
		System.out.println(value.concat("programing"));
		System.out.println(value.length());
		System.out.println(value.substring(2));
		System.out.println(value.substring(2,4));
		System.out.println(value.replace('y','a'));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.trim());
		System.out.println(value.isEmpty());		

	}

}
