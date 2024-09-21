import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c='y';
        System.out.println("Monisha P J 2022503704");
        while(c=='y') {
            System.out.println("enter the String:");
            String s1 = sc.nextLine();
            char[] ch = s1.toCharArray();
            int len1 = s1.length();
            int last = len1 - 1;
            for (int i = 0; i < len1 / 2; i++) {
                char temp = ch[i];
                ch[i] = ch[last];
                ch[last] = temp;
                last--;
            }
            if (new String(ch).equals(s1)) {
                System.out.println("The given String " + s1 + " is a Palindrome.");
            } else {
                System.out.println("The given String " + s1 + " is not a Palindrome.");
            }
            System.out.println("Do you want to continue(y/n): ");
            c=sc.next().charAt(0);
            sc.nextLine();
        }

    }
}
