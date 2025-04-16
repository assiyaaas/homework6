public class Thermostat {
    private int temperature = 20;

    public void increaseTemp() {
        temperature++;
        System.out.println("Thermostat increased to " + temperature + "°C");
    }

    public void decreaseTemp() {
        temperature--;
        System.out.println("Thermostat decreased to " + temperature + "°C");
    }
}
