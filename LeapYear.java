import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year;
        Boolean isLeap=false;
        System.out.println("enter the year:");
        year = sc.nextInt();
            if (year >= 1000) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeap = true;
                        } else {
                            isLeap = false;
                        }
                    } else {
                        isLeap = true;
                    }
                } else {
                    isLeap = false;
                }
            } else {
                System.out.println("enter the valid year");
            }
            System.out.println(isLeap);
    }
}