import java.util.*;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		
		String reverse="";
		char ch;
		
		for(int i=str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			reverse+=ch;
		}
		
		if(str.equals(reverse)) {
			System.out.println(str+" is Palindrom");
		}
		else
			System.out.println(str+" is not Palindrom.");
	}

}
