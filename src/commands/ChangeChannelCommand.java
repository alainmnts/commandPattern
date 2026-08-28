package commands;
import devices.TV;

public class ChangeChannelCommand implements Command {
    private final TV tv;
    private final int newChannel;

    public ChangeChannelCommand(TV tv, int newChannel) {
        this.tv = tv;
        this.newChannel = newChannel;
    }

    @Override
    public void execute() {
        tv.setChannel(newChannel);
    }
    
}
