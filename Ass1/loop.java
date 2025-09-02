package FPP.Ass1;

public class loop {
    public static void main(String[] args) {
        int N = 10; // number of terms

        // (a) 1 - 1/3 + 1/5 - ...=(-1)^i+1/2i-1

        double sumA = 0.0;
        System.out.print("Series (a): ");
        for (int i = 1; i <= N; i++) {
            double term = Math.pow(-1, i + 1) / (2 * i - 1);
            sumA += term;
            System.out.printf("%.5f ", term);
        }
        System.out.println("\nSum of first " + N + " terms (a) = " + sumA);

        // (b) 1/2 - 2/4 + 3/8 - ...= i(-1)^i+1/2^i

        double sumB = 0.0;
        System.out.print("\nSeries (b): ");
        for (int i = 1; i <= N; i++) {
            double term = Math.pow(-1, i + 1) * i / Math.pow(2, i);
            sumB += term;
            System.out.printf("%.5f ", term);
        }
        System.out.println("\nSum of first " + N + " terms (b) = " + sumB);
    }
}

