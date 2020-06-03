package java8HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import biFunctionalInterfaceEx.StudentSubjectEx;
import functionalInterfacesOfJava.FilterGivenFruits;
import functionalInterfacesOfJava.Fruits;
import hometaskfive.Employee;
import hometaskfive.EmployeeCreation;
import hometaskfour.IntConsumerExample;
import hometaskfour.IntPredicateExample;
import hometaskfour.IntSupplierExample;
import hometasksix.OperationsOnStreams;
import largestNum.NumberOperationsWithLambda;
import largestNum.SecondLargestNumberFromArray;
import largestNum.LargestNumberFromArray;
import palindrome.StringOperations;
import palindrome.StringPalindrome;
import palindrome.StringRotation;

public class HomeTasksTests {
  @Test
  public void GetLargestNumWithLambdaTest() {
  
	  int[] testArray = {10000,10, 20, 30 , 4005, 1, 2, 6, 100, 123};
	  NumberOperationsWithLambda numberOperations = new NumberOperationsWithLambda();
	  System.out.println("Largest number from the given array is: "+numberOperations.getLargestNumFromArray(testArray));
	 
  }
  
  @Test
  public void GetLargestNumWithoutLambdaTest() {
  
	  int[] testArray = {9000,10, 120, 30 , 4005, 1, 9500,2, 6, 100, 123};
	  
	  LargestNumberFromArray largestNumberFromArray = new LargestNumberFromArray();
	  System.out.println("Largest number from the given array is: "+largestNumberFromArray.getLargestNum(testArray));
  }
  
  @Test
  public void GetSecondLargestNumWithLambdaTest() {
	  int[] testArray = {10000,10, 20, 30 , 4005, 1, 2, 6, 100, 123};
	  NumberOperationsWithLambda numberOperations = new NumberOperationsWithLambda();
	  System.out.println("Second largest number from the given array is: "+numberOperations.getSecondLargestNumFromArray(testArray));
  }
  
  @Test
  public void GetSecondLargestNumWithoutLambda() {
	  int[] testArray = {10000,10, 20, 30 , 4005, 1, 2, 6, 100, 123};
	  SecondLargestNumberFromArray secondLargestNumberFromArray = new SecondLargestNumberFromArray();
	  System.out.println("Second largest number from the given array is: "+secondLargestNumberFromArray.getSecondLargestNum(testArray));
  }
  
  @Test
  public void VerifyPalindromeWithLambdaTest() {
	  String testString1 = "Ayesha Begum"; 
	  String testString2 = "malayalam"; 
	  StringOperations stringOperations = new StringOperations();
	  System.out.println("Is given string a palindrome...??"+testString1+" - "+stringOperations.verifyPalindrome(testString1));
	  System.out.println("Is given string a palindrome...??"+testString2+" - "+stringOperations.verifyPalindrome(testString2));
  }
  
  @Test
  public void VerifyPalindromeWithoutLambdaTest() {
	  String testString1 = "Ayesha Begum"; 
	  String testString2 = "malayalam";  
	  StringPalindrome stringPalindrome = new StringPalindrome();
	  System.out.println("Is given string a palindrome...??"+testString1+" - "+stringPalindrome.checkIfPalindrome(testString1));
	  System.out.println("Is given string a palindrome...??"+testString2+" - "+stringPalindrome.checkIfPalindrome(testString2));
  }
  
  @Test
  public void VerifyStringsAreRotatableWithLambdaTest() {
	  String testString1 = "abcd"; 
	  String testString2 = "bdac"; 
	  String testString3 = "abcd"; 
	  String testString4 = "bcda"; 
	  StringOperations stringOperations = new StringOperations();
	  System.out.println("Are the given strings rotation of each other : "+testString1+" and "+testString2+" - "+stringOperations.verifyStringsAreRotatable(testString1, testString2));
	  System.out.println("Are the given strings rotation of each other : "+testString3+" and "+testString4+" - "+stringOperations.verifyStringsAreRotatable(testString3, testString4));
  }
  
  @Test
  public void VerifyStringsAreRotatableWithoutLambdaTest() {
	  String testString1 = "abcd"; 
	  String testString2 = "bdac"; 
	  String testString3 = "abcd"; 
	  String testString4 = "bcda"; 
	  StringRotation stringRotation = new StringRotation();
	  System.out.println("Are the given strings rotation of each other : "+testString1+" and "+testString2+" - "+stringRotation.areStringsRotatable(testString1, testString2));
	  System.out.println("Are the given strings rotation of each other : "+testString1+" and "+testString2+" - "+stringRotation.areStringsRotatable(testString3, testString4));
  }
  
  @Test
  public void filterFruitsTest() {

	Fruits fruit1 = new Fruits("Apple", 10);
	Fruits fruit2 = new Fruits("guava", 20);
	Fruits fruit3 = new Fruits("pineapple", 30);
		
	List<Fruits> fruits = new ArrayList<Fruits>();
	fruits.addAll(Arrays.asList(new Fruits[]{fruit1,fruit2, fruit3 }));
	  	
	FilterGivenFruits.checkPriceAndName(fruits);
  }
  
  @Test
  public void filterStudentsTest() {
		
		HashMap<String, String> studentsList = new HashMap<String, String>();
		studentsList.put("Ayesha", "Hindi");
		studentsList.put("Salma", "Telugu");
		studentsList.put("Fazila", "English");
		studentsList.put("Sameer", "Sanskrit");
		studentsList.put("Shubhangi", "Marathi");
		
		ArrayList<String> subjects123 = new ArrayList<String>();
		subjects123.add("Hindi");
		subjects123.add("English");
		subjects123.add("Telugu");
		subjects123.add("Sanskrit");
		
		System.out.println(StudentSubjectEx.checkStudentSubjectCondition(studentsList, "Shubhangi", subjects123));
  }
  
  @Test
  public void employeeDetailsTest() {
	  EmployeeCreation employeeCreation = new EmployeeCreation();
	  Employee firstEmployee = employeeCreation.createEmployee("Ayesha", 110011, 10000);
	  System.out.println("Name of the Employee : "+firstEmployee.getName()+"\nAccount Number of the Employee : "+firstEmployee.getAccount()+"\nSalary of the Employee : "+firstEmployee.getSalary()+"\n");    
  }
  
  @Test
  public void streamsTest() {
	  Stream<Integer> firstStream = Stream.of(1,2,3,4,5,4,5);
	  Stream<Integer> secondStream = Stream.of(10,20,30,40,50,40,50);
	  OperationsOnStreams.removeDuplicatedAndConcat(firstStream, secondStream);
  }
  
  
  @Test
  public static void checkPrimeNumberTest() {
	
	  IntPredicateExample intPredicateExample = new IntPredicateExample();	
	  int testNumber1 = 11;
	  int testNumber2 = 13;
	  int testNumber3 = 15;
	  System.out.println("Is "+testNumber1+" a Prime Number ?? "+intPredicateExample.checkNumberIsPrime(testNumber1));
	  System.out.println("Is "+testNumber2+" a Prime Number ?? "+intPredicateExample.checkNumberIsPrime(testNumber2));
	  System.out.println("Is "+testNumber3+" a Prime Number ?? "+intPredicateExample.checkNumberIsPrime(testNumber3));
  }
  
  @Test
  public static void squareOfNumberTest() {
	
	  IntConsumerExample intConsumerExample = new IntConsumerExample();	
	  int testNumber1 = 10;
	  int testNumber2 = 15;
	  int testNumber3 = 22;
	  intConsumerExample.squareANumber(testNumber1);
	  intConsumerExample.squareANumber(testNumber2);
	  intConsumerExample.squareANumber(testNumber3);
  }
  
  @Test
  public static void getRandomNumberTest() {
	
	  IntSupplierExample intSupplierExample = new IntSupplierExample();	
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber()); 
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber());
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber()); 
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber());
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber()); 
	  System.out.println("Random Number generated is "+intSupplierExample.getRandomNumber());
	  
  }
 
}
