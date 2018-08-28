package assignment1;

import java.io.*;

public class assign1 
{
	public static int per (int total)
	{
		float p = (float)total;
		p = p *100 / 420;
		int sum = (int)p;
		float x = p - sum;
		if(x>=0.5)
		{
			return sum+1;
		}
		return sum;
	}
	
	public static String grade (int pr)
	{
		if(pr>=90)
			return "A";
		else if(pr>=78)
			return "B";
		else if(pr>=62)
			return "C";
		else if(pr>=46)
			return "D";
		else
			return "F";
	}
	
	public static void main (String arg[]) throws IOException
	{
		try
		{
			BufferedReader rd = new BufferedReader (new FileReader("C:\\Users\\Akhil\\Desktop\\java\\HW-1\\HW1-data.txt"));
			File out = new File("C:\\Users\\Akhil\\Desktop\\java\\HW1-output.txt");
			
			
			String s = null;
			while((s = rd.readLine())!=null)
			{
				String str[] = s.split("\\s+");
				
				int sum = 0;
				String so = str[0] + " " + str[1] + " ";
				for(int i=2; i<12; i++)
				{
					so = so + str[i] + " ";
					sum = sum + Integer.parseInt(str[i]);
				}
				so = so + sum + " " + str[12] + " " + str[13] + " " + str[14] + " ";
				sum = sum + Integer.parseInt(str[1]) + Integer.parseInt(str[12]) + Integer.parseInt(str[13]) + Integer.parseInt(str[14]);
				so = so + sum + " ";
				sum = sum - Integer.parseInt(str[14]);
				int pr = per(sum);
				so = so + pr + " ";
				String ch = grade(pr);
				so = so +ch;
				System.out.println(so);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
		}
		
	}
}
