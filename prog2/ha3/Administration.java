import java.util.Arrays;
import java.io.*;

public class Administration {
 
    public static int countFemale(Person[] list){
        int count = 0;
        for(int i=0; i<list.length; i++){
            if(list[i].getGeschlecht() == 'f'){
                count++;
            }
        }

        return count;
    }

    public Person[] createList(Person... persons){
       Person[] personArray = new Person[persons.length];
       for(int i=0;i<persons.length; i++){
           personArray[i] = persons[i];
       }

       return personArray;
    }

    
}