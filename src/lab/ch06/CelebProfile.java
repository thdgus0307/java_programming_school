package lab.ch06;

public class CelebProfile {
    int realAge;

    CelebProfile(int age) {
        realAge = age + 2;
    }

    int getAge() {
        return realAge - 2;
    }
}
