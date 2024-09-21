import java.util.Scanner;
 class WindChill3704 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("2022503704");
            System.out.print("Enter temperature in degrees Fahrenheit: ");
            double temperature = scanner.nextDouble();
            System.out.print("Enter wind speed in miles per hour: ");
            double windSpeed = scanner.nextDouble();
            if (temperature > 50 || windSpeed > 120 || windSpeed < 3) {
                System.out.println("Invalid input. Temperature should be <= 50°F" +
                        " and wind speed should be between 3 and 120 mph.");
            } else {

                double windChill = 35.74 + 0.6215 * temperature
                        - 35.75 * Math.pow(windSpeed, 0.16)
                        + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
                System.out.printf("The wind chill index is %.2f°F\n", windChill);
            }
    }

}
