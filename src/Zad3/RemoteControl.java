package Zad3;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offComands;

    public RemoteControl() {
        onCommands = new Command[5];
        offComands = new Command[5];

    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offComands[slot] = offCommand;
    }

    public void onButtonPushed( int slot){
        onCommands[slot].execute();
    }

    public void oofButtonPushed(int slot){
        offComands[slot].execute();
    }
}
