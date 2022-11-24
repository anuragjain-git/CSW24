import java.util.*;
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		
		String reverse="";
		String name="";
		char ch;
		
		for(int i=0; i<str.length()-1; i--) {
			ch = str.charAt(i);
			name=ch+name;
		}
		System.out.println(reverse);
	}

}
