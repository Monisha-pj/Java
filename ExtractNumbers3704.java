import java.util.*;
import java.lang.*;
public class ExtractNumbers3704 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Monisha P J 2022503704");
        System.out.println("enter the String:");
        String s=sc.nextLine();
        int len=s.length();
        char[ ] ch=s.toCharArray();
        String s2="";
        for(int i=0;i<len;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                char a=ch[i];
                s2=s2+a;

            }
        }
        System.out.println("The extracted Numbers : " + s2);
    }
}
