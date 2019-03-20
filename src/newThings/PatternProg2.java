package newThings;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PatternProg2 {
	
	/*
	
	
	*
	* * 
	* * * 
	* * * * 
	* * * * * 
	
	
	public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	*/
	
	
/*	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	
	public static void main(String args[]) {
		int row =5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}*/
	
	
/*Floyd's triangle
	1 
	2 3 
	4 5 6 
	7 8 9 10 */

	
	/*public static void main(String args[]) {
		int row=4; 
		int number =1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}*/
		
		/* pattern1
		*
		**
		***
		****
		*****

		public static void pattern1(int n)
		{
			for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println("\n");
			}
		}
		*/
		
		/*pattern2
		
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * */
	
	 public static void main( String[] args )
	    {
	    	 int n=5;
	    	 //pattern2(n);
	    	 for(int i=0;i<n;i++) {
				for (int j=n-i; j>1; j--) 
	            { 
	                System.out.print(" "); 
	            } 
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
	    	 }
	}
	
	
		/*public static void pattern2(int n)
		{
			for(int i=0;i<n;i++) {
				for (int j=n-i; j>1; j--) 
	            { 
	                System.out.print(" "); 
	            } 
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		*/
	 
	 @Test
	 public void softAssertionTest(){
	 
	 SoftAssert s = new SoftAssert();
	 s.fail();
	 
	 }
}