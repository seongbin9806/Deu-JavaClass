package chap03;

import java.util.Scanner;

public class foreach78 {

	public static void main(String[] args) {
		int index = 0;
		int intArr[] = new int[5];
		String fruitArr[] = new String[6];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요.");
		for(int intVal : intArr) {			
			intArr[index] = scanner.nextInt();
			index++;
		}
		
		System.out.print("당신이 입력한 숫자는 : ");		
		for(int intVal : intArr) {
			System.out.print(intVal + " ");
		}
		
		System.out.println();
		System.out.println("6개의 과일명을 입력하세요.");
		index = 0;
		for(String fruit : fruitArr) {
			fruitArr[index] = scanner.next();
			index++;
		}
		
		System.out.print("당신이 입력한 과일명 : ");
		
		for(String fruit : fruitArr) {
			System.out.print(fruit + " ");
		}
	}
}
