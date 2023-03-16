/*Define an interface Shape and print a line with a specific character below a text. 
Here void printLine(String s)is to declared in Shape and to be 
implemented by different class. */

interface  Shap{
  void printLine(String s);
}
class Rectangle implements Shap{
 public void printLine(String s){
 System.out.println("Hello Everybody ");
 System.out.println("***************");
 System.out.println();
 System.out.println("How are you ");
 System.out.println("____________");

  }
 public static void main(String args[]) {
 Shap obj=new Rectangle();
 obj.printLine("Shape");
  }
}