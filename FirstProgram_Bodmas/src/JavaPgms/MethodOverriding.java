package JavaPgms;

class MOver
{
	public void MOver1()
	{
		System.out.println("Method text display");
	}
}
class Mog extends MOver
{
	public void MOver1()
	{
		System.out.println("Method text display -Mog Class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mog bb=new Mog();
		MOver nn=new MOver();
nn.MOver1();
	}

}
