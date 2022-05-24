package basics;
import java.util.Scanner;
public class LibraryClass {
	
	
		// variables 
		static String []bookname= {"book1","book2","book3"};
		static String []authorname= {"author1","author2","author3"};
		static int []count= {1,2,3}; 
		//methods
		//1st method
		public static  void searchbybook(String s1)
		{
			for (int i = 0; i < bookname.length; i++)
			{
				if(s1.equalsIgnoreCase(bookname[i])) 
				{
				System.out.println("Book by name is available");
				--count[i];
				
				
				System.out.println("Copies after book issuing is "+count[i]);
				/*book1[0]=count[0]
				  book2[1]=count[1]
				  book3[2]=count[2]
				  */
				}
			}
		}
		//2nd method
		public static void searchbyauthor(String s2)
		{
			for (int i = 0; i < authorname.length; i++) 
			{
				if(s2.equalsIgnoreCase(authorname[i])) 
				{
				System.out.println("Book by author is available");
				--count[i];
				System.out.println("Copies after book issuing is "+count[i]);
				}
			}
		}
		//3rd method
		public static void searchbybookandauthor(String s3, String s4)
		{
			for (int i = 0; i < bookname.length; i++)
			{
				if(s3.equalsIgnoreCase(bookname[i])||s4.equalsIgnoreCase(authorname[i])) 
				{
				System.out.println("Book is available");
				--count[i];
				System.out.println("Copies after book issuing is "+count[i]);
				}
			}
		}
			//4th method 
			public static void returnbook(String s5, String s6)
			{
				for (int i = 0; i < bookname.length; i++) 
				{
					
					if (s5.equalsIgnoreCase(bookname[i])&&s6.equalsIgnoreCase(authorname[i])) {
						System.out.println("Book is Returned ");
						++count[i];
						System.out.println("book count is "+count[i]);
					}
				}
			}
		
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("***welcome to  library management system***");
			System.out.println("------");
			System.out.println("enter your choice");
			System.out.println("*********");
			System.out.println("1.Search book by name\n 2.Search book by author\n 3.Search book by name or author\n 4.Return the book");
			int option=s.nextInt();
			switch (option) {
				case 1:
				System.out.println("enter book name");
				
				searchbybook(s.next());
				break;
				
					case 2:
						System.out.println("enter author name");
				searchbyauthor(s.next());
						break;
				
						case 3:
							System.out.println("enter book or author  name");
					searchbybookandauthor(s.next(), s.next());
							break;
						case 4:
							System.out.println("enter book or author name");
							returnbook(s.next(), s.next());
									break;

			default:System.out.println("option not available");
				break;
			}
		}

	}

