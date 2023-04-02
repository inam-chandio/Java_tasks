class Apl extends Bank{
@Override
    void tex(int tex){
        if(tex>150){
            System.out.println("You have to pay tex of Allied Bank : " +(tex+100));
        }}
    public static void main(String args[]){
        //Hbl obj=new Hbl();
       // obj.tex(150);
        Apl obj1=new Apl();
        obj1.tex(200);

    }
}
