package basics;

import java.util.Scanner;

public class Switch
{
public static void main(String[] args) {
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age:");
	age=sc.nextInt();
	switch(age)
	{
	case 1:
	System.out.println("you can crawl");
	break;
	case 2:
		System.out.println("you can talk");
		break;
	case 3:
		System.out.println("you can walk");
		break;
	default:
		System.out.println("i don't know how old are you");
		break;
	
	}
}
}
