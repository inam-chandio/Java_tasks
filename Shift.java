 class Shift {


        public static  void main(String []args){

            int x=15;
            int y=-10;
            System.out.println("Left  : "+x<<2); 
            System.out.println("Right : " +x>>2); 
            System.out.println("Unsigned : "+x>>>2);  

            System.out.println(y<<2);
            System.out.println(y>>2);
            System.out.println(y>>>2);


        }
    }
	
/*
	//int 4 =32bits

10 = 0000 0000 0000 0000 0000 0000 0000 1010 
    = 1111 1111 1111 1111 1111 1111 1111 0101
										     +1
-----------------------------------------------
-10 = 1111 1111 1111 1111 1111 1111 1111 0110

 left Shift  10 = 0000 0000 0000 0000 0000 0000 0000 1010 
             10 = 00 0000 0000 0000 0000 0000 101000=in DecimaL 40 Remove 2 Zero from Left side and add Right side
 Right Shift    = 10 = 000000 0000 0000 0000 0000 0000 0000 10 = in DecimaL =2 Remove from Riht side 
*/