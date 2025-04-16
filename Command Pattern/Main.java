public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command tempUp = new ThermostatUpCommand(thermostat);
        Command tempDown = new ThermostatDownCommand(thermostat);
        Command playMusic = new PlayMusicCommand(musicPlayer);
        Command stopMusic = new StopMusicCommand(musicPlayer);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(tempUp);
        remote.pressButton();

        remote.setCommand(playMusic);
        remote.pressButton();

        remote.pressUndo();
        remote.pressUndo();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.pressUndo();
    }
}
