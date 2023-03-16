import java.util.Scanner;
 class Student {
    int id;
    String name;

 void getStudent(int i, String n){
id = i;
 name = n;
    }
 void displayStudent(){
 System.out.println("ID :"+id);
System.out.println("Name :"+name);
    }
}
class Exam extends Student {
    int sub1, sub2, sub3;

 void getMarks(int sub1, int sub2, int sub3) {
 this.sub1 = sub1;
  this.sub2 = sub2;
 this.sub3 = sub3;
 }

  void showMarks() {
  System.out.println("Sub1 : " + sub1);
   System.out.println("Sub2 : " + sub2);
  System.out.println("Sub3 : " + sub3);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
 System.out.println("enter id and name :");
int id = sc.nextInt();
   String name = sc.next();
 System.out.println("Enter Mark in sub1, sub2 and sub3 : ");
  int sub1 = sc.nextInt();
 int sub2 = sc.nextInt();
 int sub3 = sc.nextInt();
            
    System.out.println("Details are :  ");
    Exam obj = new Exam();
    obj.getStudent(id, name);
    obj.displayStudent();

  obj.getMarks(sub1, sub2, sub3);
  obj.showMarks();

        }
    }
}