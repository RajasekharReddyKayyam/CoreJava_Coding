package CollectionsBasedProject;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtilities {
	
	
	//1.Add Student
	public static Student addstudent() {
		Scanner sc = new Scanner(System.in);
		Student s= new Student();
		
		System.out.println("please enter  student ID");
		s.setSid(sc.nextInt());
		System.out.println("please enter the  Student name");
		s.setSname(sc.next());
		System.out.println("please enter student age");
		s.setSage(sc.nextInt());
		
		
		return s;
	}
	
	
	
	//2.update Student
	
	public static void UpdateStudent(List<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter updated details ");
		System.out.println("please enter Sid");
		int id=sc.nextInt();
		System.out.println("please enter Sname");
		String name =sc.next();
		System.out.println("please enter Sage");
		int  age =sc.nextInt();
		int count=0;
		for (Student s:students) {
			if (id==s.getSid())
			{
				break;
			}
			count++;
		}
		students.get(count).setSname(name);
		students.get(count).setSage(age);
		
	}
	
	//3.Display Student
	
	public static void DisplayStudentDetails(List<Student> students) {
		Iterator<Student> itr = students.iterator();
		
	while(itr.hasNext()) {
		System.out.println(itr.next().toString());
	}
	}
	
	
	
	
	//4.Delete Student
	public static void deleteStudent(List<Student> students, int Sid ) {
		Iterator <Student> Studentiterator =students.iterator();
		while(Studentiterator.hasNext()) {
			Student s=Studentiterator.next();
			if(Sid==s.getSid()) {
				Studentiterator.remove();
				
			}
		}
		
		
	}
	
	

}
