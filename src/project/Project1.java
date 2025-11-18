package project;
import java.util.Scanner;


public class Project1 {
    public static void main(String[] args) {
        String sentence = null;
        Scanner scanner = new Scanner(System.in);
        String state= null;
        System.out.println("=== 메뉴 ===\ni: 문자열 입력\no: 문자열 출력 (글자수, 단어수 포함)\ns: 문자열 찾기\nr: 문자열 바꾸기\nh: 도움말\ne: 종료");
        // 문자열은 ==,!= 연산자는 주소값을 비교함!! 까먹지 말자!!
        while(!"e".equals(state) && !"E".equals(state)){
            System.out.print("선택: ");
            state = scanner.nextLine();
            switch (state)
            {
                case "i", "I":
                    System.out.print("문자열을 입력하세요: ");
                    sentence = scanner.nextLine();
                    break;

                case "o","O":
                    String[] arr = sentence.split(" ");
                    int count1 = sentence.length(); // 글자수
                    int count2 = arr.length; // 단어수

                    System.out.println("현재 문자열:"+sentence);
                    System.out.println("글자 수: "+count1);
                    System.out.println("단어 수: "+count2);
                    break;

                case "s","S":
                    String find;
                    int i=0;
                    int count = 0;
                    System.out.print("찾을 문자열을 입력하세요:");
                    find = scanner.nextLine();
                    while((i = sentence.indexOf(find,i)) !=-1){
                        count++;
                        i = i+find.length();
                    }
                    if(count==0)
                        System.out.println("문자열을 찾을 수 없습니다.");
                    else
                        System.out.println("\'"+find+"\'이\\가 "+count+"회 존재합니다.");
                    break;

                case "r","R":
                    String sen, change;
                    System.out.print("찾을 문자열을 입력하세요:");
                    sen=scanner.nextLine();
                    System.out.print("바꿀 문자열을 입력하세요:");
                    change = scanner.nextLine();
                    int start=0, counting=0, end;
                    while((start = sentence.indexOf(sen,start)) !=-1){
                        counting++;
                        String s1 = sentence.substring(0,start);
                        end = start+sen.length();
                        String s2 = sentence.substring(end);
                        start = start+sen.length();
                        sentence = s1 + change + s2;
                    }
                    if(counting==0)
                        System.out.println("문자열을 찾을 수 없습니다.");
                    else
                        System.out.println("변경된 문자열:"+sentence);
                        System.out.println("\'"+sen+"\'이\\가 "+counting+"회 바뀌었습니다.");
                    break;
                case "h","H":
                    System.out.println("=== 메뉴 ===\ni: 문자열 입력\no: 문자열 출력 (글자수, 단어수 포함)\ns: 문자열 찾기\nr: 문자열 바꾸기\nh: 도움말\ne: 종료");
                    break;
                case "e","E":
                    System.out.println("프로그램을 종료합니다.");
                    break;
                    // return; //리턴으로 프로그램을 끝내도됨.
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
    }
}
