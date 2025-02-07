package JavaPgms;

class cons
{
	cons()
	{
		System.out.println("blank constructor");
	}
	
	cons(String a)
	{
		System.out.println("Parameterrized constructor"   + " "  +a);
	}
	
	cons(int a,int b)
	{
		System.out.println("Display integers in constructor"   + " " +a +" "  +b);
	}
}



public class constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	new cons();//output blank constructor
	new cons("souji");
	new cons(12,98);

	}

}
