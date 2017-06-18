package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class LaptopgraphicCardImpl implements GraphicCard {
    int price = 600;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getGraphicCardInfo() {
        System.out.println("dodano LaptopGraphicCard");
    }
}
