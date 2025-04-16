package Module3;

import java.io.FileReader;
import java.io.PrintWriter;

import zmq.ZError.IOException;

public class ToLearnFileReader {
	public static void main(String[] args)
	{
		FileReader ref=null;
		
		try
		{
			ref=new FileReader("/Users/Piku/Desktop/Help/IO");
			int val=ref.read();
			while(val!=-1)
			{
				System.out.print((char)val));
				val=ref.read();
			}
		}
        catch(IOException e)
		{
        	e.printStackTrace();
		}
		finally
		{
			try
			{
				ref.close();
				}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
}
}
