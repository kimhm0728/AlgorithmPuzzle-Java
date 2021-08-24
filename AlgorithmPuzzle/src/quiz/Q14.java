package quiz;
import java.util.Arrays;

public class Q14 {
	static String[] country = {"Brazil", "Croatia", "Mexico", "Cameroon", "Spain", "Netherlands", 
			"Chile", "Australia", "Colombia", "Greece", "Cote d'lvoire", "Japan", "Uruguay",
			"Costa Rica", "England", "Italy", "Switzerland", "Ecuador", "France", "Honduras", 
			"Argentina", "Bosnia and Herzegovina", "Iran", "Nigeria", "Germany", "Portugal", 
			"Ghana", "USA", "Belgium", "Algeria", "Russia", "Korea Republic"};
	static int[] visited = new int[country.length];
	static int max = 0;
	public static void main(String[] args) {
		for(int i=31;i>=0;i--) {
			DFS(i, 1);
			Arrays.fill(visited, 0);
		}
		System.out.println(max);
	}
	static void DFS(int start, int s) {
		visited[start] = 1;
		for(int i=0;i<country.length;i++) {
			if(start != i && visited[i] == 0) {
				char last = Character.toUpperCase(country[start].charAt(country[start].length() - 1));
				char first = Character.toUpperCase(country[i].charAt(0));
				if(last == first) {
					visited[i] = 1;
					DFS(i, s + 1);
					visited[i] = 0;
				}
			}
		}
		if(max < s) 
			max = s;
	}
}
