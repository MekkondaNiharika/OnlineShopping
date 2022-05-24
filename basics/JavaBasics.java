package basics;

public class JavaBasics 
{
	int id;
	String Name;
	static String domain="app enggineer";
	JavaBasics(int id,String Name)//constructor
	{
		this.id=id;
		this.Name=Name;
	}
	static void method1()//static method
	{
		System.out.println("this is a static method");
	}
void method()//nonstatic method
{
	System.out.println("this is a static method");
	System.out.println("non static variables"+id+Name);
	System.out.println("this is a static variable"+domain);
}
public static void main(String[] args) 
{
	JavaBasics jb=new JavaBasics(10,"java");
	
}
}
