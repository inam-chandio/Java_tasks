abstract class Vehical{
    abstract void start();
}
   class Car extends Vehical{
    void start(){
        System.out.println("Car Starts with Key ");
    }
   }
   class Bike extends Vehical{
    void start(){
        System.out.println("Bike Starts with Kick");
    }
   public static void main(String []args) {
    Car e1=new Car();
    e1.start();
    Bike e2=new Bike();
    e2.start();
   }}

