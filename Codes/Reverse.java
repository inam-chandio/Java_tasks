class Reverse{
 public static  void main (String [] args){
int rem; int  rev=0; int no=2345;
while(no!=0){
rem=no%10;
rev=rev*10+rem;
no=no/10;
     }
System.out.println("The Reverse of given number is   "+ rev);
	}}