package exception;

public class exception1 {

	public static void main(String[] args)throws UserdefinedException {
		// TODO Auto-generated method stub

		try {
		throw new UserdefinedException(10);
		}
		catch(UserdefinedException e)
		{
			e.printStackTrace();
		}
		finally {
			{
				System.out.println("I am in finally block");
			}
		}
	}

}
