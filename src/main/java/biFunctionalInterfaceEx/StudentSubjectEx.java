package biFunctionalInterfaceEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;


public class StudentSubjectEx {

	public static String checkStudentSubjectCondition(HashMap<String, String> mapOfStudents, String student, List<String> Subjects) {
					
		BiFunction<String, List<String>, String > condition = (student1, Subjects1) -> {
			String subjectOfStudent = mapOfStudents.get(student1);
			
			if(Subjects1.contains(subjectOfStudent)) {
				return student1+" has opted for "+subjectOfStudent+"in the given subjects list";
			}
			else
				return student1+" has not opted for this "+subjectOfStudent;
			
			
		};
		return condition.apply(student, Subjects);
		
		
		

	}

}
