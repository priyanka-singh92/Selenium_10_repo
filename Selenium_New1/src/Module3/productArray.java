package Module3;


class Product
{
	int pid;
	double price;
	
	Product(int pid,double price)
	{
		this.pid=pid;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return "[pid :"+pid+" , price:"+price+" ]";
		
	}
}

public class productArray {
	
public static void main(String[] args)
{
	Product[] arr=new Product[5];
	
	arr[0]= new Product(101,3500);
	arr[1]= new Product(102,4600);
	arr[2]= new Product(103,5200);
	arr[3]= new Product(104,1500);
	arr[4]= new Product(105,8900);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	

	
}

}
