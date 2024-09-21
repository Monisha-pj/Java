import java.util.*;
public class Chat3704 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Monisha P J 2022503704");
            System.out.println("Enter the first input for the conversation:");
            String userInput1 = scanner.nextLine();
            System.out.println("Enter the second input for the conversation:");
            String userInput2 = scanner.nextLine();
            boolean continueConversation = true;
            while (continueConversation) {
                System.out.println("Java: Hi, I'm Java. What's your name?");
                System.out.println("Python: I'm Python. Nice to meet you!");
                System.out.println("Java: Programmers use me for large-scale systems and performance-critical applications.");
                System.out.println("Python: I'm best for rapid development and scripting tasks.");
                System.out.println("Java: I use static typing for early error detection.");
                System.out.println("Python: I use dynamic typing for more flexibility.");
                System.out.println("Java: I run on the JVM, making me portable across many platforms.");
                System.out.println("Python: I'm portable with the Python interpreter on any system.");
                System.out.println("Java: Ideal for enterprise applications and Android apps.");
                System.out.println("Python: Perfect for web development and data analysis.");
                System.out.println("Java: My performance is strong with JVM optimizations.");
                System.out.println("Python: I excel in ease of use and quick development cycles.");
                System.out.println("Java: Use me for performance and large projects.");
                System.out.println("Python: Use me for ease and speed in development.");
                System.out.println("Java: This was great! Bye for now!");
                System.out.println("Python: Bye!");
                System.out.println("\nDo you want to continue the conversation? (yes/no)");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    continueConversation = false;
                }
            }}}

