package JavaPgms;

class gp
{
	public void gpmethod()
	{
		System.out.println("grandparent method");
	}
}

class parentone extends gp
{
	public void parentmethod()
	{
		System.out.println("parent method");
	}
}

class childone extends parentone
{
	public void childmethod()
	{
		System.out.println("child method");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
childone oneo=new childone();
oneo.gpmethod();
oneo.childmethod();
oneo.parentmethod();
	}

}
