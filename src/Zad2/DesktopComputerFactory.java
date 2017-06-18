package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class DesktopComputerFactory implements ComputerFactory {


    @Override
    public Processor addProcessor() {
        return new DekstopProcessorImpl();
    }

    @Override
    public GraphicCard addGraphicCard() {
        return new DesktopGraphicCardImpl();
    }

    @Override
    public Ram addRam() {
        return  new DesktopRamImpl();
    }
}
