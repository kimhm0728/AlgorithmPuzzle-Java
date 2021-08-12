package quiz;

public class Q04 {
	public static void main(String[] args) {
		System.out.println(cutbar(20, 3));
		System.out.println(cutbar(100, 5));
	}
	static int cutbar(int n, int m) {
		int cnt = 0;
		int tmp = 1; // 한 번에 자를 수 있는 횟수
		while(n > 1) {
			if(m<tmp) // 한 번에 자를 수 있는 횟수가 사람 수보다 크면 사람 수 만큼 자름
				n-=m;
			else {
				n-=tmp;
				tmp*=2; // 반으로 자르므로 한 번에 자를 수 있는 횟수가 2배씩 늘어남
			}
			cnt++;
		}
		return cnt;
	}
}
