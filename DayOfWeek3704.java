import java.util.Scanner;

public class DayOfWeek3704 {
    public static void main(String[] args){
        System.out.println("2022503704");
        int m,d,y;
        int a,b,c,x;
        String[] arr={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date:");
        d=sc.nextInt();
        System.out.println("enter the month in number:");
        m=sc.nextInt();
        System.out.println("enter the year:");
        y=sc.nextInt();
        a = y - (14 - m) / 12;
        b = a + a / 4 - a / 100 + a / 400;
        c = m + 12 * ((14 - m) / 12) - 2;
        x = (d + b + (31 * c) / 12) % 7;
        System.out.println("the day of the date is " + x + "( " + arr[x] +" )");
    }
}
