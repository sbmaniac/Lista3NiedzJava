package Zad3;

import Zad2.GraphicCard;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class GateOpenCommand implements Command{

    Gate gate;

    public GateOpenCommand(Gate gate){
        this.gate = gate;
    }

    @Override
    public void execute() {
        gate.open();
    }

    @Override
    public void undo() {
        gate.close();
    }
}
