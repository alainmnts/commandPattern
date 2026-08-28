package commands;
import devices.TV;

public class TVOnCommand implements Command {
    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
