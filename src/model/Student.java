package model;

public class Student {
	
	private String stuNo;//学号
	private String stuName;//姓名
	private String gender;//性别
	private int age;//年龄
	private String home;//家庭住址
	private String phoneNo;//电话号码
	
	public String getStuNo() {
		return stuNo;
	}
	
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHome() {
		return home;
	}
	
	public void setHome(String home) {
		this.home = home;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
