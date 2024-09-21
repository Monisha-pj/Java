import java.util.*;
import java.lang.*;
public class Pangram3704 {
   public static void pangram(String s){
       char[] alpha=new char[26];
       for (int i = 0; i < 26; i++) {
            alpha[i] = (char) ('a' + i);
       }
       boolean[] all=new boolean[26];
       int n=s.length();
       int ind=0;
       s=s.toLowerCase();
       char[] str=s.toCharArray();
       for(int i=0;i<26&& ind<n;i++){
           for(int j=0;j<str.length;j++) {
               if (str[j]== alpha[i]) {
                   all[i] = true;
               }
           }
       }
       char[] a=new char[26];
       int c=0;
       boolean flag=false;
       for(int i=0;i<26;i++){
           if(all[i]!=true){
               flag=true;
               a[c++]=alpha[i];
           }
       }
       if(flag==true){
           System.out.println("The given String '" + s.toUpperCase() + "' is NOT a pangram because of the missing letters :");
           for(int i=0;i<26;i++){
               if(a[i]!='\0'){
                   System.out.println(a[i]);
               }
           }
       }
       else{
           System.out.println("The given String '" + s.toUpperCase() + "' is a pangram ");
       }
   }
    public static void main(String args[]){
        System.out.println("Monisha P J 2022503704");
        char cond = 'y';
        while (cond == 'y') {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String s=sc.nextLine();
        pangram(s);
        System.out.println("Do you want to continue?(y/n):");
        cond=sc.next().charAt(0);
        }

    }
}
