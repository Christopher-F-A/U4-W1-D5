public class Video extends ElementoMultimediale implements Riproducibile {
    public int durata, volume, luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String str = titolo + " ";
            for (int v = 0; v < volume; v++) str += "!";
            for (int l = 0; l < luminosita; l++) str += " *";
            System.out.println(str);
        }
    }
}