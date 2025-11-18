package lab.ch5;

public class lab26_TestRecursiveSum {
    long sum(int n){
        if(n==1){return 1;}
        else {return n+ sum(n-1);}
    }

    public static void main(String[] args) {
        lab26_TestRecursiveSum sum = new lab26_TestRecursiveSum();
        System.out.println(sum.sum(100));

    }
}
