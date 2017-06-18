package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class LaptopProcessorImpl implements Processor {

    private int price = 950;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getProcessorInfo() {
        System.out.println("dodano lAPTOPProcessor");
    }
}
