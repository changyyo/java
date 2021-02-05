package chap01;
import java.util.Scanner;
public class median {
	public static void main(String[] args) {
		
		System.out.println("중앙값은 " + med3(3, 2, 1) + "입니다.");
		System.out.println("중앙값은 " + med3(3, 2, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(3, 1, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(3, 3, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(2, 1, 3) + "입니다.");
		System.out.println("중앙값은 " + med3(3, 3, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(3, 3, 3) + "입니다.");
		System.out.println("중앙값은 " + med3(2, 2, 3) + "입니다.");
		System.out.println("중앙값은 " + med3(2, 3, 1) + "입니다.");
		System.out.println("중앙값은 " + med3(2, 3, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(1, 3, 2) + "입니다.");
		System.out.println("중앙값은 " + med3(2, 3, 3) + "입니다.");
		System.out.println("중앙값은 " + med3(1, 2, 3) + "입니다.");
		
		
		
			
	}
	static int med3(int a, int b, int c) {
		int med;
		if (a >= b) 
			
			if (b >= c) med = b; 
			
				else if (a >= c) med = c;
				
			else med = a;
		
		
		else if(b >= c) med = b;
			
		else if (a >= c) med = c;
				
		else med = b;
		
		return med;
	}
		
}
