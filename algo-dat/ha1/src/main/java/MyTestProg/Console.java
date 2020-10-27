
package MyTestProg;

import java.util.Scanner;
public class Console {
    // Integer attributes
    private int x;
    private int y;

    // String attributes
    private String prename;
    private String surname;

    // Get Integers from scanners
    public void setIntegers(){
        // init scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for x: ");
        this.x = scan.nextInt();
        System.out.print("\n");
        System.out.print("Enter number for y: ");
        this.y = scan.nextInt();

        //close scanner
        scan.close();
    }

    public void setStrings(){
        // init scanner class
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.print("Enter prename: ");
        this.prename = scan.nextLine();
        System.out.print("\n");
        System.out.print("Enter surname: ");
        this.surname = scan.nextLine();
        
        //close scanner
        scan.close();
    }

}