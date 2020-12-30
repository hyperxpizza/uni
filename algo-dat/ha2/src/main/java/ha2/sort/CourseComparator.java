package sort;

import ha2.data.Student;

public class CourseComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCourse() - o2.getCourse();
	}

}