import java.util.Scanner;
class Calculator{
    public  void Method(){
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<=5; i++){
     System.out.println("Enter a Number  then opertor and 2nd number : ");
     String input = sc.nextLine();
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
     char n = sc.next().charAt(0);
     if (n=='n') {
        continue;
	 }
		else {
        break;
}}}
    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.Method();
        }
        }
