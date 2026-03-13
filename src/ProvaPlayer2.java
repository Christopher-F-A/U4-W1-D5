public class ProvaPlayer2 {
    public static void main(String[] args) {

        // audio
        RegistrazioneAudio audio = new RegistrazioneAudio("Windowlicker • (Aphex Twin)", 3, 10);
        System.out.println("\nCANZONE");
        audio.play();

        // video
        Video video = new Video("Coffee & cigarettes • (Jim Jarmusch)", 10, 5, 6);
        System.out.println("\nFILM");
        video.play();

        // immagine
        Immagine foto = new Immagine("Immagine", 8);
        System.out.println("\nFOTO");
        foto.show();
    }
}