class MathWord{

 public double Rectangle(int w,int l){
        System.out.println("The area of Rectangle is : "+ w*l);
       return w*l;
   }
   
   public double Triangle(int b,int h) {
        System.out.println("The area of Triangle is : " + (b* h)/2);
        return (b*h)/2;
    }
	
	  float PI=3.14f;
    float Sphere= 4* PI;
    public double Sphere(int r) {
        System.out.println("The area of Sphere is : " + Sphere * r * r);
        return 4 * PI * r * r;
    }
	
	float Pi=3.14f;
 public  void Circle(int r){
        System.out.println("The Area of Circle is : " + Pi*r*r);
 }
   
    public static void main(String []args){

        MathWord obj=new MathWord();
		System.out.println("-------------------------------");
		obj.Circle(4);
		obj.Sphere(5);
        obj.Rectangle(  2,4);
		obj.Triangle(6,3);
		System.out.println("-------------------------------");
		}
		
		}