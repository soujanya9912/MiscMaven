package JavaPgms;

class MOD
{
	public void overl1(int a ,long b)
	{
		System.out.println("Printin Method Numbers "  + " " + a + " " + b );
	}
	
	public void overl1(long a ,int b)
	{
		System.out.println("Printin Method Numbers" + a + " " + b );
	}
	
	
	public void overl1(double a ,int b)
	{
		System.out.println("Printin Method Numbers" + a + " " + b );
	}
	
	
}

public class AdvanceMethodOverlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOD bb=new MOD();
		bb.overl1(1, 2l);

		
	}

}
