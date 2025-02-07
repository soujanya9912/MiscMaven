package JavaPgms;

class Animal
{
	public void voice()
	{
		System.out.println("Animal Voice");
	}
}

class cat extends Animal
{
	public void voice()
	{
		System.out.println("cat Meow");
	}
}

class lion extends Animal
{
	public void voice()
	{
		System.out.println("lion roar");
	}
}

class dog extends Animal
{
	public void voice()
	{
		System.out.println("dog bark");
	}
}
public class Runtimepolimorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal vv=new dog();
		vv.voice();
	}

}
