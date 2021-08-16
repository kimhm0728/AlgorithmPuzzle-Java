package quiz;

public class Q11 {
	static int[] fib = new int[10000];
	public static void main(String[] args) {
		int cnt = 0;
		int n = 13; // 144가 fib[12]이므로 그 후부터 탐색
		while(cnt != 5) {
			int num = fib(n);
			int sum = 0;
			String str = Integer.toString(num);
			for(int i=0;i<str.length();i++) 
				sum += str.charAt(i) - '0';
			if(num % sum == 0) {
				System.out.println(num);
				cnt++;
			}
			n++;
		}
	}
	static int fib(int n) {
		if(fib[n] != 0)
			return fib[n];
		if(n == 0)
			return fib[0] = 0;
		if(n == 1)
			return fib[1] = 1;
		else 
			return fib[n] = fib(n-1) + fib(n-2);
	}
}
