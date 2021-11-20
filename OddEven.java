package tap.Geek;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		OddOrEven(n);
	}
	
	static void OddOrEven(int a) {
		if(a%2==0) {
			System.out.println("Entered Number is Even");
		}
		else {
			System.out.println("Entered Number is Odd");
		}
	}

}
