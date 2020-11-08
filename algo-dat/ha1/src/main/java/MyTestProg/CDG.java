package MyTestProg;

public class CDG {
    public static int eculidSubstractionIterative(int x, int y){
        if(x==0){
            return y;
        } else {
            while(y != 0){
                if(x > y){
                    x = x - y;
                } else {
                    y = y - x;
                }
            }
        }

        return x;
    }
    
    public static int euclidSubstractionRecursive(int x, int y){
        if(y==0){
            return x;
        } else if (x == 0){
            return y;
        } else if (x > y){
            return euclidSubstractionRecursive(x-y, y);
        } else {
            return euclidSubstractionRecursive(x, y-x);
        }
    }

    public static int eculidDivisionRestIterative(int x, int y){
        int h;
        while (y != 0){
            h = x % b;
            x = y;
            y = h;
        }

        return x;
    }

    public static int eculidDivisionRestRecursive(int x, int y){
        if (y == 0){
            return x;
        } 
        return eculidDivisionRestRecursive(y, x % y);
    }
}