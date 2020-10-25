import java.io.*;
public class Main{
    public static void main(String[] args) {
        Student s1 =  new Student("Max1", "Muster1", 'm', 1234);
        Student s2 =  new Student("Max2", "Wuster2", 'm', 1231);
        Student s3 =  new Student("Max3", "Zuster3", 'm', 1234);
        Student s4 =  new Student("Max4", "Kuster4", 'm', 1235);
        
        Person[] pList= null;
        Administration a1 =  new Administration();
    
        try {
            String message;
            message = a1.outputList(pList);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("Something went wrong.");
        }


    
    
    }

}