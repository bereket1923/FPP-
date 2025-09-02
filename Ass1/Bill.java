package FPP.Ass1;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            // input user type
            System.out.println("Enter either R, C, or I: ");
            String type = scan.next().toUpperCase();

            // input unit type
            System.out.println("Enter units consumed: ");
            int units = scan.nextInt();

            //Compute a bill using a switch expression
            double billAmount= switch(type){
            case "R" -> units * 0.12;
            case "C" -> units * 0.20;
            case "I" -> units * 0.35;
            default -> 0.0;
            };

            // display bill detail
            System.out.println("Type: " + type);
            System.out.println("Units: " + units);
            System.out.printf("Bill Amount:%.2f ", billAmount);

            // ask the user to continue
            System.out.println("Do you want to calculate another bill? (y/n):");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y' || ch == 'Y');
        System.out.println("exit the program");
        scan.close();
    }
}

