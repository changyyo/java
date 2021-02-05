package chap01;
import java.util.Scanner;
public class sumwhile {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("n의 값은 : ");	
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum += i;
			i++;
		}
		sum = 0;
		for (i=0;i<n+1;i++) {
			sum += i;

		}
		
		System.out.print("sum의 값은 : " + sum);
	}

}
