package quiz;

public class Q06 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=2;i<=10000;i+=2) 
			if(isCollatz(i)) count++;
		System.out.println(count);
	}
	static boolean isCollatz(int n) {
		int a = n * 3 + 1;
		while(a != 1) {
			if(a % 2 == 0)
				a /= 2;
			else
				a = a * 3 + 1;
			if(a == n)
				return true;
		}
		return false;
	}
}
