package chap01;
import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		// �����ʰ� ���� �� ���� a, b�� ���� �Է�, b-a�� ��� / b�� a���� ���� ��� ����
//		System.out.println("��� : " + minus());
		
		Scanner inp = new Scanner(System.in);
		System.out.print("��ǲ�� : ");
		int input = inp.nextInt();
		
		System.out.println("���� 2�� ������� : " + digits(input));
		
		
		
		
	}

	static int minus() {
		int result;
		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		
		int fir;
		int sec;
		
		System.out.print("a�� �� : ");
		fir = first.nextInt();
		do {
			System.out.print("b�� �� : ");
			sec = second.nextInt();
			if (fir>=sec) {
				System.out.println("a���� ū ���� �ν��Ͻÿ�");
			}
		} while (fir>=sec);
		
		result = sec - fir;
		
		return result;
		
	}
	
	static int digits(int input) {
		int result;
		int i = 0;
		do {
			input = input / 10;
			i++;
		}while(input>0);
		result = i;
		return result; 
	}
	
}
