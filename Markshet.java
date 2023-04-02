		public class Markshet {
		public void genrateMarksheet(String Name, String RollNo, String Math, String Chem, String Physics,int mathMarks, int chemMarks , int phyMarks,int TotalMath, int Totalchem, int Totalphysics ){
        System.out.println("=========================================================");
        System.out.println(" MEHRAN UNIVERSITY OF ENGINEERING AND TECHNOLOGY JAMSHORO ");
        System.out.println("=========================================================");
        System.out.println("_________________________________________________________");
        System.out.println("| Name    : "+Name + "                   Roll No :" +RollNo + " |");
        System.out.println("| Semster : 5th                            Year : 2023  |");
        System.out.println("|_______________________________________________________|");

        System.out.println("                                                         ");
        System.out.println("|==================================================|");
        System.out.println("|                   |  MARKSHEET  |                  |");
        System.out.println("|==================================================|");
        System.out.println("| Subject         | Obtained| Total Marks| Pers  % |");
        System.out.println("| "+Math + "            |"   + mathMarks +  "       |" +TotalMath + "         | "+(mathMarks*TotalMath)/100+"%     |" );
        System.out.println("|-----------------|---------|------------|---------|");
        System.out.println("| "+Chem +  "       |" + chemMarks +  "       |"  +Totalchem + "         | "+  (chemMarks*Totalchem)/100+"%     |");
        System.out.println("|-----------------|---------|------------|---------|");
        System.out.println("| "+Physics+  "         |"+ phyMarks +   "       |" +Totalphysics+ "         | " +  (phyMarks*Totalphysics)/100+"%     |");
        System.out.println("|__________________________________________________|");

		}
		public static  void main(String []args){

		Markshet obj=new Markshet();

 		obj.genrateMarksheet("Inam Ali ","20CS08","Math","Chemistry","Physics",89,92,75,100,100,100);

			}
		}