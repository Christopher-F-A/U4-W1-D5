public class TestArray {
    public static void main(String[] args) {
        // array
        ElementoMultimediale[] playlist = new ElementoMultimediale[5];
        playlist[0] = new RegistrazioneAudio("Windowlicker • (Aphex Twin)", 5, 10);
        playlist[1] = new RegistrazioneAudio("Avril 14 • (Aphex Twin)", 3, 9);
        playlist[2] = new Immagine("Immagine", 8);
        playlist[3] = new Video("Coffee & cigarettes • (Jim Jarmusch)", 10, 5, 6);
        playlist[4] = new Video("Permanent Vacation • (Jim Jarmusch)", 9, 7, 6);

        // ciclo
        for (int i = 0; i < 5; i++) {
            System.out.println("\n media " + (i+1));
            if (playlist[i] instanceof Immagine) {
                ((Immagine) playlist[i]).show();
            } else {
                ((Riproducibile) playlist[i]).play();
            }
        }
    }
}