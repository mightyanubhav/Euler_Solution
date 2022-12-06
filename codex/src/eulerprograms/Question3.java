package eulerprograms;

public class Question3{
	   static long maxPrimeFactors( long val){
	      long max_prime = -1;
	      while (val % 2 == 0) {
	         max_prime = 2;
	         val >>= 1;
	      }
	      for (int i = 3; i <= Math.sqrt(val); i += 2){
	         while (val % i == 0){
	            max_prime = i;
	            val = val / i;
	         }
	      }
	      if (val > 2)
	      max_prime = val;
	      return max_prime;
	   }
	   public static void main(String[] args){
	      long val = 148592;
	      System.out.println("The largest prime factor of 148592 is ");
	      System.out.println(maxPrimeFactors(val));
	      val = 600851475143L;
	      System.out.println("The largest prime factor of 600851475143 is ");
	      System.out.println(maxPrimeFactors(val));
	   }
	}