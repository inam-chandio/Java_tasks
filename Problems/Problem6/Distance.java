	import java.util.Scanner;
	class  Distance 
	{
	double distance;
	String unit;
	Scanner sc = new Scanner(System.in);

   void units() 
   {
	System.out.print("Enter a distance :  ");
	distance = sc.nextInt();
	System.out.println("Enter the unit km or mm or inch");
	unit = sc.next();
 
	if (unit.equals("km"))
	{
	System.out.println("1 : kilometer to milimeter :");
	System.out.println("2 : kilometer to Inches  :");
	}
	else if (unit.equals("mm"))
	{
	System.out.println("1 :   milimeter to kilometer :");
	System.out.println("2 :   milimeter  to Inches :");
	}
	else if (unit.equals("inch")) 
	{
	System.out.println("1 :   inch to kilometer :");
	System.out.println("2 :   inch  to millimenter :");
  }
    int input = sc.nextInt();
    switch (input)
	{
    case 1:
    if (unit.equals("km"))
	{
    System.out.println((distance * 1000000) + "  mm");
    }
	else if (unit.equals("mm")) 
	{
    System.out.println((distance / 1000000) + " km");
    } 
    else if (unit.equals("inch"))
	{
    System.out.println((distance / 39370.1)+ "km");
	}
    break;
    case 2:
    if (unit.equals("km")) 
	{
    System.out.println((distance * 39370.1) + " inches");
	}  
	else if (unit.equals("mm")) 
	{
    System.out.println((distance * 0.039) + " inches ");
	}
    else if (unit.equals("inch")) 
	{
    System.out.println((distance*25.4)+ " mm");
	}
}}
   public static void main(String[] args) {

   Distance d = new Distance();
   d.units();
}}