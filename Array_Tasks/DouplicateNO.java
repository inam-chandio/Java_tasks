class DouplicateNO{
 public static  void main (String [] args){
 int [] a={1,2,3,5,5,6,6};
 for(int i=0; i<a.length;  i++) {
 int j;
 for (j = 0; j < i; j++) {
 if(a[i] == a[j]){
 System.out.println(" The duplicates numbers are : " +a[j]);
 }
 }
 }
}}