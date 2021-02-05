package chap01;

public class practice {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		return min;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max4(10, -2, 0, 5) = " + max4(10, -2, 0, 5));
		System.out.println("min3(10, -2, -4) = " + min3(10, -2, -4));
		System.out.println("min4(10, -2, 0, 5) = " + min4(10, -2, 0, 5));
		
		
	}

}
