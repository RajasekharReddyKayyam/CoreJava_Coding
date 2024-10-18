package CollectionsBasedProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
   System.out.println("Student project management");
   	List<Student> studentlist=new ArrayList<>();
   System.out.println("---------------------------------------------------------------");
   
   while(true){
	   
   
   
   System.out.println("please select the operation which you want to do");
   System.out.println("1.Add Student");
   System.out.println("2.update Student");
   System.out.println("3.display   Student");
   System.out.println("4.delete Student");
   System.out.println("5.to stop or exit from the program");
   Scanner sc = new Scanner(System.in);
  int option= sc.nextInt();
   
   switch(option) {
   case 1:
	   Student student=StudentUtilities.addstudent();
	   studentlist.add(student);
	   System.out.println("Student Succesfully Added");
	   break;
	   
   case 2:
	   
	   StudentUtilities.UpdateStudent(studentlist);
	   System.out.println("Student Updated Succesfully");
	   break;
   
	   
   case 3:
	   StudentUtilities.DisplayStudentDetails(studentlist);
	   break;
	   
	   
   case 4:
	   System.out.println("Delete Student is proceeded?");
	   System.out.println("Enter StudentID");
	   int sid=sc.nextInt();
	   StudentUtilities.deleteStudent(studentlist, sid);
	   System.out.println("Student Deleted Succesfully");
	   break;
   case 5:
	   System.exit(0);
	   break;
	   
	   default:
		   System.out.println("please choose any of the option ");
		   option= sc.nextInt();
	}
	   
	
	}

}
}