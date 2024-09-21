import java.util.*;
import java.lang.*;
public class CharOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Monisha P J 2022503704");
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int len=s.length();
        char[] ch=s.toCharArray();
        for (int i = 0; i < len; i++) {
            int c = 1;
            if (ch[i] == '\0') {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    ch[j] = '\0';
                }
            }
            System.out.println("The occurrence of '" + ch[i] + "' = " + c);
        }
    }
}
