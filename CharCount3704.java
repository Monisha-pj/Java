import java.util.*;
import java.lang.*;
public class CharCount3704 {
    public static void Count(String str){
        char[] arr=new char[str.length()];
        int ind=0;
        char[] s=str.toCharArray();
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            for(int j=0;j< arr.length;j++){
                char c=s[i];
                if(c==arr[j]){
                    flag=true;
                }
            }
            if(flag==false){
                arr[ind++]=s[i];
            }
        }
        int[] inarr=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            int co=0;
            for(int j=0;j<str.length();j++){
                char c=s[j];
                if(arr[i]==c){
                    co++;
                }
            }
            inarr[i]=co;
        }
        for(int i=0;i<arr.length;i++){
            if(inarr[i]!=0) {
                System.out.println(arr[i] + ":" + inarr[i]);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Monisha P J 2022503704");
        char cond = 'y';
        while (cond == 'y') {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input:");
        String s= sc.nextLine();
        Count(s);
        System.out.println("Do you want to continue?(y/n):");
        cond=sc.next().charAt(0);
        }

    }

}
