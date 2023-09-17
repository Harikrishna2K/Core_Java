package libraryManagementSystem;

public class Member {

	String name;
	int age;
	int memberId;
	
	
	
	
	public Member(String name, int age, int memberId) {
		super();
		this.name = name;
		this.age = age;
		this.memberId = memberId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public void add(Member members) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
