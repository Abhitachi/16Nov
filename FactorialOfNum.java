package tap.Geek;
import java.util.Scanner;
public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		do {
			System.out.println("Enter the number");
			int n=sc.nextInt();
			long fact=1;
			if(n==0) {
				System.out.println(fact);
			}
			else {
				do {
					 fact*= n;
						n--;
				} while(n>0);
				System.out.println(fact);
			}
			System.out.println("Do you wish to continue:");
			 s=sc.next();
		}while (s.equals("yes"));	
		//sc.close();
	}
}
