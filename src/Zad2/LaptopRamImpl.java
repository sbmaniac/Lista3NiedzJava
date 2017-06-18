package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class LaptopRamImpl implements Ram {
    private int price = 500;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getRamInfo() {
        System.out.println("dodano LaptopRamImpl");
    }
}
