package collectionFramework.sortingapp;

import java.util.Comparator;

public class HighestLevelWiseSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getLevel() < e2.getLevel()) {
			return -1;
		}else if(e1.getLevel() > e2.getLevel()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	

}
