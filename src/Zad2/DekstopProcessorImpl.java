package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class DekstopProcessorImpl implements Processor {
    int price = 800;

    @Override
    public int getPrice() {

        return price;

    }

    @Override
    public void getProcessorInfo() {
        System.out.println("dodano DesktopProcessor");
    }
}
