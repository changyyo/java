package chap01;
import java.util.Scanner;
public class Digits {
	
	static public void main(String[] args) {
		Scanner strIn = new Scanner(System.in);
		int n;
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		System.out.print("�Է°� : ");
		do {
			n = strIn.nextInt();
			
		} while(n<10 || n>99); //��� ���� -> ���� ������ ���� (��𸣰��� ��Ģ)
		
		System.out.println("�Է°� : " + n);
	}
}
