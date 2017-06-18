package Zad3;

import java.util.List;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
