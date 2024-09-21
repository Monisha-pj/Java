import java.util.Scanner;

public class SumOfArrays3704 {
    public static void main(String[] args){
        System.out.println("Monisha P J 2022503704");
        Scanner sc=new Scanner(System.in);
        int col,row,c=0,temp;
        System.out.println("enter the no.of.columns:");
        col=sc.nextInt();
        System.out.println("enter the no.of.rows:");
        row=sc.nextInt();
        int[][] arr1=new int[row][col];
        int[][] arr2=new int[row][col];
        int[][] ans=new int[row][col];
       // int[][] ans=new int[row][col];
        int[] sum=new int[col];
        System.out.println("enter the array 1 values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the array 2 values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%d\t" ,ans[i][j]);
            }
            System.out.println("\n");
        }
        for(int i=0;i<col;i++){
            c=0;
            for(int j=0;j<row;j++){
                 c+=arr1[j][i]+arr2[j][i];
            }
            sum[i]=c;
            System.out.println("c"+(i+1)+" : "+sum[i]);
        }
        for(int i=0;i<col-1;i++) {
            for (int k = 0; k < col; k++) {
                if (sum[i] > sum[k]) {
                    for (int j = 0; j < row; j++) {
                        temp = ans[j][i];
                        ans[j][i] = ans[j][k];
                        ans[j][k] = temp;
                    }
                }
            }
        }
        System.out.println("after sorting:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%d\t" ,ans[i][j]);
            }
            System.out.println("\n");
        }
    }
}
