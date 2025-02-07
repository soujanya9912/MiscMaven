package JavaPgms;



class Webdriver
{
	public void openbrowser()
	{
		System.out.println("cant open");
	}
	
	public void maximise()
	{
		System.out.println("maximise window");
	}
	
	public void tile()
	{
		System.out.println("display title");
	}
	
	public void close()
	{
		System.out.println("close the window");
	}
}

class chrome extends Webdriver
{
	public void openbrowser()
	{
		System.out.println("chrome will open");
	}
}

class safari extends Webdriver
{
	public void openbrowser()
	{
		System.out.println("safari will open");
	}
}

class firefox extends Webdriver
{
	public void openbrowser()
	{
		System.out.println("firefox will open");
	}
}



public class webdriverconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Webdriver vv=new firefox();
		vv.openbrowser();
	}

}
