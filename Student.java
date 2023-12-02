class Student
{
	private int stuId;
	private String stuName;
	private String stuCourse;
	private float stuCourseFee;
	public void setStuId(int stuId)
	{
		this.stuId=stuId;
	}
	public int getStuId()
	{
		return stuId;
	}
	public void setStuName(String stuName)
	{
		this.stuName=stuName;
	}
	public String getStuName()
	{
		return stuName;
	}
	public void setStuCourse(String stuCourse)
	{
		this.stuCourse=stuCourse;
	}
	public String getStuCourse()
	{
		return stuCourse;
	}
	public void setStuCourseFee(float stuCourseFee)
	{
		this.stuCourseFee=stuCourseFee;
	}
	public float getStuCourseFee()
	{
		return stuCourseFee;
	}
	Student(int stuId,String stuName,String stuCourse,float stuCourseFee)
	{
		this.stuId=stuId;
		this.stuName=stuName;
		this.stuCourse=stuCourse;
		this.stuCourseFee=stuCourseFee;
	}
	public String toString()
	{
		return stuId+" , "+stuName+" , "+stuCourse+" , "+stuCourseFee;
	}
}