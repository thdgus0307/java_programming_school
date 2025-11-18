package lab.ch02;

public class lab06_Array67 {
    public static void main(String[] args) {
        Double[] arr1 = {1.1,2.3,4.7,7.5};
        for(int i =0; i< arr1.length; i++)
            System.out.print(arr1[i]+" ");

        System.out.println("\n-----------------------");
        Double[] arr2 = new Double[4];
        arr2[0] = 1.1;
        arr2[1]=2.3;
        arr2[2]=4.7;
        arr2[3]=7.5;
        for(int i =0; i< arr2.length; i++)
            System.out.print(arr2[i]+ " ");
    }
}
