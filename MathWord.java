public class MathWord {
   public void Math(int x1,int x2, int y1,int y2){

       System.out.println("The Distance between these Two Points is : "+ Math. sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2) ));
   }

    public static void main(String []args){
		System.out.println("=======================================");
        MathWord obj=new MathWord();
        obj.Math(4 ,-10,-2,-3);
		
		System.out.println("=======================================");
	}
}