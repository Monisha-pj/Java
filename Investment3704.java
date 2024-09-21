
import java.util.Random;
public class Investment3704 {
    public static void main(String[] args) {
            System.out.println("2022503704");
            Random random = new Random();
            long principal = random.nextInt(100001);
            double annualRate = random.nextDouble() * 10.0;
            int years = random.nextInt(31);
            double futureValue = principal * Math.pow(1 + (annualRate / 100), years);
            System.out.printf("Principal: ₹%d\n", principal);
            System.out.printf("Annual Rate: %.2f%%\n", annualRate);
            System.out.printf("Years: %d\n", years);
            System.out.printf("Future Value: ₹%.2f\n", futureValue);
        }
    }

