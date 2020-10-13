package yaksha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Boyer Moore Algorithm Implementation");
		System.out.println("Enter Text :");
		String text = br.readLine();
		System.out.println("Enter Pattern :");
		String pattern = br.readLine();
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		int pos = BoyerMooreBO.findPattern(boyerMoore);
		if (pos == -1)
			System.out.println("No Match");
		else
			System.out.println("Pattern found at position : " + pos);
	}
}
