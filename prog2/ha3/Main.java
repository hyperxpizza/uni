public class Main{
    public static void main(String[] args) {
        Student s1 =  new Student("Max1", "Muster1", 'm', 1234);
        Student s2 =  new Student("Max2", "Wuster2", 'm', 1231);
        Student s3 =  new Student("Max3", "Zuster3", 'm', 1234);
        Student s4 =  new Student("Max4", "Kuster4", 'm', 1235);
        
        Person[] pList= {s1, s2, s3, s4};
        Administration a1 =  new Administration();
    
        a1.outputList(a1.sortList(pList));
        

    
    
    }

}