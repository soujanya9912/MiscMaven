package JavaPgms;
class OfficialSubwayAmerica
{
	public void Location()
	{
		System.out.println("Newjersey");
	}
	
	public void Logo()
	{
		System.out.println("Official LOgo");
	}
	
}
class SubwayIndia extends OfficialSubwayAmerica
{
	public void Location()
	{
		System.out.println("Hyderabad");
	}
	
}
class SubwayAustralia extends OfficialSubwayAmerica
{
	public void Location()
	{
		System.out.println("Melbourne");
	}
	
}
public class AdvMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubwayIndia nn=new SubwayIndia();
		nn.Location();
		nn.Logo();
	}

}
