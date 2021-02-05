package chap01;
import java.util.Scanner;
public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int n;
		int sum = 0;
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}while(n <= 0);

		for (int i = 1;i<=n;i++) {
			sum += i;
		}
		System.out.println("합의 값 : " + sum);
	}

}
