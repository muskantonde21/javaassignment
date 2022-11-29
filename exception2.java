package exception;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayindexoutofbound
		try {

			int[] numarray=new int[5];
			//0-4
			numarray[7]=500;
			System.out.println(numarray[7]);	
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println(obj);
		}
		catch(Exception obj2)
		{
			System.out.println(obj2);
		}
		finally {
			System.out.println("I am in finally block");
		}

	}

}
