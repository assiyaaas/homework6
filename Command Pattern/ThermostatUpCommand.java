public class ThermostatUpCommand implements Command {
    private Thermostat thermostat;

    public ThermostatUpCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.increaseTemp();
    }

    public void undo() {
        thermostat.decreaseTemp();
    }
}
