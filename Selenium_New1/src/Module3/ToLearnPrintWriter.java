package Module3;

import java.io.BufferedWriter;
import java.io.PrintWriter;

import zmq.ZError.IOException;

public class ToLearnPrintWriter {
	public static void main(String[] args)
	{
		PrintWriter ref=null;
		
		try
		{
			ref=new PrintWriter("/Users/Piku/Desktop/Help/IO");
			ref.println("Qspiders");
			ref.println("Software Testing");
			ref.print("Jspiders");
			ref.println("Java Development");
			ref.println(65);
			ref.println(3.45);
			ref.println(false);
			ref.flush();
			System.out.println("Write Completed");
			
		}
       catch(IOException e)
		{
    	   e.printStackTrace();
		}
		finally
		{
			ref.close();
		}
}
}
