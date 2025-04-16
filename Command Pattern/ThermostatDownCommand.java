public class ThermostatDownCommand implements Command {
    private Thermostat thermostat;

    public ThermostatDownCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.decreaseTemp();
    }

    public void undo() {
        thermostat.increaseTemp();
    }
}
