package day5;

public class ForLoopDemo {

	public static void main(String[] args) {

		/*
		 * 1. for(int i=1; i<=10; i++) { System.out.println(i); }
		 */
		
		//2.
		
		/*
		 * for(int i=2; i<=10; i+=2) { System.out.println(i); }
		 */
		for(int i=10; i>=0; i--)
		{
			if(i%2==0)
			{
			System.out.println(i+"Even");
			}
		else
		{
			System.out.println(i+"Odd");
		}
		
		
	}

}}
