package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SMS {

	public static void main(String[] args) {
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher(1, "T1", 500));
		teachers.add(new Teacher(2, "T2", 600));
		teachers.add(new Teacher(1, "T3", 700));
		
		
		Student hari = new Student(1, "Hari", 1);
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Student1", 1));
		students.add(new Student(2, "Student2", 3));
		students.add(new Student(3, "Student3", 2));
		
		
		School school = new School(teachers, students);
		hari.updateFees(5000);
		
		
		System.out.println("School earned is: " + school.getTotalMoneyPaid());
		
		
		
		
		
	}
}
