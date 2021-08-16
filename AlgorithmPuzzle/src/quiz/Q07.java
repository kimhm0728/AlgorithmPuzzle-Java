package quiz;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Q07 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		StringBuilder sd = new StringBuilder();
		cal.set(1964, Calendar.OCTOBER, 10);
		String until = "20200724";
		String next = df.format(cal.getTime());
		while(!until.equals(next)) {
			int date = Integer.parseInt(next); // ��¥�� int������ ��ȯ
			String binary = Integer.toBinaryString(date); // 10������ ��¥�� 2������ ��ȯ
			if(binary.equals(reverse(binary)))
				System.out.println(date);
			cal.add(Calendar.DATE, 1);
			next = df.format(cal.getTime());
		}
	}
	static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
}