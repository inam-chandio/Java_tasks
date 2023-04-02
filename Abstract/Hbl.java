class Hbl extends Bank {
    int tex=50;
    @Override
    void tex(int tex) {
        if (tex < 150) {
            System.out.println(" NO Tex / HBL Bank ");
        }else {
            System.out.println("You have to pay HBL bank: " + (tex+50));

        }
        System.out.println("========================================");
    }
	public static void main(String [] args){
		Hbl obj1 = new Hbl();
		obj1.tex(700);
	}
}