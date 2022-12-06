package eulerprograms;

import java.util.Scanner;
public class Question8 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter the string.");
		    String s = in.next();
		    
		    //taking the window accoridng to the question 13 , and iterating over it to get max.
		    final int window = 13;
		    long largestProduct = 0;

		    for (int i = 0; i < s.length() - window + 1; i ++)
		    {
		    	long product = 1;

			      for (int j = i; j < i + window; j++)
			      {
			        product *= Integer.parseInt(s.substring(j, j + 1));
			      }

			      if (product > largestProduct) largestProduct = product;
		    }
		    System.out.println(largestProduct);
	}

}
