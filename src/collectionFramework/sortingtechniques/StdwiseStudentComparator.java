package collectionFramework.sortingtechniques;

import java.util.Comparator;

public class StdwiseStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getStd() > s2.getStd()) {
			return 1;
		}else if(s1.getStd() < s1.getStd()) {
			return -1;
		}else {
			return 0;
		}
	}
}
