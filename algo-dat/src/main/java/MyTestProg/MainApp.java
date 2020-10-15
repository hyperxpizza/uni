package MyTestProg;
import java.util.LinkedList;
import java.util.Scanner;

public class MeinApp{

    LinkedList<ICommand> commands;
    CommandFactory cmdFactory;

    public static void printMenu(){
        System.out.print("Console-Application: Exercise-1 \t\t Wojciech Maximilan Frackowski 0576278\n\n");

        System.out.println("1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction.");
        System.out.println("2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.");
        System.out.println("3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.");
        System.out.println("4. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.");
        System.out.println("5. Sieve of Eratosthenes.");
        System.out.println("6. Read properties like surname, prename, x and y.");
        System.out.println("0. Exit.");

        System.out.print("Please enter a number for an option: ");

    }

    public static void main(String args[]){
        // init scanner
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while(running){
            printMenu();
            int x = input.hasNextInt();
            switch (x) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    
                default:
                    break;
            }
        }
        
    }
}

