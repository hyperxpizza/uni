package MyTestProg;

import java.util.Scanner;

public class Console {
    
    public static int readIntegerFromStdIn(String text){
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print(text);
        num = sc.nextInt();
        sc.close();
        
        return num;
    }

    /*
    public String readStringFromStdIn(String text){

    }
    */

}