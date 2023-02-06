package model;

public class Student {
	private int admissionNo;
	private String studentName;
	private String email;
	private String schoolName;
	private String city;
	private double percentage;
	
	public int getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int admissionNo, String studentName, String email, String schoolName, String city,
			double percentage) {

		this.admissionNo = admissionNo;
		this.studentName = studentName;
		this.email = email;
		this.schoolName = schoolName;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "\n"+ admissionNo + " \t     "+ studentName +"          "+ email+"     " + schoolName + " \t      " + city + "         " + percentage;
	}
	public Student(int admissionNo, String schoolName, String city, double percentage) {
		
		this.admissionNo = admissionNo;
		this.schoolName = schoolName;
		this.city = city;
		this.percentage = percentage;
	}


	
}
