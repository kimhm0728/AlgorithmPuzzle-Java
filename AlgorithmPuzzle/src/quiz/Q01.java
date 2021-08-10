package quiz;

public class Q01 {
	public static void main(String[] args) {
		int num = 11;
		while(true) {
			String numStr = Integer.toString(num);
			String numStr2 = Integer.toBinaryString(num);
			String numStr8 = Integer.toOctalString(num);
			if(numStr.equals(reverse(numStr)) && 
					numStr2.equals(reverse(numStr2)) && 
					numStr8.equals(reverse(numStr8))) {
				System.out.println(num);
				break;
			}

			num += 2;
		}
	}
	static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
}
