package Part4Putpreviouspartintoloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String reply = "";
        String reverse = "";
        Scanner in = new Scanner(System.in);
        String reply2 = "";
        do {

            do {
                System.out.print("Enter any text : ");
                String input = in.nextLine();
                for (int i = input.length() - 1; i >= 0; i--) {
                    reverse += input.charAt(i);

                }
                System.out.println("Your word backwards " + reverse);
                System.out.println("Continue?(Y/N)");
                reply = in.nextLine();
                reverse = "";

            } while (reply.equals("Y") || reply.equals("y"));
            System.out.println("Wanna get some more?(Y/N)");
            reply2 = in.nextLine();
        }
        while (reply2.equals("Y") || reply2.equals("y"));
        System.out.println("Thanks for using our services");

    }
}
