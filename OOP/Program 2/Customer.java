//Program #2 
//Define a class named 5 Customer with instance members as id and name and 
//input the data using getDetails() and display them using showDetails().

input the data using getDetails() and display them using showDetails().

import java.util.Scanner;
class Customer{
 int  id,id1,id2,id3,id4,id5;
 String name,name1,name2,name3,name4,name5;
void Customer(int id1, String name1,int id2, String name2,int id3, String name3, int id4, String name4,int id5, String name5){

 this.id1=id1;
 this.name1=name1;
 this.id2=id2;
 this.id3=id3;
 this.name3=name3;
 this.id4=id4;
 this.name4=name4;
 this.id5=id5;
 this.name5=name5;
  }
	void showDetails(){
        System.out.println("Id1 :"+ id1);
        System.out.println("Name1 :"+ name1);
        System.out.println("======================");

        System.out.println("Id2 :"+ id2);
        System.out.println("Name2 :"+ name2);
		System.out.println("======================");
		
		System.out.println("Id3 :"+ id3);
        System.out.println("Name3 :"+ name3);
        System.out.println("======================");

        System.out.println("Id4 :"+ id4);
        System.out.println("Name4 :"+ name4);
		System.out.println("======================");
		
		System.out.println("Id5 :"+ id5);
        System.out.println("Name5 :"+ name5);
    }
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Details of 5Customer");
        System.out.println("Enter id1 and name1 :");
        int id1=sc.nextInt();
        String name1=sc.next();
		
		System.out.println("Enter id2 and name2 :");
        int id2=sc.nextInt();
        String name2=sc.next();
		
		System.out.println("Enter id3 and name3 :");
        int id3=sc.nextInt();
        String name3=sc.next();
		
		System.out.println("Enter id4 and name4 :");
        int id4=sc.nextInt();
        String name4=sc.next();
		
		System.out.println("Enter id5 and name5 :");
        int id5=sc.nextInt();
        String name5=sc.next();

		System.out.println("Id's and names of all Customers :");
        Customer c=new Customer();
        c.Customer(id1,name1,id2,name2,id3,name3,id4,name4,id5,name5);
        c.showDetails();
}}