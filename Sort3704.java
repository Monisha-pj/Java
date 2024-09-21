import java.util.*;
public class Sort3704 {
    public static void main(String[] args){
        System.out.println("Monisha P J 2022503704");
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("enter the arr size:");
        int size=sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            int num=r.nextInt(100);
            arr[i]=num;
        }
       /* System.out.println("Before Sorting:\n");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
        for(int i=0;i<size;i++){
            System.out.print((char)arr[i]+"\t");
        }*/
        System.out.print("\n");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                  int temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
                }
            }
        }
        System.out.print("After Sorting:\n");

      //  System.out.println("\n");
        for(int i=0;i<size;i++){
            System.out.printf("-----");
        }
        System.out.print("\n");
        for(int i=0;i<size;i++){
            System.out.printf("|%3d ",i);
        }
       System.out.print("|\n");
        for(int i=0;i<size;i++){
            System.out.printf("-----");
        }
        System.out.print("\n");
        for(int i=0;i<size;i++){
            System.out.printf("|%3d ",arr[i]);
        }
        System.out.print("|\n");
        for(int i=0;i<size;i++){
            System.out.printf("-----");
        }
        System.out.print("\n");

        for(int i=0;i<size;i++){
          System.out.printf("|%3c ",(char)arr[i]);
        }
        System.out.print("|\n");
        for(int i=0;i<size;i++){
            System.out.printf("-----");
        }
    }
}
