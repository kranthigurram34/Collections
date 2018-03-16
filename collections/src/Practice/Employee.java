package Practice;

public class Employee {
	private String firstname;
	private String lastname;
	private Long mobileno;
	private Integer age;
	private String accnttype;
	public Employee(String firstname, String lastname, Long mobileno, Integer age, String accnttype) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.age = age;
		this.accnttype = accnttype;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAccnttype() {
		return accnttype;
	}
	public void setAccnttype(String accnttype) {
		this.accnttype = accnttype;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", mobileno=" + mobileno + ", age=" + age
				+ ", accnttype=" + accnttype + "]";
	}
	

}
