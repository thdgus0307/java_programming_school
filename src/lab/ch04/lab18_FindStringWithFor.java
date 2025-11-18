package lab.ch04;

public class lab18_FindStringWithFor {
    public static void main(String[] args) {
        String arr[] = {"New York", "Beijing", "Seoul"};
        int index = 0;
        int check =  0;

        for(String a : arr){
            if(a.equals("Seoul"))
            {
                System.out.println(index+" "+a);
                check = 1;
                break;
            }
            index++;
        }
        if(check != 1)
            System.out.println("해당 문자열을 찾을 수 없습니다.");

    }
}
