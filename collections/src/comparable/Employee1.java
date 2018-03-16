package comparable;

public class Employee1 implements Comparable {
private Integer id;
private String name;
private Integer salary;
private String address;
public Employee1(Integer id, String name, Integer salary, String address) {
	super();
	this.id = id;
	this.name = name;
	this.salary =salary;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}
public int compareTo(Object o) {
	Employee1 em=(Employee1) o;
	if(this.name.equals(em.getName())) {
	int idCompare=this.id.compareTo(em.getId());
	return idCompare ;}
	int salaryCompare=this.id.compareTo(em.getSalary());
	return salaryCompare ;
	
}
}