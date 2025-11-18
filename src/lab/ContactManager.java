package lab;

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {return name; }
    public String getPhoneNumber() {return phoneNumber; }
    void displayContact(){
        System.out.printf("이름: %s, 전화번호: %s\n", getName(),getPhoneNumber());
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Contact[] contact = new Contact[100]; // 크기를 100으로 지정해두면 빈거라도 길이가 100임!
        int contactCount =0;
        Scanner scanner = new Scanner(System.in);
        String state= " ";

        System.out.println("=== 메뉴 ===\na: 추가\ns: 검색\nd: 전체보기\ne: 종료");
        while(!state.equals("e")&&!state.equals("E")){ //or말고 and 쓰기!! 둘다 해당 안되어야하니까!
            System.out.print("선택: ");
            state = scanner.nextLine();
            switch (state) {
                case "a", "A":
                    System.out.print("저장할 이름과 전화번호를 입력하시오(enter로 이름과 전화번호를 나뉘어주세요): ");
                    Contact contact1 = new Contact(scanner.nextLine(), scanner.nextLine()); // next는 버퍼에 스페이스 남겨두고 감
                    if (contactCount < 100) {
                        contact[contactCount] = contact1;
                        contactCount++;
                    } else
                        System.out.println("연락처 공간이 가득 찼습니다.");
                    break;
                case "s", "S":
                    String search;
                    Boolean check = true;
                    System.out.print("검색할 이름을 입력하시오:");
                    search = scanner.nextLine();
                    for (int i = 0; i < contactCount; i++)
                        if (contact[i].getName().equals(search)) {
                            contact[i].displayContact();
                            check = false;
                        }

                    if (check)
                        System.out.println("검색된 연락처가 없습니다.");

                    break;

                case "d", "D":
                    if (contactCount >= 1) {
                        for (int i = 0; i < contactCount; i++)
                            contact[i].displayContact();
                    } else
                        System.out.println("저장된 연락처가 없습니다.");
                    break;

                case "e", "E":
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
                    break;
            }



        }
    }
}
