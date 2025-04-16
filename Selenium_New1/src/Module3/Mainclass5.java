package Module3;

import java.io.File;

public class Mainclass5 
{
	static void display(File ref)
	{

	boolean flag=ref.exists();
	{
		
	
	if(flag==true)
	{
String location=ref.getAbsolutePath();
		System.out.println(location);
	}

}
	public static void main(String[] args)
	{
	File f1=new File("/Users/Piku/Desktop/Help/IO");
	display(f1);
	}
	}
}
