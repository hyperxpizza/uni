/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ha2;

import data.Student;
import ha2.sort.Sortable;
import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class App {
    public static void main(String[] args){
        // Select which list type to use
        int listType = 0;
        while((listType != 1 ) || (listType != 2)){
            printListMenu();
            listType = Console.readIntegerFromStdIn("Please enter a number for an option:");
        }


        if (listType == 1) {
            SinglyLinkedList list = new SinglyLinkedList<Student>();
        } else {
            DoublyLinkedList list = new DoublyLinkedList<Student>();
        }

        // main menu
        boolean mainMenuRunning = true;
        while(mainMenuRunning == true){
            printMenu(list.getClass().getSimpleName());
            int mainMenuOption = Console.readIntegerFromStdIn("Please enter a number for an option:");
            switch(mainMenuOption){
                case 0:
                    mainMenuRunning = false;
                    break;
                case 1:
                    insertStudent(list);
                    break;
                case 2:
                    insertStudentAtIndex(list);
                    break;
                case 3:
                    insertStudentFirst(list);
                    break;
                case 4:
                    insertStudentLast(list);
                    break;
                case 5:
                    getStudent(list);
                    break;
                case 6:
                    list.printAll();
                    break;
                case 7:
                    int size = list.size();
                    System.out.println("Size: " + size);
                    break;
                case 8:
                    removeStudentAtIndex(list);
                    break;
                case 9:
                    list.clear();
                    break;
                case 10:
                    boolean searchMenuRunning = true;
                    int searchMenuOption = 0;
                    while(searchMenuRunning == true){
                        printSearchMenu();
                        searchMenuOption = Console.readIntegerFromStdIn("Please enter a number for an option");

                        switch(searchMenuOption){
                            case 1:
                                String prename = Console.readStringFromStdIn("Please enter prename for the search: ");
                                searchMenuRunning = false;
                                // todo: search
                                break;
                            case 2:
                                String surname = Console.readStringFromStdIn("Please enter surname for the search: ");
                                searchMenuRunning = false;
                                // todo: search
                                break;
                            case 3:
                                int courseNumber = Console.readIntegerFromStdIn("Please enter course number for the search: ");
                                searchMenuRunning = false;
                                //todo: search
                                break;
                            case 4:
                                int matriculationNumber = Console.readIntegerFromStdIn("Please enter matriculation number for the search: ");
                                searchMenuRunning = false;
                                //todo: search
                                break;
                            default:
                                System.out.println("[-] Wrong input, please try again");
                        }
                    }
                    break;
                case 11:
                /*
                    boolean sortMenuRunning = true;
                    while(sortMenuRunning == true){
                        printSortMenu1();
                        int sortMenuOption1 = Console.readIntegerFromStdIn("Please enter a number for an option: ");
                        
                        String method = "";
                        boolean sortMenu2Running = true;

                        switch(sortMenuOption1){
                            case 1:
                                method = "Bubblesort";
                                boolean 
                            case 2:
                                method = "Selectionsort";    

                        }
                    }
                    */
                    break;
                default:
                    System.out.println("[-] Wrong input, please try again");
            }
        }
        
    }

    private static void printMenu(String list){
        System.out.println("Console-Application: Exercise-2 \t\t Wojciech Maximilian Frackowski 576278");
        System.out.println("1. Add Student to the end of the list");
        System.out.println("2. Inserts the Student at the specified position in this list.");
        System.out.println("3. Inserts the Student at the beginning of this list.");
        System.out.println("4. Appends the Student to the end of this list.");
        System.out.println("5. Returns the Student at the specified position in this list.");
        System.out.println("6. Print all students to console from list.");
        System.out.println("7. Returns the number of Students in this list.");
        System.out.println("8. Removes the Student at the specified position in this list.");
        System.out.println("9. Removes all of the Students from this list.");
        System.out.println("10. Search for student(s) by different characteristics.");
        System.out.println("11. Sort list by different properties");
        System.out.println("0. Exit");
    }

    private static void printSearchMenu(){
        System.out.println("Select a property to search for the student: ");
        System.out.print("\n");
        System.out.println("1. Search by prename?");
        System.out.println("2. Search by surname?");
        System.out.println("3. Search by course number?");
        System.out.println("4. Search by matriculation numer?");
    }

    private static void printSortMenu1(){
        System.out.println("Select a sorting method for sorting: ");
        System.out.println("");
        System.out.println("1. Bubblesort?");
        System.out.println("2. Selectionsort?");
    }

    private static void printSortMenu2(String method){
        System.out.println("Please select a property for sorting with the '" + method + "' algorithm:");
        System.out.println("");
        System.out.println("1.Sort by course?");
        System.out.println("2.Sort by marticulation number?");
    }

    private static void printListMenu(){
        System.out.println("Console-Application: Exercise-2 \t\t Wojciech Maximilian Frackowski 576278");
        System.out.println("");
        System.out.println("Select list type before starting the main menu: ");
        System.out.println("1. SinglyLinkedList");
        System.out.println("2. DoublyLinkedList");
    }

    private static Student createStudent(){
        String prename = Console.readStringFromStdIn("Please enter prename: ");
        String surname = Console.readStringFromStdIn("Please enter surname: ");
        int course = Console.readIntegerFromStdIn("Please enter course number: ");
        int matriculationNumber = Console.readIntegerFromStdIn("Please enter matriculation number: ");

        Student s = new Student(prename, surname, course, matriculationNumber);

        return s;
    }

    private static void insertStudentAtIndex(Listable list){
        int index = Console.readIntegerFromStdIn("Index: ");
        Student s = createStudent();
        list.add(index, s);
    }

    private static void insertStudent(Listable list){
        Student s = createStudent();
        list.add(s);
    }

    private static void insertStudentFirst(Listable list){
        Student s = createStudent();
        list.addFirst(s);
    }

    private static void insertStudentLast(Listable list){
        Student s = createStudent();
        list.addLast(s);
    }

    private static void getStudent(Listable list){
        int index = Console.readIntegerFromStdIn("Which index: ");
        Student s = list.get(index);
        if(s == null){
            System.out.println("wrong index");
        } else {
            System.out.println(s);
        }
    }

    private static void removeStudentAtIndex(Listable list){
        int index = Console.readIntegerFromStdIn("Which index: ");
        list.remove(index);
    }

    private static void sort(Listable<Student> list, Sortable<ha2.data.Student> algo, Comparator<Student> comparator){
        algo.sort(list, comparator);
    }
}