package Module3;

import java.io.File;

public class ToLearnFileHandling 
{
	public static void main(String[] args)
	{
File ref=new File("/Users/Piku/Desktop/Help/");
	boolean flag=ref.exists();
	
	if(flag==false)
	{
		ref.mkdir();
		System.out.println("Folder Created");
		}
	else
	{
		System.out.println("Folder Exists");
	}
}
}
