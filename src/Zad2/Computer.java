package Zad2;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class Computer {

    private int finalPrice = 0;
    private Processor processor;
    private GraphicCard graphicCard;
    private Ram ram;

    public Computer(ComputerFactory computerFactory){
        processor = computerFactory.addProcessor();
        graphicCard = computerFactory.addGraphicCard();
        ram = computerFactory.addRam();

        getBundleInfo();
    }

    private void getBundleInfo() {
        System.out.println("składanie Komputera Rozpoczęte");
        processor.getProcessorInfo();
        graphicCard.getGraphicCardInfo();
        ram.getRamInfo();

        finalPrice = processor.getPrice()+graphicCard.getPrice()+ram.getPrice();

        System.out.println("Cena zestawu = " + finalPrice+"\n");
    }
}
