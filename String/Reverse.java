/*Reverse a Sentence 
Code 1 */

	import java.util.Scanner;
	public class Reverse {
    public static void main(String[] args) 
	{
    Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence	: ");
        String sentence = input.nextLine();

        String a[]  = sentence.split(" ");
        String Reverse = "";

        for (int i = a.length - 1; i >= 0; i--) {
            Reverse += a[i] + " ";
        }

        System.out.println("Reversed is : " + Reverse.trim());
		}
}