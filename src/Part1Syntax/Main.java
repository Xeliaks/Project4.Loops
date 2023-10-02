package Part1Syntax;

public class Main {
    public static void main(String[] args) {
        //1.1 Demonstrate while loop
        int i = 0;
        while (i < 5) {
            System.out.print(" " + i);
            i++;
        }
        //1.2 Demonstrate do while loop
        System.out.println(" ");
        do {
            System.out.print(" " + i);
            i--;
        }
        while (i > 0);
        //1.3 Demonstrate for loop
        System.out.println(" ");
        for (i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        //1.4  Iterate through string
        System.out.println(" ");
        System.out.println("Alphabet");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
        //1.5 Nested loops
        System.out.println(" ");
        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 4; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();

        }
    }
}