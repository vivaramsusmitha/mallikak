/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,k,e=1;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		k=s.nextInt(); 
		long result =1;
		while(k!=0)
		{
			result=result*k;
			--k;
		}
		System.out.println(result);

	}
}
