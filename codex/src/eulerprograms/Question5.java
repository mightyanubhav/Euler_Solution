package eulerprograms;

public class Question5 {
	public static void main(String args[])
	{
		long lim = 20;
		long res = 1;
		for(int i = 2 ;i<=lim;i++)
		{
			res = getLCM(res,i);
		}
		System.out.println("The result is "+ res);
		
	}
	public static long getLCM(long res, int i)
	{
		long hcf = getHcf(res, i);
		long lcm = (res*i)/hcf;
		
		return lcm;
	}
	public static long getHcf(long res, int i)
	{
		long a = res;
		long b = i;
		
		// applying euclid algo.
		
		while(a!=b)
		{
			if(a>b)
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}
	
}
