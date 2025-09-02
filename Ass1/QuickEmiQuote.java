package FPP.Ass1;

import java.util.Random;
import java.util.random.RandomGenerator;

public class QuickEmiQuote {
//    public QuickEmiQuote() {
//
//    public void Principal(){
//
//
//        }
//    public void Tenure(){
//
//        }
//    public void AnnualInterestRate(){
//
//        }
//
//    }
    public static void main(String[] args) {

        //1. randomize input
        Random rand = new Random();
        int p= rand.nextInt(5000,25000);
        int n = rand.nextInt(6,36);
        double APR = rand.nextDouble(3.5,11.5);

        // Display results
        System.out.printf("Principal (P):$%,.2f%n", (double)p);
        System.out.printf("Tenure (n): %d, months%n",n);
        System.out.printf("Annual Interest Rate (APR): %.1f%%%n", APR);

        //Compute EMI (Equated Monthly Installment – Use Math API)
        double  r = APR / 12 / 100;
        double  EMI=  (Math.pow(1+r,n)*p*r)/(Math.pow(1+r,n)-1);
        double payment =EMI*n;
        double interest=payment-p;
        System.out.printf("Monthly EMI: $%, .2f%n", EMI);
        System.out.printf("Total Interest: $%, .2f%n", interest);
        System.out.printf("Total Payment: $%, .2f%n", payment);

        //Show multiple integer views of the EMI
        int cast= (int)EMI;
        int rd =(int)Math.round(EMI);
        System.out.printf("Casted EMI: $%,d%n", cast);
        System.out.printf("Rounded EMI: $%,d%n", rd);



    }

}
