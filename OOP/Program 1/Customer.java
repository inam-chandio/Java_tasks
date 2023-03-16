import java.util.Scanner;
class Customer{
int  id;
String name;
void getDetails(int id, String name){
this.id=id;
this.name=name;
}
void showDetails(){
System.out.println("Id   :"+ id);
System.out.println("Name :"+ name);
}
 public static void main(String []args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter id and name :");
int id=sc.nextInt();
String name=sc.next();
  Customer c=new Customer();
  c.getDetails(id, name);
c.showDetails();
}}