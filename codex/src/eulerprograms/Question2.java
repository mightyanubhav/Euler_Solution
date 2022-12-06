package eulerprograms;

import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int n = in.nextInt();
        for(int i =0; i< n; i++){
        	System.out.println("Enter the number : ");
            long val = in.nextLong();
            System.out.println(getEvenFibsum(val));
        }
    }
    public static long getEvenFibsum(long n) {
        //System.out.println(n);
        long sumfib = 0L;
        long a = 0L, b= 1L;
        while (b < n){          
            if (b % 2 == 0){
                sumfib = sumfib + b;
                //System.out.println(b);
            }
            long temp = a + b;
            a = b;
            b = temp;
            
        }      
        return sumfib;
    }
}
