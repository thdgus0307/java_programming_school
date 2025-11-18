package lab.ch03;

class Hello09 {
    String toWhom = "world";
    Hello09() {
        System.out.println("기본 생성자가 호출됨");
    }
    Hello09(String toWhom){
        System.out.println("문자열 인자를 받는 생성자가 호출됨");
        this.toWhom = toWhom;
    }
    void setWhom(String toWhom){
        this.toWhom = toWhom;
    }
    void sayHello(){
        System.out.println("hello " + toWhom);
    }
}
public class lab09_HelloTest2 {
    public static void main(String[] args) {
//        Hello09 h1 = new Hello09();
//        h1.sayHello();
//        Hello09 h2 = new Hello09("kim");
//        h2.sayHello();
//        Hello09 h1 = new Hello09();
//        Hello09 h2 = new Hello09("홍길동");
//        Hello09 h3 = new Hello09("허균");
//
//        Hello09[] arr = {h1,h2,h3};
//        arr[0].sayHello();
//        arr[1].sayHello();
//        arr[2].sayHello();

        Hello09 arr[] = new Hello09[3];
        for(int i =0;i<3;i++)
            arr[i]= new Hello09();

        String whom[] = {"ycho","jsl","everyone"};
        int index = 0;
        for (Hello09 a : arr)
        {
            a.setWhom(whom[index]);
            index++;
        }

        for(Hello09 a : arr)
            a.sayHello();
    }
}
