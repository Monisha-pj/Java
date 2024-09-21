import java.util.*;
import java.lang.*;
public class StringReverse3704 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Monisha P J 2022503704");
        System.out.println("enter the String:");
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        int len=s1.length();
        int last=len-1;
        for(int i=0;i<len/2;i++){
            char temp=ch[i];
            ch[i]=ch[last];
            ch[last]=temp;
            last--;
        }
        System.out.println(new String(ch));
    }
}
