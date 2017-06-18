package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class DesktopGraphicCardImpl implements GraphicCard {

    private int price =1500;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void getGraphicCardInfo() {
        System.out.println("dodano DesktopGraphicCardImpl");
    }
}
