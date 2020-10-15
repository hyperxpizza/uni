package MyTestProg;

public class GCDSubRecCmd implements ICommand{
    public void execute(){

    }

    public String toString(){
        
    }

    public int euclidSubstractionRecursive(a,b){
        if (b == 0)
           return a;
        else if (a == 0)
            return b;
        else if (a > b)
            return euclidSubstractionRecursive(a - b, b);
        else
            return euclidSubstractionRecursive(a, b - a);
    }

}