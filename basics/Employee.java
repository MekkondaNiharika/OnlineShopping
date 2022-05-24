package basics;
//this is an employee class
public class Employee
{
int id;
String name;
double salary;
void method1(int id,String name)
{
	this.id=id;
	this.name=name;
	System.out.println("id of an employee:"+id);
	System.out.println("name of an employee:"+name);
	
}
void method2(double salary)
{
	this.salary=salary;
	System.out.println("salary of an employee:"+salary);
}
public static void main(String[] args)
{
	Employee e=new Employee();
			e.method1(022,"ravi");
			e.method2(20000);
}
}
