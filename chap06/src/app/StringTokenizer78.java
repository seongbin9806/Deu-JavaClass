package app;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 덧셈식을 입력받음
        System.out.print("덧셈식을 입력하세요: ");
        String input = scanner.nextLine();

        // StringTokenizer를 사용하여 "+"를 기준으로 토큰화
        StringTokenizer tokenizer = new StringTokenizer(input, "+");

        int sum = 0;

        // 각 토큰을 정수로 변환하고 합산
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            int number = Integer.parseInt(token);
            sum += number;
        }

        // 결과 출력
        System.out.println("합은 " + sum);
    }
}
