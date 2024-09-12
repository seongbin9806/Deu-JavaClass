package chap02;

public class NameHexa78 {

	public static void main(String[] args) {
		String name = "최성빈";
        
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            String hexCode = Integer.toHexString(character);
            System.out.printf("%s: %s%n", character, hexCode);
        }
	}

}
