package quiz;

public class Q10 {
	static int[] uro = {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27,
			13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1,
			20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3,
			26};
	static int[] ame = {0, 28, 9, 26, 30, 11, 7, 20, 32, 17, 5, 22,
			34, 15, 3, 24, 36, 13, 1, 00, 27, 10, 25,
			29, 12, 8, 19, 31, 18, 6, 21, 33, 16, 4, 23,
			35, 14, 2};
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=2;i<=36;i++)
			if(sumMax(uro, i) < sumMax(ame, i))
				cnt++;
		System.out.println(cnt);
	}
	static int sumMax(int a[], int n) { // n개의 값 더하기
		int m = 0;
		for(int i=0;i<a.length;i++) {
			int tmp = sum(a, i, n);
			if(tmp > m)
				m = tmp;
		}
		return m;
	}
	static int sum(int a[], int n, int m) { // n부터 m개의 값 더하기
		int sum = 0;
		int loc = n;
		for(int i=0;i<m;i++) {
			loc += i;
			if(loc >= a.length) // 배열의 인덱스를 초과하면 맨 처음으로 돌아감
				loc = 0;
			sum+=a[loc];
		}
		return sum;
	}
}
