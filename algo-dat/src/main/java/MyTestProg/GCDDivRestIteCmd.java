package MyTestProg;

public class GCDDivRestIteCmd implements ICommand{
    public void execute(){

    }

    public String toString(){
        
    }

    public int euclidDivisionRestIterative(int a, int b){
        do {
            int h = a % b;
            a = b;
            b = h;

        }while(b !=0);   
    
        return a;
    }
}