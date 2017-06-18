package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public interface ComputerFactory {
    public Processor addProcessor();

    public GraphicCard addGraphicCard();

    public Ram addRam();
}
