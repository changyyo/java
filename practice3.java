package chap01;
import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		// 오른쪽과 같이 두 변수 a, b에 정수 입력, b-a를 출력 / b가 a보다 작을 경우 오류
//		System.out.println("결과 : " + minus());
		
		Scanner inp = new Scanner(System.in);
		System.out.print("인풋값 : ");
		int input = inp.nextInt();
		
		System.out.println("연습 2의 결과값은 : " + digits(input));
		
		
		
		
	}

	static int minus() {
		int result;
		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		
		int fir;
		int sec;
		
		System.out.print("a의 값 : ");
		fir = first.nextInt();
		do {
			System.out.print("b의 값 : ");
			sec = second.nextInt();
			if (fir>=sec) {
				System.out.println("a보다 큰 값을 인식하시오");
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
