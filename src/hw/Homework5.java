package hw;

class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + this.cpu);
        System.out.println("Memory: " + this.memory);
        System.out.println("HDD: " + this.hdd);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + this.monitorSize);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        this.computer.turnOn();
        this.monitor.turnOn();
    }

    public void printInfo() {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");
        Monitor monitor = new Monitor("32인치", "검은색", "45W");

        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}
