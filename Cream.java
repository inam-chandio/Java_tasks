class Cream{
    String name;
    String code;
    int price;
    public Cream(String name, String code, int price){
        this.name=name;
        this.code=code;
        this.price=price;
    }
    public static void main(String []args){
        Cream e=new  Cream("Fiza", "223190", 250 );
        System.out.println("============== Name :========");
        System.out.println(e.name);
        System.out.println("============== Code:============");
        System.out.println(e.code);
        System.out.println("==============  Price:===========");
        System.out.println(e.price);
    }
}
