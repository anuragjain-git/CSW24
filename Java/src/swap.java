import java.util.*;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
