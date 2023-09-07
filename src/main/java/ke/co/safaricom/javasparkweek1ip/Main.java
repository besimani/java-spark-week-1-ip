package ke.co.safaricom.javasparkweek1ip;

import java.util.scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new scanner(System.in);
        system.out.print("Welcome to Caeser Cipher Application");

        while(true){
            System.out.print("Enter a message: ");
            String message = scanner.next();

            System.out.print("Enter a process (e/d): ");
            String process = scanner.next();

            System.out.print("Enter a key: ");
            int key = scanner.nextInt();

            System.out.print("Do you want to continue (c/e): ");
            String nextStep = scanner.next();
            if(!nextStep.startsWith("c")){
                system.out.print("Thank You!");
                break;
            }
        }

    }
}
