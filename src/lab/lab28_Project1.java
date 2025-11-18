package lab;

import java.util.Scanner;


public class lab28_Project1 {
    static int search(String str, String find){
        int count=0,i=0;

        while ((i=str.indexOf(find,i)) != -1){
            i += find.length();
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String state = " ";// null로 하면 equals를 실행이 안됨
        String str=null;
        System.out.println("=== 메뉴 ===\ni: 문자열 입력\no: 문자열 출력 (글자수, 단어수 포함)\ns: 문자열 찾기\nr: 문자열 바꾸기\nh: 도움말\ne: 종료");
        while(!state.equals("e") && !state.equals("E")){
            System.out.print("선택: ");
            state = scanner.nextLine();

            switch (state){
                case "I","i":
                    System.out.print("문자열을 입력하세요: ");
                    str = scanner.nextLine();
                    break;

                case "O","o":
                    int count;
                    int word;
                    String arr[] = str.split(" ");
                    count = str.length();
                    word = arr.length;
                    System.out.printf("글자수: %d\n단어수: %d\n", count, word);
                    break;
                case "S","s":
                    String find;
                    System.out.print("찾을 문자열을 입력하세요: ");
                    find = scanner.nextLine();
                    if(search(str,find) != 0 )
                        System.out.printf("\'%s\'가 %d회 존재합니다.\n", find, search(str, find));
                    else
                        System.out.println("문자열을 찾을 수 없습니다.");
                    break;

                case "R","r":
                    String change;
                    String newstr;
                    System.out.print("찾을 문자열을 입력하세요: ");
                    change = scanner.nextLine();
                    System.out.print("바꿀 문자열을 입력하세요: ");
                    newstr = scanner.nextLine();
                    System.out.println();

                    int start =0, end, counting=0; //replace 메소드 써도 됨!
                    while ((start = str.indexOf(change,start))!=-1){
                        counting++;
                        end = start+change.length();
                        String s1 = str.substring(0,start);
                        String s2 = str.substring(end);
                        str = s1 + newstr + s2;
                    }
                    System.out.println("변경된 문자열: "+ str);
                    System.out.printf("\'%s\'이/가 %d번 바뀌었습니다.",str, counting);
                    break;
                case "H","h":
                    System.out.println("=== 메뉴 ===\ni: 문자열 입력\no: 문자열 출력 (글자수, 단어수 포함)\ns: 문자열 찾기\nr: 문자열 바꾸기\nh: 도움말\ne: 종료");
                    break;

                case "e","E":
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");

            }
        }

    }
}
