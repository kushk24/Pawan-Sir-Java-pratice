package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
	//int a[]=new int[5];
		
		/*
		 * a[0]=100; a[1]=200; a[2]=300; a[3]=400; a[4]=500;
		 */
		
		int a[]= {100,200,300,400,500};
		{
			System.out.println("Length of an array:"+a.length);
		}
       // System.out.println(a[4]); 
		
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]);
		 * 
		 * }
		 */
		// enhanced for loop /.. each loop
		   for(int x:a)
	       System.out.println(x);
	}}

        







