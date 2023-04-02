import java.util.Scanner;
class Calc {
	Scanner sc = new Scanner(System.in);
	char choice;
	String input;
    public  void Method(){
     System.out.println("Enter a Number  then opertor and 2nd number : ");
     input = sc.nextLine();
     String a[] = input.split(" ");
     double x = Double.parseDouble(a[0]);
     double y = Double.parseDouble(a[2]);
     if (a[1].equals("+")) {
       System.out.println(x + y);
  } 
     else if (a[1].equals("-")) {
     System.out.println(x - y);
  }
      else if (a[1].equals("*")) {
     System.out.println(x * y);
     }else if (a[1].equals("/")) {
     System.out.println(x / y);
     }
     System.out.println("Do another press y for Yes and n for No ");
     choice = sc.nextLine().charAt(0);
	 }
    public static void main(String[] args) {

        Calc c=new Calc();
		do
		{
			c.Method();
		}
		while(c.choice == 'y');
        }
        }
