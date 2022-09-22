package studio3;

import java.util.Scanner;

public class Seive {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);

		System.out.println("What is the max number?");
		int max = in.nextInt();
		
		boolean prime [] = new boolean[max];
	      
		for(int c= 0; c<max; c++)
		{
			prime[c] = true;
		}
		
		for(int i=2;i<max;i++)
		{
            
            if (prime[i]) 
            {
            	for (int j=0; i*i + j*i<max; j++)
            	{
            		prime[i*i+j*i] = false;
            	}
            }
            
		}
		
		for(int p=0;p<max;p++)
			if (prime[p])
		{
		System.out.println(p);	
		}
	}

}
