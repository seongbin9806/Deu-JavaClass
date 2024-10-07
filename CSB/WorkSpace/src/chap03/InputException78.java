package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException78 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int maxIntVal = 3;
		
		System.out.println("정수 3개를 입력하세요");
		
		for(int i=0; i<maxIntVal; i++){
			int n =0;
			System.out.print(i + ">>");
			
			try {
				n = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.다시 입력하세요!");
				scanner.next();
				i--;
				continue;
			}
			
			sum += n;
		}
		
		System.out.println("합은 " + sum);
		scanner.close();
	}

}
