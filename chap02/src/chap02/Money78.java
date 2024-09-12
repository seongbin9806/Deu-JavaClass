package chap02;
import java.util.Scanner;

public class Money78 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("금액을 입력하세요: ");
        int amount = scanner.nextInt();
        
        int fiftyThousandWon = amount / 50000;
        amount %= 50000;
        
        int tenThousandWon = amount / 10000;
        amount %= 10000;
        
        int oneThousandWon = amount / 1000;
        amount %= 1000;
        
        int fiveHundredWon = amount / 500;
        amount %= 500;
        
        int oneHundredWon = amount / 100;
        amount %= 100;
        
        int tenWon = amount / 10;
        amount %= 10;
        
        int oneWon = amount;
        
        System.out.println("오만원권: " + fiftyThousandWon + "개");
        System.out.println("만원권: " + tenThousandWon + "개");
        System.out.println("천원권: " + oneThousandWon + "개");
        System.out.println("500원: " + fiveHundredWon + "개");
        System.out.println("100원: " + oneHundredWon + "개");
        System.out.println("10원: " + tenWon + "개");
        System.out.println("1원: " + oneWon + "개");
	}

}
