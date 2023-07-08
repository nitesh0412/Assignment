package com.aurionpro.test;

public class Prime {

	public static void main(String args[]) {
		
		{
			int n = Integer.parseInt(args[0]);
			int f=0;
			for(int i=2;i<=n/2;i++)
			{
			if(n%i==0)
			{
			System.out.println("Number is not prime");
			f=1;
			break;
			}
			}
			if(f==0)
			{
			System.out.println("Number is prime");
					}
				}
			}
	}
/*
 13
 Number is prime

 */