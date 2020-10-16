package MyTestProg;
import java.util.LinkedList;
import java.util.Scanner;

public class MeinApp{

    LinkedList<ICommand> commands;
    CommandFactory cmdFactory = new CommandFactory();

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
                    running = false;
                    break;
                case 1:
                    cmdFactory
                    break;
                case 2:
                    cmdFactory
                    break;
                case 3:
                    cmdFactory
                    break;
                case 4:
                    cmdFactory
                    break;
                case 5:
                    cmdFactory
                    break;
                case 6:
                    Console c = new Cosnole();
                    c.
                default:
                    System.out.println("Wrong input! Try Again!");
                    break;
            }
        }
        
    }
}

