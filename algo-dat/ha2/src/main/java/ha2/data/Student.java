package data;

public class Student {
    private String prename;
    private String surname;
    private int course;
    private int matriculationNumber;

    public Student(){

    }

    public Student(String prename, String surname, int course, int matriculationNumber){
        this.prename = prename;
        this.surname = surname;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }

    public String toString(){
        return "Student [prename=" + prename + ", surname=" + surname + ", course=" + course + ", matriculationNumber=" + matriculationNumber + "]";
    }

    public void setPrename(String prename){
        this.prename = prename;
    }

    public String getPrename(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public int getCourse(){
        return this.course;
    }

    public void setMatriculationnumber(int matriculationNumber){
        this.matriculationNumber = matriculationNumber;
    }

    public int getMarticulationnumber(){
        return this.matriculationNumber;
    }


}