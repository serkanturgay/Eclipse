package sprint4_University;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student();
		Course course1 = new Course();
		Professor professor1 = new Professor();
		Department department1 = new Department();
		Date date1 = new Date(0, 0, 0); //Bu tarih olayina tekrar bak. nasil calistigini anlamadim
		
		student1.no = "2070";
		student1.name = "Serkan";
		student1.dob = "1999";
		student1.coursesTaken = new Course[8];
		student1.coursesTaken[0] = course1;
		student1.advisor = professor1;
		student1.department = department1;
		
		
		course1.code = "EHM1455";
		course1.name = "FPGA";
		course1.teacher = professor1; 
		course1.department = department1;
		course1.time = date1;
		course1.days = new String[2];
		course1.days[0] = "Monday";
		course1.days[1] = "Friday";
		course1.students = new Student[96];
		
		
		professor1.no = "25";
		professor1.name = "Umut Engin Ayten";
		professor1.dob = "1988";
		professor1.rank = "assoc. prof. dr.";
		professor1.department = department1;
		professor1.coursegivens = new Course[3];
		professor1.coursegivens[0] = course1;
		professor1.advisee = new Student[50];
		professor1.advisee[0] = student1;
		
		department1.name = "ECE";
		department1.head = professor1;
		department1.students = new Student[810];
		department1.students[0] = student1;
		
		System.out.println(student1.coursesTaken[0].department.head.name);
		System.out.println(course1.time);
		
	}

}
