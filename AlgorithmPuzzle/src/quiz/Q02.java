package quiz;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Q02 {
	static String[] op = {"+", "-", "*", "/", ""};
	public static void main(String[] args) throws ScriptException {
		for(int i=1000;i<=9999;i++) 
			operation(i);
	}
	static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	static String eval(String s) throws ScriptException {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByName("js");
		return se.eval(s).toString();
	}
	static void operation(int n) throws ScriptException {
		String str = Integer.toString(n);
		for(int i=0;i<op.length;i++)
			for(int j=0;j<op.length;j++)
				for(int k=0;k<op.length;k++) {
					if(i!=4 && j!=4 && k!=4) // 연산자가 모두 없는 경우는 제외
						str = str.charAt(0) + op[i] + str.charAt(1) + op[j] + str.charAt(2) + op[k] + str.charAt(3);
					else continue;
					if(reverse(str) == eval(str)) {
						System.out.println(n);
						return;
					}
				}
		return;
	}
}
