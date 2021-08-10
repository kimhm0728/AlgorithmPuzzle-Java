package quiz;

public class Q03 {
	public static void main(String[] args) {
		int N = 100;
		boolean[] card = new boolean[N]; 
		// 초기값: false
		// 카드가 뒤를 보고 있을 때: False, 카드가 앞을 보고 있을 때: true
		
		for(int i=2;i<=N;i++) 
			for(int j=i-1;j<N;j+=i) // 1~100이 아닌 0~99이므로
				card[j] = !card[j];
		
		for(int i=0;i<N;i++)
			if(card[i] == false)
				System.out.println(i+1);
		// 뒤집어져 있는 카드 번호 출력
	}
}
