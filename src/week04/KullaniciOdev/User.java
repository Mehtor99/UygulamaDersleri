package week04.KullaniciOdev;

public class User {
	
	private int userCount = 0;
	private int id;
	private String name;
	private String surname;
	private String telNo;
	private String userName1;
	private String tcNumber1;
	private String email1;
	private String sifre;
	
	public User() {
		this.userCount++;
		this.id = userCount;
	}
	
	public String getSifre() {
		return sifre;
	}
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}
	
	public void setTcNumber1(String tcNumber1) {
		this.tcNumber1 = tcNumber1;
	}
	
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	//
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public String getUserName1() {
		return userName1;
	}
	
	public String getTcNumber1() {
		return tcNumber1;
	}
	
	public String getEmail1() {
		return email1;
	}
	
	public int getUserCount() {
		return userCount;
	}
	
	@Override
	public String toString() {
		return "User{" + "id=" + getId() + ", name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' + ", " +
				"telNo='" + getTelNo() + '\'' + ", userName1='" + getUserName1() + '\'' + ", tcNumber1='" + getTcNumber1() + '\'' + ", email1='" + getEmail1() + '\'' + ", sifre='" + getSifre() + '\'' + '}';
	}
}