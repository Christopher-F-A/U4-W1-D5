public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    public int durata;
    public int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    // volume
    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    // metodo play
    @Override
    public void play() {

        // ciclo durata
        for (int i = 0; i < durata; i++) {

            // ciclo annidato per volume
            String livelloVolume = "";
            for (int j = 0; j < volume; j++) {
                livelloVolume += "!";
            }

            System.out.println(this.titolo + " " + livelloVolume);
        }
    }
}