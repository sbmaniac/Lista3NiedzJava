package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class LaptopComputerFactory implements ComputerFactory {
    @Override
    public Processor addProcessor() {
        return new LaptopProcessorImpl();
    }

    @Override
    public GraphicCard addGraphicCard() {
        return new LaptopgraphicCardImpl();
    }

    @Override
    public Ram addRam() {
        return new LaptopRamImpl();
    }
}
