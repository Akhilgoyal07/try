package lab1;

public class student 
{
	String studentId;						 //studentid 
	int ex;			                         //Lab Exercise (Total :200Marks)
	int[] assignment=new int[10];            //Array For Assignment marks 
	int total;								//Total marks of Assignment 
	int mi;									//Mid term marks
	int fin;								//Final exam Marks
	int cl;									//Code lab Marks
	int pts;								//Total Points Scored
	int pct;								//Total point percentage (Max marks:420)
	char gr;								//Grade
	
	public void calculatePercent()			//Function to calculate total point percentage
	{
		float per = (float)pts;
		per = per*100/420;
		int intper = (int)per;
		float fraction = per-intper;		//round off 
		if(fraction >=0.5)					//if fraction part is greater than 0.5 
		{
			intper = intper+1;				//than increase by 1
		}
		pct = intper;						//return value of percentage
	}
	
	public void calculateGrade()
	{
		if(pct>=90)
		{
			gr = 'A';
		}
		else if(pct>=78)
		{
			gr = 'B';
		}
		else if(pct>=62)
		{
			gr = 'C';
		}
		else if(pct>=46)
		{
			gr = 'D';
		}
		else
		{
			gr = 'F';
		}
	}
}
