import java.util.*;
import java.lang.*;

public class FrequencyCounter3704 {
    public static void main(String[] args) {
        System.out.println("Monisha P J 2022503704");
        char cond = 'y';
        while (cond == 'y') {
            System.out.println("Enter the Line of Input:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] str = s.split(" ");
            System.out.println("Enter the Key word:");
            String key = sc.nextLine();
            int c = 0;
            for (String a : str) {
                if (a.equals(key)) {
                    c++;
                }
            }
            System.out.println("The Frequency occurence of the '" + key.toUpperCase() + "' is " + c);
            System.out.println("Do you want to continue?(y/n):");
            cond=sc.next().charAt(0);
        }
    }
}
