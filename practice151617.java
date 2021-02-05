package chap01;
import java.util.Scanner;
public class practice151617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		spira(5);
		
			
	}	
	
//	static void triangleLB(int n) {
//		for (int i = 1;i<=n;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//	
//	static void triangleLU(int n) {
//		for (int i=n;i>=1;i--) {
//			for (int j=i;j>=1;j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//	
//	static void triangleRU(int n) {
//		for (int i=1;i<=n+1;i++) {
//			for (int k=1;k<=i;k++) {
//				System.out.print(' ');
//			}
//			for (int j=1;j<=n+1-i;j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//	
//	static void triangleRB(int n) {
//		for (int i=1;i<=n;i++) {
//			for (int k=1;k<=n-i;k++) {
//				System.out.print(' ');
//			}
//			for (int j=1;j<=i;j++) {
//				System.out.print('*');
//			}
//			
//
//			System.out.println();
//		}
	
//	}
	
	static void spira(int n) {
		for (int i = 1;i<=n;i++) {
			for (int j=n-i;j>=1;j--) {
				System.out.print(' ');
			}
		
			for (int k = 1;k<=(i-1)*2+1;k++) {
				System.out.print("*");
			}
//			for (int j=n-i;j>=1;j--) {
//				System.out.print(' ');
//			}
			System.out.println();
		}	
	}
	
//	static void spira(int n) {
//		for (int i = 1;i<=n;i++) {
//			for (int j=n-i;j>=1;j--) {
//				System.out.print(' ');
//			}
//		
//			for (int k = 1;k<=2*i-1;k++) {
//				System.out.printf("%d", i % 10);
//			}
//			for (int j=n-i;j>=1;j--) {
//				System.out.print(' ');
//			}
//			System.out.println();
//		}	
//	}
}
