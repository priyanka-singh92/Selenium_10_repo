package Module3;

import java.io.File;
import java.io.IOException;

public class toDelete {
	public static void main(String[] args)
	{
File ref=new File("/Users/Piku/Desktop/Help/IO");
	boolean flag=ref.exists();
	{
		
	
	if(flag==true)
	{
		ref.delete();
		System.out.println("Deleted");
	}
	else
	{
		System.out.println("Not Found");
	}

}
}
}
