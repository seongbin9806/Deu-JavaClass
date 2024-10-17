package app;

import java.util.StringTokenizer;

public class StringTOkenizerEx78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();
		System.out.println("토큰 개수 = " + n);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
