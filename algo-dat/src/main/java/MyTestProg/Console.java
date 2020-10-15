package MyTestProg;

//imports
import java.util.Scanner; 
import java.util.InputMismatchException;

public class Console {

    public String prename;
    public String surname;
    public int x;
    public int y;

    public void readIntegerFromStdin(){
        // init scanner
        Scanner input = new Scanner(System.in);

        boolean running1 = true;
        System.out.print("Enter number for x: ");
        while(running1 == true){
            try{
                this.x = input.hasNextInt();
                running1 = false;
            } catch(InputMismatchException e){
                System.out.println(e);
            }
        }

        boolean running2 = true;
        System.out.print("Enter number for y: ");
        while(running2 == true){
            try{
                this.y = input.hasNextInt();
                running2 = false;
            } catch(InputMismatchException e){
                System.out.println(e);
            }
        }

        input.close();
    }

    public void readStringFromStdin(){
        // init scanner
        Scanner input = new Scanner(System.in);
        
        boolean running1 = true;
        System.out.print("Enter prename: ");
        while(running1 == true){
            try{
                this.prename = input.nextLine();
                running1 = false;
            } catch(InputMismatchException e){
                System.out.println(e);
            }
        }

        boolean running2 = true;
        System.out.print("Enter surname: ");
        while(running2 == true){
            try{
                this.surname = input.nextLine();
                running2 = false;
            } catch(InputMismatchException e){
                System.out.println(e);
            }
        }

        input.close();
    }
}