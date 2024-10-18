package ArrayList;

public class User {
	
	public User(String name, String phoneno, Long salary) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		Salary = salary;
	}
	public User() {
		
	}
	private String name;
	@Override
	public String toString() {
		return "User [name=" + name + ", phoneno=" + phoneno + ", Salary=" + Salary + "]";
	}
	private String phoneno;
	private Long Salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Long getSalar() {
		return Salary;
	}
	public void setSalar(Long salar) {
		Salary = salar;
	}

}
