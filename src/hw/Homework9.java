package hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        try {
            Scanner fileScan = new Scanner(new File("db.txt"));

            while (fileScan.hasNext()) {
                String id = fileScan.next();
                String pw = fileScan.next();
                map.put(id, pw);
            }
            fileScan.close();

        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String inputId = sc.next().trim();

            if (!map.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String inputPw = sc.next().trim();

            if (!map.get(inputId).equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

        sc.close();
    }
}

