public class PlayMusicCommand implements Command {
    private MusicPlayer player;

    public PlayMusicCommand(MusicPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.play();
    }

    public void undo() {
        player.stop();
    }
}
