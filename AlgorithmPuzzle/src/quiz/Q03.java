package quiz;

public class Q03 {
	public static void main(String[] args) {
		int N = 100;
		boolean[] card = new boolean[N]; 
		// �ʱⰪ: false
		// ī�尡 �ڸ� ���� ���� ��: False, ī�尡 ���� ���� ���� ��: true
		
		for(int i=2;i<=N;i++) 
			for(int j=i-1;j<N;j+=i) // 1~100�� �ƴ� 0~99�̹Ƿ�
				card[j] = !card[j];
		
		for(int i=0;i<N;i++)
			if(card[i] == false)
				System.out.println(i+1);
		// �������� �ִ� ī�� ��ȣ ���
	}
}
