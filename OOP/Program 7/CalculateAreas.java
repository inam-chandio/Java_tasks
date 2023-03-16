/*Define a method area() and use the method overloading concept to calculate 
the area of square, rectangle and circle. */

import java.util.Scanner;
class CalculateAreas{
    double area(double x){
        System.out.println("Area of Squar : "+ x*x);
        return x*x;
    }
    double area(float  x,float y){
       System.out.println("Area of Rectangle : "+ x*y);
        return x*y;
    }
    double area(int z){
     System.out.println("Area of Circle : "+  (3.14*z*z));
     return  (3.14*z*z);
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x and y and z Respectively : ");
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        int z = scan.nextInt();
        CalculateAreas obj = new CalculateAreas();
       obj.area(x);
       obj.area(x,y);
       obj.area(z);
    }}