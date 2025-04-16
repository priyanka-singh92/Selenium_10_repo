package Module3;


class Student
{
	String name;
	double cgpa;
	int yop;
	
	Student(String name,double cgpa,int yop)
	{
		this.name=name;
		this.cgpa=cgpa;
		this.yop=yop;
	}
	
	@Override
	public String toString()
	{
		return "[name :"+name+" , cgpa:"+cgpa+" ,yop:"+yop+"]";
		
	}
}

public class studentArray {
	
public static void main(String[] args)
{
	Student[] arr=new Student[5];
	
	arr[0]= new Student("Raju",7.8,2020);
	arr[1]= new Student("Manju",8.8,2022);
	arr[2]= new Student("Sanju",5.2,2019);
	arr[3]= new Student("Ravi",8.0,2023);
	arr[4]= new Student("Mahi",9.2,2025);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
	



