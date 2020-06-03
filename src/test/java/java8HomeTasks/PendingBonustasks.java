package java8HomeTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

import bonustasks.MyRunnable;
import bonustasks.SortingNumbers;
import hometaskfive.Employee;
import hometaskfive.EmployeeNameComparator;

public class PendingBonustasks {

	 ArrayList<Integer> testArray = new ArrayList<Integer>();
	 
	 @Test
	  public void sortingNumbersInReverseOrderTest() {
		 testArray.add(11);
		 testArray.add(21);
		 testArray.add(10);
		 testArray.add(4);
		 testArray.add(15);
		 testArray.add(1);
		 SortingNumbers sortingNumbers = new SortingNumbers();
		 System.out.println("Sorting in reverse order with lamda: "+sortingNumbers.sortInreverseOrderWithLambda(testArray));
		 System.out.println("Sorting in reverse order without lamda: "+sortingNumbers.sortInreverseOrderWithoutLambda(testArray));
	  }
	
	 @Test
	  public void myRunnableTestWithoutLamdaTest() {
		 MyRunnable myRunnable =new MyRunnable();
		 Thread thread=new Thread(myRunnable);
		 thread.start();
		 for(int i=0; i<10; i++) {
		 System.out.println("Main Thread");
			}
	 }
	 
	 @Test
	  public void myRunnableTestWithLamdaTest() {
		 Thread thread=new Thread(()-> {
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread");
				}
			});
		thread.start();
		for(int i=0; i<10; i++) {
		System.out.println("Main Thread");
		}
	 }
	 
	 @Test
	  public void sortEmployeesAlphabeticallyWithoutLambda() {
		 ArrayList<Employee> employeesList = new ArrayList<Employee>();
		 
		 employeesList.add(new Employee("Gayathri", 1234, 10000));
		 employeesList.add(new Employee("Rakesh", 1234, 10000));
		 employeesList.add(new Employee("Ashraf", 1234, 10000));
		 System.out.println("Employees list before sorting alphabetically : "+employeesList);
	     Collections.sort(employeesList, new EmployeeNameComparator());
	     System.out.println("Employees list after sorting alphabetically : "+employeesList);
	 }
	 
	 @Test
	  public void sortEmployeesAlphabeticallyWithLambda() {
		 
		 ArrayList<Employee> employees = new ArrayList<Employee>();
		 employees.add(new Employee("Imran", 1234, 10000));
		 employees.add(new Employee("Ayesha", 1234, 10000));
		 employees.add(new Employee("Yasmin", 1234, 10000));
		 System.out.println("Employees list before sorting alphabetically : "+employees);
	     Collections.sort(employees, (e1,e2)->e1.getName().compareTo(e2.getName())); 
	     System.out.println("Employees list after sorting alphabetically : "+employees);
	 }
	 
	 @Test
	  public void sortTreeSetInReverseOrderWithoutLambda() {

		 TreeSet<Integer> treeSetOfIntegers =new TreeSet<Integer>();
		 treeSetOfIntegers.add(235);
		 treeSetOfIntegers.add(100);
		 treeSetOfIntegers.add(150);
		 treeSetOfIntegers.add(198);
		 System.out.println("Set of Integers in default sorting order(Ascending) : "+treeSetOfIntegers);
		 System.out.println("Set of Integers in reverse order : "+treeSetOfIntegers.descendingSet());		 
	 }
	 
	 @Test
	  public void sortTreeSetInReverseOrderWithLambda() {

		 TreeSet<Integer> treeSetOfNumbers =new TreeSet<Integer>((firstNumber, secondNumber)->(firstNumber>secondNumber)?-1:(firstNumber<secondNumber)?1:0);
		 treeSetOfNumbers.add(235);
		 treeSetOfNumbers.add(100);
		 treeSetOfNumbers.add(150);
		 treeSetOfNumbers.add(198);
		 System.out.println("Set of Integers in reverse order : "+treeSetOfNumbers); 
	 }
	 
	 @Test
	  public void sortTreeSetOfEmployeesInAlphabeticOrderWithoutLambda() {

		 TreeSet<Employee> treeSetOfEmployees =new TreeSet<Employee>(new EmployeeNameComparator());
		 treeSetOfEmployees.add(new Employee("Kavya", 112233, 40000));
		 treeSetOfEmployees.add(new Employee("Satya", 101912, 50000));
		 treeSetOfEmployees.add(new Employee("Ayesha", 123321, 60000));
		 System.out.println("Employees in aplhabetic order of names : "+treeSetOfEmployees); 
	 }
	 
	 @Test
	  public void sortTreeSetOfEmployeesInAlphabeticOrderWithLambda() {

		TreeSet<Employee> treeSetOfEmployees =new TreeSet<Employee>((firstEmployee,esecondEmployee)->firstEmployee.getName().compareTo(esecondEmployee.getName()));
				 
		treeSetOfEmployees.add(new Employee("Kavya", 112233, 40000));
		treeSetOfEmployees.add(new Employee("Satya", 101912, 50000));
		treeSetOfEmployees.add(new Employee("Ayesha", 123321, 60000));
		System.out.println("Employees in aplhabetic order of names : "+treeSetOfEmployees); 
	 }
	 
	 @Test
	  public void sortTreeMapInReverseOrderWithoutLambda() {

		 TreeMap<Integer, String> treeMapOfIntegers = new TreeMap<Integer, String>();
		 treeMapOfIntegers.put(10, "Apple");
		 treeMapOfIntegers.put(9, "Grapes");
		 treeMapOfIntegers.put(5, "Mango");
		 treeMapOfIntegers.put(11, "Orange");
		 System.out.println("Tree Map in default sorting order(Ascending order of key) : "+treeMapOfIntegers);
		 System.out.println("Tree Map in reverse order(Descending order of key) : "+treeMapOfIntegers.descendingMap());		 
	 }
	 
	 @Test
	  public void sortTreeMapInReverseOrderWithLambda() {

		 TreeMap<Integer, String> treeMapOfIntegers = new TreeMap<Integer, String>((firstParamater, secondParameter)->(firstParamater>secondParameter)?-1:(firstParamater<secondParameter)?1:0);
		 treeMapOfIntegers.put(10, "Apple");
		 treeMapOfIntegers.put(9, "Grapes");
		 treeMapOfIntegers.put(5, "Mango");
		 treeMapOfIntegers.put(11, "Orange");
		 System.out.println("Tree Map in reverse order(Descending order of key) : "+treeMapOfIntegers);	 
	 }
	 
	 @Test
	  public void sortTreeMapOfEmployeesInDescendingOrderWithoutLambda() {

		 TreeMap<Employee, String> treeMapOfEmployees = new TreeMap<Employee, String>(new EmployeeNameComparator());
		 treeMapOfEmployees.put(new Employee("Kiran", 100, 10000), "Developer");
		 treeMapOfEmployees.put(new Employee("Rahul", 101, 20000), "Tester");
		 treeMapOfEmployees.put(new Employee("Abdul", 102, 30000), "Tester");
		 System.out.println("Tree Map of Employees in default sorting order(Ascending order of Employee name) : "+treeMapOfEmployees);
		 System.out.println("Tree Map of Employees in descending order of Employee name) : "+treeMapOfEmployees.descendingKeySet());		 
	 }
	 
	 @Test
	  public void sortTreeMapOfEmployeesInDescendingOrderWithLambda() {

		 TreeMap<Employee, String> treeMapOfEmployees = new TreeMap<Employee, String>((firstEmployee,esecondEmployee)->firstEmployee.getName().compareTo(esecondEmployee.getName()));
		 treeMapOfEmployees.put(new Employee("Kiran", 100, 10000), "Developer");
		 treeMapOfEmployees.put(new Employee("Rahul", 101, 20000), "Tester");
		 treeMapOfEmployees.put(new Employee("Abdul", 102, 30000), "Tester");
		 System.out.println("Tree Map of Employees in default sorting order(Ascending order of Employee name) : "+treeMapOfEmployees.descendingKeySet());	 
	 }
	 
	 @Test
	  public void sortEmployeesInDescendingOrderUsingComparator() {

		 ArrayList<Employee> employees = new ArrayList<Employee>();
		 employees.add(new Employee("B", 10, 10000));
		 employees.add(new Employee("A", 14, 10000));
		 employees.add(new Employee("C", 11, 10000));
		 employees.add(new Employee("F", 12, 10000));
		 employees.add(new Employee("E", 15, 10000));
		 employees.add(new Employee("D", 13, 10000));
		 System.out.println("Employees list before sorting : "+employees);
	     Collections.sort(employees, (e1,e2)->e2.getName().compareTo(e1.getName())); 
	     System.out.println("Employees in decending order of their name : "+employees);
	 }
	 
}
