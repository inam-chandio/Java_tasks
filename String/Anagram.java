
/*Check Anagram
code 3
*/
import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String s1=sc.nextLine();
          String s2 = sc.nextLine();

        if (anagramCheck(s1, s2)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not anagrams");
        }
    }

    static boolean anagramCheck(String s1, String s2) {

        char[] aString1 = s1.toCharArray();
        char[] aString2 = s2.toCharArray();
        Arrays.sort(aString1);
        Arrays.sort(aString2);
        return Arrays.equals(aString1, aString2);
    }}
