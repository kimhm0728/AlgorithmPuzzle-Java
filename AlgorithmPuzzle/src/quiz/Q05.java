package quiz;

public class Q05 {
	public static void main(String[] args) {
		int cash = 1000;
		int count = 0;
		for(int i=0;i<=2;i++) // 500
			for(int j=0;j<=10;j++) // 100
				for(int k=0;k<=15;k++) // 50
					for(int l=0;l<=15;l++) // 10
						if(i + j + k + l <= 15)
							if(i*500 + j*100 + k*50 + l*10 == cash)
								count++;
		System.out.println(count);
	}

}
