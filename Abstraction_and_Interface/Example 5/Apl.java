class Apl implements Bank{
@Override
    public void tex(int tex){
        if(tex>150){
            System.out.println("You have to pay tex of Allied Bank : " +(tex+100));
        }}
    public static void main(String args[]){
        Apl obj1=new Apl();
        obj1.tex(200);
    }
}	