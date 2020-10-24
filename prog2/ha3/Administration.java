import java.util.Arrays;

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

    
    public static String outputList(Person[] list) throws NullPointerException {    
        return Arrays.toString(list);
    }


    /*
    public static Person[] sortList(Person[] list) throws java.lang.NullPointerException {

        Person temp;

        for(int i=0; i<list.length;i++){
            for(int j=i+1; j<list.length; j++){
                if (list[i].getNachname().compareTo(list[j].getNachname() > 0)){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }

    */
}