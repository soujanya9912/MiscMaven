package JavaPgms;

class student
{
	student()
	{
		System.out.println("default constructor");
	}
	
	student(String name,int age)
	{
		System.out.println("Display Student details" +name +age);
	}
	
	student(String name,int age,char h)
	{
		System.out.println("Display Student details" +name +age  +h);
	}
	
}

public class AdvConstructorOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new student("nnn",98,'k');
	}

}
