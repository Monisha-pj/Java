public class ANDGate3704 {

        public static void main(String[] args) {
            System.out.println("2022503704");
            double W0 = 0.5;
            double W1 = 0.5;
            double bias = -0.75;

            for (int X1 = 0; X1 <= 1; X1++) {
                for (int X2 = 0; X2 <= 1; X2++) {
                    double Y = W0 * X1 + W1 * X2 + bias;
                    int output = Y >= 0 ? 1 : 0;
                    System.out.println("X1: " + X1 + ", X2: " + X2 + ", Y: " + String.format("%.2f", Y)
                            + ", Output: " + output);
                }
            }
        }
    }


