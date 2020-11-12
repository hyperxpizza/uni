package MyTestProg;

import java.util.Scanner;

public class Console {
    
    public static int readIntegerFromStdIn(String text){
        //init scanner object
        Scanner sc = new Scanner(System.in);
      
        int x;
        // repeat until user gives a correct input
        while(true){
            //if input is an integer, break the loop, otherwise throw an exception
            try {
                System.out.print(text);
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("not a valid input, try again");
            }
        }

        return x;
    }

    public static String readStringFromStdIn(String text){
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String msg = sc.nextLine();

        return msg;
    }

}