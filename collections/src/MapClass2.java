package Mappackageexp;

public class MapClass2 {
private String company;
private String address;
private Long contactno;
private String gender;
public MapClass2(String company, String address, Long contactno, String gender) {
	super();
	this.company = company;
	this.address = address;
	this.contactno = contactno;
	this.gender = gender;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getContactno() {
	return contactno;
}
public void setContactno(Long contactno) {
	this.contactno = contactno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "MapClass2 [company=" + company + ", address=" + address + ", contactno=" + contactno + ", gender=" + gender
			+ "]";
}


}
