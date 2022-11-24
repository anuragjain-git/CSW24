import java.util.*;
public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num  = sc.nextInt();
		
		System.out.print("Enter a number to get it's frequency: ");
		int freq  = sc.nextInt();
		
		int x;
		int count =0;
		
		while(num!=0) {
			x=num%10;
			if(x==freq) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
