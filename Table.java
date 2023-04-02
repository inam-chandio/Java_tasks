class Table{
	int num;
	
public void Table(int num) {
	this.num=num;
        System.out.println("The Table of :"+num );
        for(int i=1;i<=10; i++){

        System.out.println(num + "*" + i + "=" + num*i);
    }
}
    public static void main(String []args){

        Table obj=new Table(4);
        System.out.println(obj.num);

    }
}
