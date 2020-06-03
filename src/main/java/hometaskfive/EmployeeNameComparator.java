package hometaskfive;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
	
		return firstEmployee.getName().compareTo(secondEmployee.getName());
	}


}
