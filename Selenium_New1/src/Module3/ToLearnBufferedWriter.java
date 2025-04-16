package Module3;

import java.io.BufferedWriter;
import java.io.FileWriter;

import zmq.ZError.IOException;

public class ToLearnBufferedWriter {
	public static void main(String[] args)
	{
		BufferedWriter ref=null;
		
		try
		{
          ref=new BufferedWriter(new FileWriter("/Users/Piku/Desktop/Help/IO"));
          ref.write("Java");
          ref.newLine();
          ref.write("SQL");
          ref.newLine();
          ref.write(65);
          ref.newLine();
          char[] ch= {'T','e','s','t','i','n','g'};
          ref.write(ch);
          
          ref.flush();
          System.out.println("Write Completed");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

}

