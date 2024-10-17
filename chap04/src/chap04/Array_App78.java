package chap04;

class ArrayPassing {
	static void replaceSpace(char a[]) {
		for(int i=0; i< a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}

public class Array_App78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
		
		ArrayPassing.printCharArray(c);
		ArrayPassing.replaceSpace(c);
		ArrayPassing.printCharArray(c);
	}

}
