package Module3;

class Employee
{
	String role;
	int eid;
	double ctc;
	
	
	Employee(String role,int eid,double ctc)
	{
		this.role=role;
		this.eid=eid;
		this.ctc=ctc;
	}
	
	@Override
	public String toString()
	{
		return "Employee [role :"+role+" , eid:"+eid+" ,ctc:"+ctc+"]";
		
	}
}

public class employeeArray {
	
public static void main(String[] args)
{
	Employee[] arr=new Employee[5];
	
	arr[0]= new Employee("QA",3745,4.5);
	arr[1]= new Employee("Dev",4005,4.5);
	arr[2]= new Employee("Manager",2013,9.5);
	arr[3]= new Employee("Dev",2972,7.4);
	arr[4]= new Employee("TL",3015,8.4);
	
	Employee e=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].ctc>e.ctc)
		{
			e=arr[i];
	}
   }
		System.out.println("Role : "+e.role+" eid : "+e.eid+" ctc : "+e.ctc+" );
	}
}


