package test;

class AirConditioner{
    String onandoff;
    String mode;
    int temp;
    int cur;
    int hope;

    AirConditioner(){
        onandoff = "꺼짐";
        System.out.println("* 상태: 꺼짐");
        mode = "난방모드";
        cur = 23;
        hope = 24;
    }

    void onOff(){
        if(onandoff.equals("꺼짐")) {
            onandoff = "켜짐";
            System.out.println("에어컨을 켭니다.");
            System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
        }
        else
        {
            onandoff = "꺼짐";
            System.out.println("에어컨을 끕니다.");
            System.out.println("* 상태: 꺼짐");

        }
    }
    void setCurrentTemperature(int temp){
        cur = temp;
        System.out.printf("현재 온도 %d도로 설정\n", temp);
        if(hope>cur) {
            mode = "난방모드";
            System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
        }
        else
        {
            mode = "냉방모드";
            System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
        }

    }
    void setTemperature(int temp){
        hope = temp;
        if(temp >=16&&temp<=30)
        {
            System.out.printf("목표 온도 %d도로 변경\n", temp);
            if(hope>cur) {
                mode = "난방모드";
                System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
            }
            else
            {
                mode = "냉방모드";
                System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
            }
        }

        else
        {
            System.out.printf("목표 온도(%d)가 범위(16~30도)를 벗어나 기본값(20도) 유지\n", temp);
            System.out.printf("* 상태: %s / %s / 현재 온도 %d도 / 목표 온도 %d도\n", onandoff, mode, cur, hope);
        }


    }

}
public class Midterm2 {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.onOff();
        ac.setCurrentTemperature(25);
        ac.setTemperature(22);
        ac.setCurrentTemperature(20);
        ac.setTemperature(20);
        ac.setTemperature(35);
        ac.onOff();
    }
}
