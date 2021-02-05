package chap01;

public class Max3m {
	static int max3(int a, int b, int c) {
		int result = a;
		if (b > result) result = b;
		if (c > result) result = c;
		
		return result;
	}
	
	static public void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max3(4,8,1) = " + max3(4, 8, 1));
		System.out.println("max3(3,9,10) = " + max3(3, 9, 10));
		System.out.println("max3(3,5,-1) = " + max3(3, 5, -1));
		System.out.println("max3(2,4,21) = " + max3(2, 4, 21));
	}
}
