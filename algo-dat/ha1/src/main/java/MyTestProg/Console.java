package MyTestProg;

import java.util.Scanner;

public class Console {
    
    public static int readIntegerFromStdIn(String text){
        Scanner sc = new Scanner(System.in);
      
        System.out.print(text);
        int num = sc.nextInt();
        sc.close();
        
        return num;
    }

}