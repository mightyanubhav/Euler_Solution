package eulerprograms;

public class Question6 
{
	public static void main (String[] args) 
	{
        
        int sumSquares = 0, sum = 0, difference = 0;
                
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
            sumSquares += (int)Math.pow(i, 2);
        }
                
        difference = (int)Math.pow(sum, 2) - sumSquares;
        System.out.println(difference);
    }
}
