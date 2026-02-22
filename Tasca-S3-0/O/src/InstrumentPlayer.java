public class InstrumentPlayer{
    private final PlayInstrument playInstrument;

    public InstrumentPlayer(PlayInstrument playInstrument) {
        this.playInstrument = playInstrument;
    }

    public void playInstrument() {
        this.playInstrument.play();
    }

    public static void main(String[] args) {
        InstrumentPlayer player = new InstrumentPlayer(new Guitar());
        player.playInstrument();
    }
}
