package MyTestProg;

import java.util.Scanner;

public class Console {
    
    public static int readIntegerFromStdIn(String text){
        Scanner sc = new Scanner(System.in);
      
        System.out.print(text);
        int num = sc.nextInt();
        
        return num;
    }

    public static String readStringFromStdIn(String text){
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String msg = sc.nextLine();

        return msg;
    }

}