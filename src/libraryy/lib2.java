package libraryy;
import java.util.Scanner; 

public class lib2 {


		public static void main(String[] args) {

	Scanner scan= new Scanner(System.in);

	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");



	lib lib1= new lib(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble());
	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");
	lib lib2= new lib(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble());
	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");
	lib lib3=new lib(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");
	lib lib4=new lib(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble());
	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");
	lib lib5=new lib(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble());
	System.out.println("Please enter the Library's location, Total number of books, Staff total, and the Yearly expense.");
	
	System.out.println(lib1.liblocation+lib1.libtotalbooks+lib1.libstafftotal+lib1.libyearlyexpenses);
	System.out.println(lib2.liblocation+lib2.libtotalbooks+lib2.libstafftotal+lib2.libyearlyexpenses);
	System.out.println(lib3.liblocation+lib3.libtotalbooks+lib3.libstafftotal+lib3.libyearlyexpenses);
	System.out.println(lib4.liblocation+lib4.libtotalbooks+lib4.libstafftotal+lib4.libyearlyexpenses);
	System.out.println(lib5.liblocation+lib5.libtotalbooks+lib5.libstafftotal+lib5.libyearlyexpenses);	
		}
		
		
}



