package chap01;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = scn.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for (int i=1;i<n+1;i++) {
			sum1 += i;
		}
		
		System.out.println("n������ ��(for) : " + sum1);
		
		sum2 = Summethod(n); 
		
		System.out.println("n������ ��(Gaous) : " + sum2);
		
		sum3 = sumbetween(10, 20);
		
		System.out.println("n������ ��(Gaous) : " + sum3);
	}
	
	static int Summethod(int n) {
		int sum=0;
		
		sum = (1+n)*n/2;
		
		return sum;
	}
	
	static int sumbetween(int a, int b) {
		int sum = 0;
		if (a-b >= 0) sum = (a+b)*(a-b+1)/2;
		else
			sum = (a+b)*(b-a+1)/2;
		
		return sum;
	}
}
