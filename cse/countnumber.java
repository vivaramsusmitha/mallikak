/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		while(i!=0)
		{
			i=i/10;
			++count;
		}
		System.out.println(count);
	}
}
