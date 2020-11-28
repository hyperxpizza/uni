package main.java.ha3;

public class Student {
	private String prename;
	private String surname;
	private int course;
	private int matriculationNumber;

	public Student(String prename, String surname, int course, int matriculationNumber) {
		super();
		this.prename = prename;
		this.surname = surname;
		this.course = course;
		this.matriculationNumber = matriculationNumber;
	}

	@Override
	public String toString() {
		return "Student [prename=" + prename + ", surname=" + surname + ", course=" + course + ", matriculationNumber="
				+ matriculationNumber + "]";
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

}