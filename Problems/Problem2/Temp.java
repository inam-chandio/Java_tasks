import java.util.Scanner;
class Temp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Type 1 convert Fahrenheit to Celcius: ");
System.out.println("Type 2 convert Celcius to Fahrenheit : ");
int input = sc.nextInt();
if(input==1){
System.out.println("Enter a Temp in F : ");
 float f= sc.nextFloat();
  float tc= (float) ((0.55)*(f-32));
 System.out.println("The Temp in Celusion : "+ tc);
  }else if(input==2){

 System.out.println("Enter a Temp in C : ");

float c = sc.nextFloat();
float tf = (float) ((1.8 * c) + 32f);
 System.out.println("The Temp in Far : " + tf);
}else{
System.out.println("Invalid input.");
          }
      }}
