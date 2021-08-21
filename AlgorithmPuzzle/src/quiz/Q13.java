package quiz;

public class Q13 {
	static int cnt = 0;
	static int r, e, a, d, w, i, t, l, k, s;
	public static void main(String[] args) {
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		perm(num, 0, 10, 10); // 10���� �� �� 10�� �̱�
		System.out.println(cnt);
	}
	static void perm(int[] arr, int depth, int N, int R) {
		if(depth == R) { // R�� ��ŭ �̾Ҵٸ� ������� �����ϴ��� �Ǵ�
			verbal(arr);
		}
		for(int i=depth;i<N;i++) {
			swap(arr, depth, i);
			perm(arr, depth + 1, N, R);
			swap(arr, depth, i);
		}
	}
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	static void verbal(int[] arr) {
		r = arr[0];
		e = arr[1];
		a = arr[2];
		d = arr[3];
		w = arr[4];
		i = arr[5];
		t = arr[6];
		l = arr[7];
		k = arr[8];
		s = arr[9];
		
		if(r==0 || w==0 || t==0 || s==0) // �ֻ��� ���� 0�� �� �� �����Ƿ�
			return;
		int read = 1000*r + 100*e + 10*a + d;
		int write = w*10000 + r*1000 + i*100 + t*10 + e;
		int talk = t*1000 + a*100 + l*10 + k;
		int skill = s*10000 + k*1000 + i*100 + l*10 + l;
		if(read+write+talk == skill) 
			cnt++;
	}
}
