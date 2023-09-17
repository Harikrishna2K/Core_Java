package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	List<Teacher>teachers = new ArrayList<>();
	List<Student> students = new ArrayList<>();
	private static int totalMoneyPaid;
	private static int totalMoneySpent;
	
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyPaid = 0;
		this.totalMoneySpent = 0;
	}



	public List<Teacher> getTeachers() {
		return teachers;
	}



	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	public int getTotalMoneyPaid() {
		return totalMoneyPaid;
	}



	public void setTotalMoneyPaid(int totalMoneyPaid) {
		this.totalMoneyPaid = totalMoneyPaid;
	}



	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}



	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
	
	
	/**
	 * We need a method to add the teachers and add the students
	 */
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
		
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * We need a method to update the total money earned 
	 * so to update the total money we need to get the money first and then 
	 * add with the total money
	 */
	
	public static void updateMoney(int totalMoney) {
		totalMoneyPaid += totalMoney;
		
	}
	
	/**
	 * Now we have to create a method to c how much the money is spent
	 * so to calculate that we have to subtract from the moneypaid
	 */
	
	public void updateMoneySpent(int moneySpent) {
		totalMoneySpent -= moneySpent;
	}
	

}
