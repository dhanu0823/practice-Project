package main;

import java.util.List;
import java.util.Scanner;

import dao.StudentDAOlmpl;
import model.Student;

public class ClientTest {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

StudentDAOlmpl dao=new StudentDAOlmpl();
		
System.out.println("Welcome to Student Management Application");
System.out.println("=============================================");

while(true)
{
	
	System.out.println("\n1.Add Student \n2.Show All Students  \n3.Delete Student"
			+ " \n4.Update Student\n5.Get Particular student record by id \n6. Exit");
System.out.println("Enter choice");
int ch = sc.nextInt();

switch (ch) 
{

case 1:

	
		System.out.println("Add Student");
		
		System.out.println("Enter admissionNo ");
		int admissionNo=sc.nextInt();
		
		System.out.println("Enter student name");
		String studentName = sc.next();
		
		System.out.println("Enter emailid ");
		String email = sc.next();
		
		System.out.println("Enter student school name");
		String schoolName= sc.next();
		
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter Percentage");
		double percentage= sc.nextDouble();
		
		Student student = new Student(admissionNo,  studentName, email,schoolName, city,percentage);
		
		
		dao.createStudent(student);
		
		break;
case 2:
		
		System.out.println("Show all Student Details ");
		List<Student>studentList= dao.getAllStudentsInfo();

System.out.println("admissionNo   studentName    email              schoolName       city         percentage");
System.out.println("============================================================================");
		for (Student stuList : studentList) {
			System.out.println(stuList);
		}
		break;
		
case 3:
	System.out.println("Enter existing Admission Number for delete record :");
	int admNo=sc.nextInt();
	dao.deleteStudentById(admNo);
	break;


case 4:

		System.out.println("Enter existing admissionNo ");
		 admissionNo=sc.nextInt();
		
		
		System.out.println("Enter new school name for modify ");
		 schoolName= sc.next();
		
		System.out.println("Enter new city for modify ");
		 city = sc.next();
		System.out.println("Enter new Percentage for modify ");
		 percentage= sc.nextDouble();
		

		 Student s=new Student(admissionNo,schoolName,city,percentage);
		 
		 	dao.updateStudent(s,admissionNo);

		
		break;
case 5: 
	System.out.println("Enter existing admissionNo ");
	 admissionNo=sc.nextInt();
	 student= dao.getStudentById(admissionNo);

	 System.out.println("admissionNo   studentName    email              schoolName       city         percentage");
	 System.out.println("=========================================================================================");
	 		System.out.println(student);
	 		break;
	 
case 6:
	System.out.println("Thank You for using Student management application!!");
    System.exit(0);

default:
    	System.out.println("Please Enter valid choice...");

}
}
	}

}
