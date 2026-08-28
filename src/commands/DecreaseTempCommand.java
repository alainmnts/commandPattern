package commands;
import devices.Thermostat;

public class DecreaseTempCommand implements Command{
    private final Thermostat thermostat;
    private final int decrement;

    public DecreaseTempCommand(Thermostat thermostat, int decrement) {
        this.thermostat = thermostat;
        this.decrement = decrement;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(thermostat.getTemperature() - decrement);
    }
}
