package ke.co.safaricom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Welcome to Caeser Cipher Application");
        Cipher cipher = new Cipher();

        while(true){
            System.out.print("Enter a message: ");
            String message = Scanner.next();

            System.out.print("Enter a process (e/d): ");
            String process = Scanner.next();

            System.out.print("Enter a key: ");
            int key = Scanner.nextInt();

            cipher.setMessage(message);
            cipher.setKey(key);

            String output = "";

            if(process.startsWith("e")){
                output = cipher.encrypt();
            } else {
               output = cipher.decrypt();
            }

            System.out.println("Your output message is: " + output);

            System.out.print("Do you want to continue (c/e): ");
            String nextStep = Scanner.next();

            if(!nextStep.startsWith("c")){
                System.out.print("Thank You!");
                break;
            }
        }

    }
}
