package Part2Simpledialogwithloop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String reply = "";
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Enter any text : ");
            String input = in.nextLine();
            System.out.println("Your text, but bigger: " + input.toUpperCase());

            System.out.println("Continue(Y/N)");
            reply = in.nextLine();

        } while(reply.equals("Y") || reply.equals("y"));
        System.out.println("You used automated printing services");
    }
}
