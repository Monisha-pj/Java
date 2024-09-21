import java.util.Random;
import java.util.Scanner;

public class Occurence3704 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int size;
        System.out.println("Enter the size of the 2 arrays:");
        size=sc.nextInt();
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            int r1=r.nextInt(20);
            int r2=r.nextInt(20);
            arr1[i]=r1;
            arr2[i]=r2;
        }
        for(int i=0;i<size;i++){
            int c=0;
            for(int j=0;j<size;j++){
                if(arr2[i]==arr1[j]){
                    c++;
                }
            }
            System.out.println("No.of.occurence of "+arr2[i] + " in arr1 : "+ c);
        }
    }
}
