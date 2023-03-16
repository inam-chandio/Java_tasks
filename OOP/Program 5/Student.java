/*Define a class Student and create instance members as id, name and age. 
Define id as static where the id will start with 1001 and the next id will be 
updated as 1002 and so on. Create five objects of students and display them.*/

import java.util.Scanner;
class Student{
    static int id=100;
    int a=id++;
    int age;
    String name;

  Student(int age,String name){
      this.age=age;
      this.name=name;
      System.out.println("Id      : " +id);
      System.out.println("Name    : " +name);
      System.out.println("Age     : " +age);
  }
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
     for (int i=1; i<6; i++){
         System.out.println("Enter Age and Name :");
         int age = sc.nextInt();
         String name = sc.next();
        Student s=new Student(age, name);

  }
}}

