package chap07;

import java.util.Scanner;
import java.util.Vector;

public class HeightGrowth78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Vector<Integer> heights = new Vector<>();

        System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
        
        // 2000년부터 2009년까지의 키를 입력받아 벡터에 저장
        for (int year = 2000; year <= 2009; year++) {
            int height = scanner.nextInt();
            heights.add(height);
        }
        
        int maxGrowthYear = 2000;
        double maxGrowth = 0;

        // 가장 키가 많이 자란 연도 계산
        for (int i = 1; i < heights.size(); i++) {
            double growth = heights.get(i) - heights.get(i - 1);
            if (growth > maxGrowth) {
                maxGrowth = growth;
                maxGrowthYear = 2000 + i;
            }
        }

        System.out.printf("가장 키가 많이 자란 년도는 %d년 %.1fcm\n", maxGrowthYear, maxGrowth);
	}

}
