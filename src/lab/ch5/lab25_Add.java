package lab.ch5;

public class lab25_Add {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        lab25_Add a = new lab25_Add();
        String newSt = a.add("hello", "world");
        int sumInt = a.add(1,5);
        double sumDouble = a.add(1.2,3.7);
        System.out.println(newSt);
        System.out.println(sumInt);
        System.out.println(sumDouble);

    }
}
