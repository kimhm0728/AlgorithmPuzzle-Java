package quiz;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q12 {
	static int[] num = new int[10];
	public static void main(String[] args) {
		int n = 2;
		StringTokenizer st;
		int cnt = 0;
		while(cnt != 2) {
			Arrays.fill(num, 0);
			double sqrt = Math.sqrt(n);
			st = new StringTokenizer(Double.toString(sqrt), ".");
			String str;
			if(cnt == 0) // ���� �κ� + �Ҽ� �κ�
				str = st.nextToken() + st.nextToken(); 
			else { // �Ҽ� �κ�
				st.nextToken();
				str = st.nextToken();
			}
			if(str.length() >= 10) 
				for(int i=0;i<10;i++)
					num[str.charAt(i) - '0'] = 1;
			else {
				// str�� ���̰� 10�� ���� �ʴ� ��� 0~9�� ��� ������ �� ����
				n++;
				continue;
			}
			if(allContains()) { // 0~9�� ��� �����Ѵٸ� ȭ�鿡 ���
				System.out.println(n);
				cnt++;
				n = 1;
			}
			n++;
		}
	}
	static boolean allContains() {
		for(int i=0;i<10;i++)
			if(num[i] == 0)
				return false;
		return true;
	}
}
