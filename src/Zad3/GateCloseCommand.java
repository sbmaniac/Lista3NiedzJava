package Zad3;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class GateCloseCommand implements Command {
    Gate gate;

    public GateCloseCommand(Gate gate){
        this.gate = gate;
    }

    @Override
    public void execute() {
        gate.close();
    }

    @Override
    public void undo() {
        gate.open();
    }
}
