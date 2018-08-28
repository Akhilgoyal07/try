package lab1;

import java.io.*;

public class calculateGrade
{
	
	public static void main(String arg[]) throws IOException
	{
		try
		{
			FileReader input = new FileReader("C:\\Users\\Akhil\\Desktop\\lab\\sem 5\\java\\HW-1\\HW1-data.txt");   //Pointer to read input data file
			BufferedReader reader = new BufferedReader (input);
			
			FileWriter output = new FileWriter("C:\\Users\\Akhil\\Desktop\\lab\\sem 5\\java\\HW-1\\HW1-output-16103004.txt");
			PrintWriter writer = new PrintWriter(output);				//Pointer to write into output file
			
			writer.println("Stdnt Id  Ex  -------------- Assignments ------------  Tot  Mi  Fin  CL  Pts  Pct  Gr");      //print heading in output file                             
		    writer.println("--------  --  ---------------------------------------  ---  --  ---  --  ---  ---  --");
		    
		    
	       
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
