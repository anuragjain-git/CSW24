import java.util.*;
public class countword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		char name;
		char ch;
		int count = 0;
		int x=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				while(i<str.length() && str.charAt(i)!=' ') {
					i++;
				}
			}
		}
		System.out.println(count);
	}

}
