package lecture.mid;

public class Cup1Cup2While {
    public static void main(String[] args) {
//        int Cup1 = 10;
        int Cup1 = 50;
        int Cup2 = 50;

//        while (Cup1 < Cup2){
//            Cup1 = Cup1 + 10;
//            System.out.println(Cup1);
//        }
        do {
            Cup1 +=10;
        }while(Cup1 < Cup2);
        System.out.println("Cup1= "+ Cup1);
        System.out.println("Cup2="+Cup2);
    }
}
