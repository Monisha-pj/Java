import java.util.*;
import java.lang.*;
public class CompareVersion3704 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Monisha P J 2022503704");
        System.out.println("Enter the String1: ");
        String s1=sc.nextLine();
        System.out.println("Enter the String2: ");
        String s2=sc.nextLine();
        String[] str1 = s1.split("\\.");
        String[] str2 = s2.split("\\.");
        int k=0,p=0;
        for(String a: str1){
            k++;
        }
        for(String a: str2){
            p++;
        }
        int[] s3=new int[k];
        int i=0;
        for(String a: str1){
            s3[i]=Integer.parseInt(a);
            i++;
        }
        int[] s4=new int[p];
        i=0;
        for(String a: str2){
            s4[i]=Integer.parseInt(a);
            i++;
        }
        int c=0;
        for(int j=0;j<k;j++){
            if(s3[j] > s4[j]){
                c++;
            }
        }
        if(c==k){
            System.out.println(s1 + " is greater than " + s2);
        }
        else{
            System.out.println(s2 + " is greater than " + s1);
        }
    }
}
