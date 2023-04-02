import java.util.Scanner;
class Fractions{
	char choice;
	String[] s;
	double a,b,c,d;
	Scanner sc=new Scanner(System.in);
	public void menu() {
	System.out.println("Formate for Addition       : a / b + c / d");
	System.out.println("Formate for Subtraction    : a / b - c / d");
    System.out.println("Formate for Multiplication : a / b * c / d");
	System.out.println("Formate for Division       : a / b / c / d");
	System.out.println("Enter the value of |a|, |operation|, |b|, |operation|, |c|, |operation|,  |d| :");
  
    String input = sc.nextLine();
    s = input.split(" ");
    a = Double.parseDouble(s[0]);
    b = Double.parseDouble(s[2]);
    c= Double.parseDouble(s[4]);
    d = Double.parseDouble(s[6]);
	}
    public  void Addition (){
	
	if (s[1].equals("/") && s[3].equals("+") && s[5].equals("/")) {
    System.out.println("Addition : "+ (a/b) + (c/d));
	System.out.println("You want to perform another(y/n)?");
	choice = sc.nextLine().charAt(0);
  }
 }
    public  void Subtraction (){
    if (s[1].equals("/") && s[3].equals("-") && s[5].equals("/")){
    System.out.println("Sub :" +( (a/b) - (c/d)));
	System.out.println("You want to perform another(y/n)?");
	choice = sc.nextLine().charAt(0);
}
 }

    public void Multiplication(){
    if (s[1].equals("/") && s[3].equals("*") && s[5].equals("/")){
    System.out.println("Multiplication : "+((a/b) * (c/d)));
	System.out.println("You want to perform another(y/n)?");
	choice = sc.nextLine().charAt(0);
}
  }
    public void Division(){
    if (s[1].equals("/") && s[3].equals("/") && s[5].equals("/")){
    System.out.println("Division : "+((a/b) / (c/d)));
	System.out.println("You want to perform another(y/n)?");
	choice = sc.nextLine().charAt(0);
 }
	
 }
 
	public  static void  main(String [] args){
        Fractions f=new   Fractions();
		do{
		f.menu();
        f.Addition ();
        f.Subtraction ();
        f.Multiplication();
        f.Division();
		}
		while(f.choice == 'y');

   }
}
