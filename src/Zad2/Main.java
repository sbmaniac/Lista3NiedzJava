package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class Main{

    public static void main(String[] args) {
        Computer computer;

        computer = new Computer(new DesktopComputerFactory());
        computer = new Computer(new LaptopComputerFactory());
    }
}
