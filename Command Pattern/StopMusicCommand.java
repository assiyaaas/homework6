public class StopMusicCommand implements Command {
    private MusicPlayer player;

    public StopMusicCommand(MusicPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.stop();
    }

    public void undo() {
        player.play();
    }
}
