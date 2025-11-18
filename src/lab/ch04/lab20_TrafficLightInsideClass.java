package lab.ch04;

public class lab20_TrafficLightInsideClass {

    enum TrafficLight {
        RED(30, "Red"), GREEN(30, "Green"), AMBER(10,"amber");

        int time;
        String light;
        TrafficLight(int time, String light){
            this.time = time;
            this.light = light;
        }
        int getTime(){return time;}
        String getLight(){return light;}
    }

    public static void main(String[] args) {
        for(TrafficLight t : TrafficLight.values()){
            System.out.println("Time: "+ t.time+" light: "+t.light);
        }
    }
}
