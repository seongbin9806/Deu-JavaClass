package chap03;

public class geneCode78 {

	public static void main(String[] args) {
		
		char c = 'a';
		
		do {
			// 16진수로 변환
	        String hexValue = Integer.toHexString(c);
	        // 10진수로 변환
	        int decimalValue = (int) c;
	        
			System.out.println(c + " : " + hexValue + " " + decimalValue);
			
			c = (char)(c + 1);
		}while(c <= 'z');
	}

}
