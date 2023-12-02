import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagementApplication
{
	public static void main(String[] args) 
	{
		int choice;
		int id;
		String name;
		String course;
		float fee;
		int num=0;
		boolean res;
		Scanner s = new Scanner(System.in);
		Student student = null;

		do
		{
			System.out.print("\n1. Enter new student details\n2. Display all students list\n3. Search student id\n4. Delete student id\n5. Update student details\n\nEnter your choice :");
			choice = s.nextInt();
			switch(choice)
			{
			   case 1:
			   	num = StudentManagement.getAllStudentsList().size()+1;
			   	System.out.print("Enter student-"+num+" id: ");
			   	id=s.nextInt();
			   	s.nextLine();
			   	System.out.print("Enter student-"+num+" name: ");
			   	name=s.nextLine();
			   	System.out.print("Enter student-"+num+" course: ");
			   	course=s.nextLine();
			   	System.out.print("Enter student-"+num+" courseFee: ");
			   	fee=s.nextFloat();
			   	student = new Student(id,name,course,fee);
			   	res = StudentManagement.addNewStudent(student);
			   	if(res == false)
			   	{
			   		System.out.println("\nStudent id already exist..!\n");
				}
				else
				{
					System.out.println("\nStudent details saved successfully..!\n");
				}
			   	break;
			  
			  case 2:
			  	ArrayList<Student> studentList = StudentManagement.getAllStudentsList();
			   	
			   	if(studentList.size() == 0)
			   	{
			   		System.out.println("\nDatabas is empty..!\n");
			   	}
			   	else
			   	{
			   		System.out.println("\nStudent list..!\n");
			   		for(int i=0;i<studentList.size();i++)
			   		{
			   			System.out.println(studentList.get(i));
			   		}
			   	}
			   	break;
			  case 3:

			  	if(StudentManagement.getAllStudentsList().size() == 0)
			  	{
			  		System.out.println("Database Empty So searching not possible...@\n");
			  	}
			  	else
			  	{
			  		System.out.print("\nEnter searching id :");
			  	 	id=s.nextInt();
			  		student = StudentManagement.searchStudentById(id);
			  		if(student == null)
			  		{
			  			
			  			System.out.println("\nStudent id "+id+" is not exist in studentList..!\n");
			  		}
			  		else
			  		{
			  			System.out.println("\nStudent detils given id for"+id+" - is"+student);
			  		}
			  	}
			  	break;

			  case 4:
			  	
			  	if(StudentManagement.getAllStudentsList().size() == 0)
			  	{
			  		System.out.println("Database Empty So Delete not possible...@\n");
			  	}
			  	else
			  	{
			  		System.out.print("\nEnter delete id :");
			  	 	id=s.nextInt();
			  		res = StudentManagement.deleteStudentById(id);
			  		if(res == false)
			  		{
			  			System.out.println("\nStudent id "+id+" is not exist in studentList so deletion is not possible..!\n");
			  		}
			  		else
			  		{
			  			System.out.println("\nStudent id "+id+" deletion successfully..!\n");
			  		}
			  	}
			  	break;

			  case 5:
			     if(StudentManagement.getAllStudentsList().size() == 0)
			     {
			     	System.out.println("\nDatabase is Empty so updation not possible...!\n");
			     }
			     else
			     {
			     	System.out.print("\nEnter updated id :");
			  	 	id=s.nextInt();
			  		res = StudentManagement.updateStudentDetailsById(id);
			  		if(res == false)
			  		{
			  			System.out.println("\nStudent id "+id+" is not exist in studentList..!\n");
			  		}
			  		else
			  		{
			  			System.out.println("Student id "+id+" Updated successfully..!\n");
			  		}
			     }
			     break;	
			   default:
			}			

		}
		while(choice>=1 && choice<=5);
	}
}