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

    public static Person[] createList(Person... persons){
       Person[] personArray = new Person[persons.length];
       for(int i=0;i<persons.length; i++){
           personArray[i] = persons[i];
       }

       return personArray;
    }
    
    
    public static Person[] sortList(Person[] list) throws java.lang.NullPointerException {
    	Arrays.sort(list);
    	return list;
    }
    
    public static java.lang.String outputList(Person[] list) throws java.lang.NullPointerException{
    	if(list == null) {
    		throw new java.lang.NullPointerException();
    	}
    	return Arrays.toString(list);
    }
}