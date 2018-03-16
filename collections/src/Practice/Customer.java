 package Practice;
public class Customer {
private Integer id,age;
private String fname,lname;

public Customer(Integer id, Integer age, String fname, String lname) {
	super();
	this.id = id;
	this.age = age;
	this.fname = fname;
	this.lname = lname;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
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

@Override
public String toString() {
	return "Customer [id=" + id + ", age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
}

}