package chap04;
import java.util.Scanner;

// 전화번호 정보를 담는 클래스
class Phone {
    private static int count = 0; // 객체 수를 세기 위한 static 필드
    private int pno;                // 객체 번호
    private String name;            // 이름
    private String phoneNumber;     // 전화번호

    // 생성자
    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        count++;                     // 객체가 생성될 때마다 count 증가
        this.pno = count;           // 현재 객체의 번호를 count 값으로 설정
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 번호와 전화번호 반환
    public String getDetails() {
        return "번호는 " + pno + "번이고 " + name + "의 번호는 " + phoneNumber + " 입니다.";
    }
}

// 전화번호 관리를 담당하는 클래스
public class PhoneManager78 {
    private Phone[] phoneList;     // Phone 객체를 저장할 배열
    private int count;             // 현재 저장된 전화번호 수

    // 생성자
    public PhoneManager78(int size) {
        phoneList = new Phone[size]; // 주어진 크기로 배열 초기화
        count = 0;                   // 현재 저장된 전화번호 수 초기화
    }

    // 전화번호 추가
    public void addPhone(String name, String phoneNumber) {
        if (count < phoneList.length) { // 배열 크기 체크
            phoneList[count] = new Phone(name, phoneNumber);
            count++;                    // 저장된 전화번호 수 증가
        } else {
            System.out.println("더 이상 전화번호를 추가할 수 없습니다.");
        }
    }

    // 이름으로 전화번호 검색
    public void searchByName(String searchName) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (phoneList[i].getName().equals(searchName)) {
                System.out.println(phoneList[i].getDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchName + "는 목록에 없습니다.");
        }
    }

    // main 메소드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>> ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        PhoneManager78 manager = new PhoneManager78(numberOfPeople); // 전화번호 관리 객체 생성

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            String phoneNumber = parts[1];

            // 전화번호 추가
            manager.addPhone(name, phoneNumber);
        }

        System.out.println("저장되었습니다...");
        
        // 이름 검색을 위한 반복문
        while (true) {
            System.out.print("검색할 이름 (종료하려면 'exit' 입력)>> ");
            String searchName = scanner.nextLine();
            if (searchName.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break; // "exit" 입력 시 반복문 종료
            }
            manager.searchByName(searchName);
        }

        scanner.close();
    }
}
