package data;

public class Student implements Comparable<Student>{
    private String prename;
    private String surname;
    private int course;
    private int matriculationNumber;

    public Student(){
        System.out.println("[*] Running constructor without parameters");
    }

    public Student(String prename, String surname, int course, int matriculationNumber){
        this.prename = prename;
        this.surname = surname;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }

    public String toString(){
        String msg = "Prename: " + this.prename + "\n" + "Surname: " + this.surname + "\n" + "Course: " + this.course + "\n" + "Marticulationnumber: " + this.matriculationNumber + "\n";
        return msg;
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

    @Override
	public int compareTo(Student arg) {
        if(getCourse() > arg.getCourse()){
            return 1;
        } else if (getCourse() < arg.getCourse()){
            return -1;
        } else {
            return 0;
        }
    }
}