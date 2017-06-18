package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class DesktopRamImpl implements Ram {
    private int price = 400;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getRamInfo() {
        System.out.println("dodano DesktopRAM");
    }
}
