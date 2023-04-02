import java.util.Scanner;
public class Multiples {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number : ");
   int no = sc.nextInt();
   for (int i = 1; i <= 200; i++) {
   {
   System.out.print(no * i + " ");
   if(i % 10 == 0)
   {
   System.out.println();
    }
   }}
   }
   }