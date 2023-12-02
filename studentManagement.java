import java.util.ArrayList;
import java.util.*;
class StudentManagement
{
	static ArrayList<Student> studentList = new ArrayList<Student>();
	public static boolean addNewStudent(Student student)
	{
		boolean found = false;
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getStuId() == student.getStuId())
			{
				found = true;
				break;
			}
		}
		if(found == false)
		{
			studentList.add(student);
			return true;
		}
		return false;
	}
	public static ArrayList<Student> getAllStudentsList()
	{
		return studentList;
	}
	public static Student searchStudentById(int id)
	{
		ArrayList<Student> li = getAllStudentsList();
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getStuId() == id)
			{
				return li.get(i);
			}
		}
		return null;
	}
	public static boolean deleteStudentById(int id)
	{
		ArrayList<Student> li = getAllStudentsList();
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getStuId() == id)
			{
				studentList.remove(li.get(i));
				return true;
			}
		}
		return false;
	}
	public static boolean updateStudentDetailsById(int id)
	{
		ArrayList<Student> li = getAllStudentsList();
		boolean found=false;
				
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getStuId() == id)
			{
				int choice;
				Scanner s=new Scanner(System.in);
				System.out.println("1. update id\n2. update  Name\n3. update course\n4. update coursefee\n\nEnter your choice:");
				choice=s.nextInt();
				switch(choice)
				{
					case 1:
						System.out.print("Enter new id :");
						li.get(i).setStuId(s.nextInt());
						found=true;
						break;
					case 2:
						System.out.print("Enter new name :");
						s.nextLine();
						li.get(i).setStuName(s.nextLine());
						found=true;
						break;
					case 3:
						System.out.print("Enter new course :");
						s.nextLine();
						li.get(i).setStuCourse(s.nextLine());
						found=true;
						break;
					case 4:
						System.out.print("Enter new course Fee :");
						li.get(i).setStuCourseFee(s.nextFloat());
						found=true;
						break;
						default:	
				}
			}
		}
		if(found == false)
		{
			return false;
		}
		else
		return true;
	}
}