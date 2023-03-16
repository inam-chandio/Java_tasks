/* Program 4
 Define a class Employee input the id, name and basic of 5 employees and 
display their salary slip based on the following condition. Use the proper 
constructor and methods. */
import java.util.Scanner;
public class Employee {
    int id, basic;
    String name;

    Employee(int i, String n, int b) {
        id = i;
        name = n;
        basic = b;
    }
    void getShow() {
        if (basic >= 5000 && basic < 10000) {
            double da = basic * 0.4;
            double hra = basic * 0.2;
            double pf = basic * 0.1;


            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("SALARY STATEMENT OF THE EMPLOYEES ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");
            System.out.println("ID 	 	 	:  "+ id);
            System.out.println("Name 			:  " + name);
            System.out.println("Basic             	:  " +basic   );
            System.out.println("DA(+)			:  " + da);
            System.out.println("HRA(+) 			:  " + hra);
            System.out.println("PF(-) 			:  " + pf);
            System.out.println("_________________________________");
            double salary = (basic+da + hra - pf);
            System.out.println("NET Salary 		: " + salary);
            System.out.println("==========================================");
			System.out.println("==========================================");
           System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");

        } else if (basic >= 3000 && basic < 5000) {
            double da = basic * 0.3;
            double hra = basic * 0.2;
            double pf = basic * 0.1;

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("SALARY STATEMENT OF THE EMPLOYEES ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");
            System.out.println("ID 	 	 	:  "+ id);
            System.out.println("Name 			:  " + name);
            System.out.println("Basic             	:  " +basic   );
            System.out.println("DA(+)			:  " + da);
            System.out.println("HRA(+) 			:  " + hra);
            System.out.println("PF(-) 			:  " + pf);
            System.out.println("_________________________________");
            double salary = (basic+da + hra - pf);
            System.out.println("NET Salary 		: " + salary);
			System.out.println("==========================================");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");


        } else if (basic < 3000) {

            double da = basic * 0.2;
            double hra = basic * 0.1;
            double pf = basic * 0.1;

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("SALARY STATEMENT OF THE EMPLOYEES ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");
            System.out.println("ID 	 	 	:  "+ id);
            System.out.println("Name 			:  " + name);
           System.out.println("Basic             	:  " +basic   );
            System.out.println("DA(+)			:  " + da);
            System.out.println("HRA(+) 			:  " + hra);
            System.out.println("PF(-) 			:  " + pf);
            System.out.println("_________________________________");
            double salary = (basic+da + hra - pf);
            System.out.println("NET Salary 		: " + salary);
			System.out.println("==========================================");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");


        } else if (basic >= 10000) {
            double da = basic * 0.5;
            double hra = basic * 0.3;
            double pf = basic * 0.1;

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("SALARY STATEMENT OF THE EMPLOYEES ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");
            System.out.println("ID 	 	 	:  "+ id);
            System.out.println("Name 			:  " + name);
            System.out.println("Basic             	:  " +basic   );
            System.out.println("DA(+)			:  " + da);
            System.out.println("HRA(+) 			:  " + hra);
            System.out.println("PF(-) 			:  " + pf);
            System.out.println("___________________________________");
            double salary = (basic+da + hra - pf);
            System.out.println("NET Salary 	  : " + salary);
	    System.out.println("==========================================");
            System.out.println("   AAAAAAAA Pvt . Ltd.            ");
            System.out.println("==========================================");


        } else {
            System.out.println("Not Mentioned ");
        }
    }
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        for(int i=1; i<6; i++) {
            System.out.println("Enter id, name and basic :");
            int id = sc.nextInt();
            String name = sc.next();
            int basic = sc.nextInt();
            Employee c = new Employee(id, name, basic);

        c.getShow();
    }}
}