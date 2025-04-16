package Module3;

import java.io.File;
import java.io.IOException;

public class ToCreateFile {
	public static void main(String[] args)
	{
File ref=new File("/Users/Piku/Desktop/Manual");
	boolean flag=ref.exists();
	
	if(flag==true)
	{
		long count=ref.length();
		System.out.println("Count :"+count);
	}
	else
	{
		System.out.println("Not Found");
	}
}
}
