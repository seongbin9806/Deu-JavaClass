package chap03;

import java.util.Scanner;

public class average78 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double sum = 0; 
		int sum2 = 0, count = 0, n = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while((n = scanner.nextInt()) != 0) {
			sum += n;
			
			if(n > 0) {
				sum2 += n;
			}
			count++;
		}
		
		System.out.println("모든 수 평균은 " + sum/count + "입니다.");
		System.out.println("양수의 합은 " + sum2 + "입니다.");
	}

}
