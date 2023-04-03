package week2;
import java.util.Scanner;
public class lab3 {
    String Description;
	int Unit;
	double Price;
	lab3(String d, int u, double p)
	{
		Description=d;
		Unit=u;
		Price=p;
	}
	lab3() {
		// TODO Auto-generated constructor stub
	}
	void nhap() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Description: ");
		Description=sc.next();
		sc.nextLine();
		System.out.print("Enter Units On hand:");
		Unit=sc.nextInt();
		System.out.print("Enter Price: ");
		Price=sc.nextDouble();
	}
	void in()
	{
		System.out.printf("\n   %20s\t\t  %6d\t%10.2f \n", Description, Unit, Price);
	}
	public static void main(String[] args)
	{ 
		System.out.println("------------------------------CODEJAVA-----------------------------\n");
		System.out.println("Pleae Enter Data\n");
		lab3 h1=new lab3("Jacket",12,59.95);	
		lab3 h2=new lab3();
		lab3 h3=new lab3();
        h2.nhap();
        h3.nhap();
       System.out.println(" \t\t Description\t  Units On Hand\t    Price\t ");
        h1.in(); 
        h2.in();
        h3.in();
        System.out.print("\n\n\n Thank you welcom[-][-][-][-][-][-][-]see you again");
	}

}



