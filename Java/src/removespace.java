import java.util.*;
public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		
		String reverse="";
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(ch!=' ') {
				reverse+=ch;
			}
		}
		System.out.println(reverse);
	}

}
