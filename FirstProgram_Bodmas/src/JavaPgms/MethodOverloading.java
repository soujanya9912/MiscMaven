package JavaPgms;
class Modg
{public void modg1(int a ,int b){
		System.out.println("Printing numbers" +a +b);}
	
	public void modg1(int a ,int b,int c){
		System.out.println("Printing numbers" +" "  +a+  "   "   +b +"  " +c);}
	
public void modg1(int a ,int b,String c){
		System.out.println("Printing numbers" +" "  +a+  "   "   +b +"  " +c);}}
public class MethodOverloading {
public static void main(String[] args) {
Modg mn=new Modg();
//mn.modg1(12, 23,12);
mn.modg1(2, 3, "test");}}
