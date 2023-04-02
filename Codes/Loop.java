class Loop{
	
	 public static void main(String []args) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------");

 String [][] Colors={
						{ "Red", "Green" , "Blue" , "Yello" },
							{"White" , "Black" , "Orange" }
																	};
			for(int  row=0; row<2; row++){
				for(int  column=0; column<3; column++){
					System.out.println(Colors[row][column]);
		
			}
				}
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("-----------------------------------------------------------------------");
	 
	 for(int  i=0; i<5; i++){
		 for(int j=0; j<i; j++){
			 System.out.print("*");
									}
			 System.out.println();
			 }
			 System.out.println("-----------------------------------------------------------------------");
			 System.out.println("-----------------------------------------------------------------------");
			 
			 for(int i=1; i<=6; i++){
				 for(int j=6; j>i; j--){
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 System.out.println("-----------------------------------------------------------------------");
			 System.out.println("-----------------------------------------------------------------------");
			 
			
	 }}