package lecture.mid;

public class ContinueInWhile {
    public static void main(String[] args) {
        int i= 3;
        while(i<7){
            System.out.printf("if 전: i = %d\n", i);
            if(i<7){
                i+=2;
//                System.out.printf("continue 후 코드: i = %d\n", i);
                continue;
            }
            System.out.println("이건 출력되면 안됨!");
        }
        System.out.printf("i = %d, 이건 출력됨\n", i);
    }

}

