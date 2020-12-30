package sort;

import data.Student;

public class PrenameComparator implements Comparator<Student> {

    @Override
	public int compare(Student o1, Student o2) {
		System.out.println("o1: " + o1);
		System.out.println("o2: " + o2);

		System.out.println(o1.getPrename().compareTo(o2.getPrename()));

		if (o1.getPrename() == null && o2.getPrename() == null) {
			return 0;
		} else if (o1.getPrename() == null) {
			return 1;
		} else if (o2.getPrename() == null) {
			return -1;
		}

		
		return o1.getPrename().compareTo(o2.getPrename());
	}
}