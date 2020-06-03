package hometaskfive;

public class EmployeeCreation {

	public Employee createEmployee(String name, int account, int salary) {
		EmployeeService employeeService = Employee::new;
		return employeeService.createEmployee(name, account, salary);
	}

}
