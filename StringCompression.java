import java.util.*;
import java.lang.*;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Monisha P J 2022503704");
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        int len=s.length();
        char[] ch=s.toCharArray();
        char[] tempCa = new char[len];
        int[] tempCount = new int[len];
        int k = 0;
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
            tempCa[k] = ch[i];
            tempCount[k] = c;
            k++;
        }
        char[] ca = new char[k];
        int[] count = new int[k];
        for (int i = 0; i < k; i++) {
            ca[i] = tempCa[i];
            count[i] = tempCount[i];
        }
        int tot=k*2;
        if(tot<len) {
            System.out.println("The compressed String: ");
            for (int i = 0; i < k; i++) {
                System.out.print(ca[i] + "" + count[i]);
            }
        }
        else{
            System.out.println("The original String: "+s);
        }

    }
}
