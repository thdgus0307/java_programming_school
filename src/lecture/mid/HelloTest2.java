package lecture.mid;

class Hello2{

    String toWhom = "world";
    Hello2(){
    }
    Hello2(String whom){
        setWhom(whom);
    }
    void setWhom(String whom){
        toWhom = whom;
    }
    void sayHello(){
        System.out.println("hello "+toWhom);
    }

}
public class HelloTest2 {
    public static void main(String[] args) {
        Hello2[] helloArray = new Hello2[3];
        helloArray[0] = new Hello2();
        helloArray[1] = new Hello2("홍길동");
        helloArray[2] = new Hello2("허균");

        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();


    }
}
