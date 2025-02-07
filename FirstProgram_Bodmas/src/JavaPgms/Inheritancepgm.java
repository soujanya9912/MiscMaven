package JavaPgms;

class parent
{
	
	public void getdetails()
	{
	System.out.println("Parent class");
}}
	
	class child extends parent
	{
		
		public void getdetailschild()
		{
		System.out.println("child class");
	}}

public class Inheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		child nn=new child();
		nn.getdetails();
		nn.getdetailschild();
	}}


