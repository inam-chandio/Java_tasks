		import java.util.Scanner;
		class  Diagnosis
		{
		public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String Diagnosis:");
        String s=sc.nextLine();

        int size = s.length();
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for (int i = 0; i < size; i++) 
		{
            char c = s.charAt(i);
       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
					|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
			{
                vowels++;
            }
			else if (c == ' ')
            {
			spaces++;	
            } 
			else  
			{
                consonants++;
            }
        }
		System.out.println("================================");
        System.out.println("String Diagnosis are :");
        System.out.println("Size: " + size);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        }
}