  
 class MissingNo {
 public static  void main (String [] args){

  int [] a={1,3,4,5,6};
  int exp_elements=a.length+1;
  int total_sum=exp_elements*(exp_elements+1)/2;
  int sum=0;

  for(int i=0; i<a.length; i++){
  sum=sum+a[i];
	}
  int no=total_sum-sum;
  System.out.println("The Missing Nos is  : "+ (no));
        }}
 