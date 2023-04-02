/*Check Palidrom
Code 2 */
import java.util.Scanner;
public class Palidrom {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Word to Reverse 	::  ");
        String s = sc.nextLine();
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){

            System.out.print("\t\t\t\t::  Palidrom : "+rev);
        }else{
            System.out.print("\t\t\t\t::  Not Palidrom :"+rev);
        }}}