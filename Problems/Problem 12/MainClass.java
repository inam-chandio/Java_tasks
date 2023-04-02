class BaseClass {
    public void methodOne() {
        System.out.println("Call to second method");
        methodTwo();
    }
    public void methodTwo() {
        System.out.println("methodTwo");
    }
}
class MainClass extends BaseClass {
    @Override
    public void methodTwo() {
        System.out.println("This is methodTwo.");
    }
    public static void main(String args[]){
        BaseClass d=new BaseClass();
        d.methodOne();
    }
}