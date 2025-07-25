package Chap8;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, space, k=0;
		    for(i=1; i<=20; i++)
		    {
		        for(space=1; space<=(20-i); space++)
		            System.out.print(" ");
		        while(k!=(2*i-1))
		        {
		           System.out.print("X");
		            k++;
		        }
		        k=0;
		       System.out.println();
		    }
		 /*for(i=1; i<=6; i++)
		    {
		        for(k=6; k>i; k--)
		           System.out.print(" ");
		        for(j=0; j<i; j++)
		           System.out.print("X");
		      System.out.println();
		    }
		    System.out.println();*/
	}
	}

