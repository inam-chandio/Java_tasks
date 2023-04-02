/*Reverse a Word 
Code 1 */

import java.util.Scanner;
public class Reverse1 {
       public static void main(String []args){
            Scanner sc = new Scanner(System.in);
			System.out.print("Enter any Word to Reverse 	::  ");
            String name = sc.nextLine();
            int leng=name.length();
            String rev="";
            //String rev[] = name.split(" ");
            for(int i=name.leng-1; i>=0; i--){
                rev=rev+name.charAt(i);
            }
			//
			//if()
            System.out.print("\t\t\t\t::  "+rev);
        }
    }