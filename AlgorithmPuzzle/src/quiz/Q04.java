package quiz;

public class Q04 {
	public static void main(String[] args) {
		System.out.println(cutbar(20, 3));
		System.out.println(cutbar(100, 5));
	}
	static int cutbar(int n, int m) {
		int cnt = 0;
		int tmp = 1; // �� ���� �ڸ� �� �ִ� Ƚ��
		while(n > 1) {
			if(m<tmp) // �� ���� �ڸ� �� �ִ� Ƚ���� ��� ������ ũ�� ��� �� ��ŭ �ڸ�
				n-=m;
			else {
				n-=tmp;
				tmp*=2; // ������ �ڸ��Ƿ� �� ���� �ڸ� �� �ִ� Ƚ���� 2�辿 �þ
			}
			cnt++;
		}
		return cnt;
	}
}
