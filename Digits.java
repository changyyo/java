package chap01;
import java.util.Scanner;
public class Digits {
	
	static public void main(String[] args) {
		Scanner strIn = new Scanner(System.in);
		int n;
		System.out.println("2자리의 정수를 입력하세요.");
		System.out.print("입력값 : ");
		do {
			n = strIn.nextInt();
			
		} while(n<10 || n>99); //계속 조건 -> 종료 조건의 부정 (드모르간의 법칙)
		
		System.out.println("입력값 : " + n);
	}
}
