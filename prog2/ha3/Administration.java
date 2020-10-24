import java.util.ArrayList;

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
        Person[] personArray= new Person[persons.length];

        return personArray;
    }

    /*
    public static java.lang.String outputList(Person[] list) throws java.lang.NullPointerException {

    }

    public static Person[] sortList(Person[] list) throws java.lang.NullPointerException {

    }
    */


}