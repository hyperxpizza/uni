package sort;

import data.Student;

public class MatriculationNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMarticulationnumber() - o2.getMarticulationnumber();
	}

}