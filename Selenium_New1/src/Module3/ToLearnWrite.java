package Module3;

import java.io.File;
import java.io.FileWriter;

import zmq.ZError.IOException;

public class ToLearnWrite {
	public static void main(String[] args)
	{
		FileWriter ref=null;
		
		try
		{
          ref=new FileWriter("/Users/Piku/Desktop/Help/IO",true);
          ref.write("Java");
          ref.write("\n");
          ref.write("SQL");
          ref.write("\n");
          ref.write(65);
          ref.write("\n");
          char[] ch= {'T','e','s','t','i','n','g'};
          ref.write(ch);
          
          ref.flush();
          System.out.println("Write Completed");
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
