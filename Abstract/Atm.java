// Simple Program on AbstractAction here the one amount is fixed ( a= 60000 )
//  and we can transfer and withdrawal from this blance 
abstract class Atm{
int amount2;
abstract void withdrawal(int amounnt);
abstract void transfer(int amounnt);
}
class Withdrawal extends Atm{
@Override
public void withdrawal(int amounnt){
int blance=60000;
int withdrawal= blance-amounnt;
System.out.println("Withdrawal : " +(withdrawal));
System.out.println("========================");
}
@Override
public void transfer(int amounnt){
int blance=60000;
int transfer =blance+amounnt;
System.out.println("transfer : " + transfer);
System.out.println("========================");
}
public static  void main(String [] args){
Withdrawal t=new Withdrawal();
t.withdrawal(2000);
t.transfer(3000);
}}
