package Module3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ToLearnBufferedReader {
	public static void main(String[] args)
	{
		BufferedReader ref=null;
		
		try
		{
     ref=new BufferedReader(new FileReader("/Users/Piku/Desktop/Help/IO"));
     String val=ref.readLine();
     
     while(val!=null)
    	 System.out.println(val);
     val=ref.readLine();
		}
	}
	catch(IOException e)
	{
		
	}
