package Mappackageexp;

public class MapClass1 {
	private String fname;
	private String lname;
	private String sonof;
	private Integer age;
	public MapClass1(String fname, String lname, String sonof, Integer age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sonof = sonof;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSonof() {
		return sonof;
	}
	public void setSonof(String sonof) {
		this.sonof = sonof;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "MapClass1 [fname=" + fname + ", lname=" + lname + ", sonof=" + sonof + ", age=" + age + "]";
	}
	

}
