package commands;
import devices.Thermostat;

public class IncreaseTempCommand implements Command{
    private final Thermostat thermostat;
    private final int increment;

    public IncreaseTempCommand(Thermostat thermostat, int increment) {
        this.thermostat = thermostat;
        this.increment = increment;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(thermostat.getTemperature() + increment);
    }
}
