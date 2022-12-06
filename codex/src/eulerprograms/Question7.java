package eulerprograms;

public class Question7
{

		public static void main(String[] args)
		{
		       System.out.println(nthPrime(10001));
		}
	    
	   
	    public static long nthPrime(long n) 
	    {
	        int numberOfPrimes = 0;
	        long prime = 1;
	        
	        while (numberOfPrimes < n) {
	            prime++;
	            if (isPrime(prime)) {
	                numberOfPrimes++;
	            }
	        }
	        return prime;
	    }
	    	    
	    public static boolean isPrime(long n)
	    {
	        if(n == 1)
	        	return false;
	        if(n==2 || n == 3)
	        	return true;
	        if(n%2==0|| n%3 == 0)
	        	return false;
	        for(int i = 5;i*i<=n;i++)
	        {
	        	if(n % i == 0 || n % (i+2)==0)
	        		return false;
	        }
	        return true;
	    }

}
