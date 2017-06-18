package Zad3;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class VolumeDownCommand implements Command {
    Volume volume;

    public VolumeDownCommand(Volume volume){
        this.volume = volume;
    }
    @Override
    public void execute() {
        volume.volumeDown();
    }

    @Override
    public void undo() {
        volume.volumeUp();
    }
}
