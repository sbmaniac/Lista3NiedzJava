package Zad3;

/**
 * Created by sbmaniac on 18.06.2017.
 */
public class VolumeUpCommand implements Command {

    Volume volume;

    public VolumeUpCommand(Volume volume){
        this.volume = volume;
    }
    @Override
    public void execute() {
        volume.volumeUp();
    }

    @Override
    public void undo() {
        volume.volumeDown();
    }
}
