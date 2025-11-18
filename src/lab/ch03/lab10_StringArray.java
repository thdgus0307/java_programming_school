package lab.ch03;

public class lab10_StringArray {
    public static void main(String[] args) {
        String[] arr1 ={"Google Chrome", "Microsoft edge", "Mozilla Firefox", "Naver Whale"};
        String[] arr2 = new String[4];
        arr2[0]="Google Chrome";
        arr2[1]="Microsoft edge";
        arr2[2]="Mozilla Firefox";
        arr2[3]="Naver Whale";

        System.out.println("arr1 출력");
        for(int i =0; i< arr1.length;i++)
            System.out.println(arr1[i]+" "+arr1[i].length());

        System.out.println("arr2 출력");
        for(int i =0; i< arr2.length;i++)
            System.out.println(arr2[i]+" "+arr2[i].length());

    }
}
