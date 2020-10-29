import java.util.Arrays;

public class Administration {
	
	// Returns count (integer) of females in a given Array of class Person
    public static int countFemale(Person[] list){
    	// set count to 0
        int count = 0;
        for(int i=0; i<list.length; i++){
        	// if getGeschlecht method returns 'f' as for female, increment the count
            if(list[i].getGeschlecht() == 'f'){
                count++;
            }
        }

        return count;
    }

    // Creates and returns an array of objects of class Person
    public static Person[] createList(Person... persons){
    	//init array
    	Person[] personArray = new Person[persons.length];
    	// add every person object to the newly initialized array
    	for(int i=0;i<persons.length; i++){
           personArray[i] = persons[i];
    	}

       return personArray;
    }
    
    // Sorts out and returns objects of class Person in Array alphabetically, if the array is null, throws NullPointerException
    public static Person[] sortList(Person[] list) throws NullPointerException {
    	 if (list == null) {
             throw new NullPointerException("Error!!! array cannot be null.");
         }else {
             for (int j = 0; j <( list.length); j++) {  // bubble sort algorithm
                 for (int i = 0; i < list.length-1; i++) {
                 if (list[i].getNachname().compareTo(list[i+1].getNachname()) >= 0) {
                     Person temp = list[i];
                     list[i] = list[i+1];
                     list[i+1] = temp;
                 }
                 }
             }
         }

         System.out.println(outputList(list));
         return list;
    }
    
    
    // Converts and returns array of objects of class Person, if array is null, throws NullPointerException
    public static java.lang.String outputList(Person[] list) throws java.lang.NullPointerException{
    	
    	if(list == null) {
    		throw new java.lang.NullPointerException();
    	}
    	
    	return Arrays.toString(list);
    }
}