
import java.util.*;
import java.lang.*;
public class Good3704{
    public static String ItsGood(String s){
        String[] str=s.split(" ");
        int stind=-1,endind=-1;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("not")){
               stind=i;
            }
            else if(str[i].equals("bad")){
                endind=i;
            }

        }
        String ans="";
        if(stind!=-1 && endind!=-1 && stind<endind){
            for(int i=0;i<str.length;i++){
                if(i==stind){
                    ans=ans+" Good";
                }
                else if(i>stind && i<=endind){
                    continue;
                }else{
                    ans=ans+" "+str[i];
                }
            }
        }else{
            ans=ans+s;
        }


        return ans;
    }
    public static void main(String[] args){
        char cond='y';
        System.out.println("Monisha P J 2022503704");
        while (cond == 'y') {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the Input:");
        s=sc.nextLine();
        String ans= ItsGood(s);
        System.out.println("Output:" + ans);
        System.out.println("Do you want to continue?(y/n):");
        cond=sc.next().charAt(0);
        }
    }

}
