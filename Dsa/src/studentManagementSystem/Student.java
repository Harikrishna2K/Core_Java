package studentManagementSystem;

/***
 * 
 * @author haris
 *Here we are going to create the student class which contains variables such as 
 *student id
 *student name
 *fees paid
 *fees total
 *student grade
 *
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private static int feesPaid;
	private int studentGrade;
	private static int feesTotal;
	
	
	/***
	 * Let us create a constructor to pass the object
	 * which we are going to create 
	 */
	
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 300000;
	}
	
	/***
	 * Let us write the method to make sure the fees is updated and is paid fully
	 * 
	 * Here we have used the object from the school class we need to know the paid from the student
	 * using the object from school
	 * 
	 * The only way the school gets paid is by getting the students fees. So we have to update it
	 */
	public void updateFees(int fees) {
		feesPaid = feesPaid + fees;
		
		School.updateMoney(fees);
		
	}

	
	/***
	 * Let us create the setter and getters to the private variables
	 */
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	
	
	
	
	
	
}


