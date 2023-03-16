/* Define a method area() and use the method overloading concept to calculate 
the area of square, rectangle and circle. */

import java.util.Scanner;
class CalculateArea{
  float x,y,z;
  void area(float x){
  this.x=x;
  float squar=x*x;
   System.out.println("The area of Squar is : "+squar);
    }
  void area(float  x,float y){
   this.x=x;
   this.y=y;
   float rec=x*y;
   System.out.println("The area of Rectangle is : "+rec);
   }
   void area(int z){
   this.z=z;
   System.out.println("The Area of Circle : "+(3.14*z*z));
   }
    public static void main(String args[]) {
   CalculateArea obj = new CalculateArea();
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the value of x and y and z Respectively : ");
   float x = scan.nextFloat();
   float y = scan.nextFloat();
    int z = scan.nextInt();
    obj.area(x);
   obj.area(x,y);
   obj.area(z);
    }}
