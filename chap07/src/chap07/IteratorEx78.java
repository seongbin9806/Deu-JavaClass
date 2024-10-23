package chap07;

import java.util.*;

public class IteratorEx78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();
		
		for(int num=200; num<=1000; num+=100) {
			v.add(num);
		}
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		
		System.out.println("벡터에 있는 수 합 : " + sum);
	}

}
