package newThings;

//Addition of numbers present in a string.

public class AdditionOfNumbersPresentInString {
	
	public static void main(String args[]) {
	
	String s1="abc123xyz";
	String s2="73dkklsp895";
	String s3="06vvfd7klsp800";
	
	int sum1=0;
	int sum2=0;
	int sum3=0;
	
	for(int i=0;i<s1.length();i++) {
		if(Character.isDigit(s1.charAt(i))) {
			sum1=sum1+Integer.parseInt(s1.charAt(i)+"");
		}
	}
	
	System.out.println("sum of numbers present in s1 is: "+sum1);
	
	for(int j=0;j<s2.length();j++) {
		if(Character.isDigit(s2.charAt(j))) {
			sum2=sum2+Integer.parseInt(s2.charAt(j)+"");
		}
	}
	
	System.out.println("sum of numbers present in s2 is: "+sum2);
	
	for(int k=0;k<s3.length();k++) {
		if(Character.isDigit(s3.charAt(k))) {
			sum3=sum3+Integer.parseInt(s3.charAt(k)+"");
		}
	}
	
	System.out.println("sum of numbers present in s3 is: "+sum3);
	
	}
}