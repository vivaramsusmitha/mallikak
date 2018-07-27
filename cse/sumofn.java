/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int i=1,n,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(i <= n)
        {
        	sum += i;
        	i++;
        }
        System.out.println(sum);
	}
}
