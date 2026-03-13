public class ProvaPlayer {
    public static void main(String[] args) {
        RegistrazioneAudio mioAudio = new RegistrazioneAudio("Windowlicker • Aphex Twin", 3, 2);

        System.out.println("\n VOLUME DEFAULT");
        mioAudio.play();

        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        mioAudio.alzaVolume();
        System.out.println("\n VOLUME +");
        mioAudio.play();

        mioAudio.abbassaVolume();
        mioAudio.abbassaVolume();
        mioAudio.abbassaVolume();
        mioAudio.abbassaVolume();
        mioAudio.abbassaVolume();
        System.out.println("\n VOLUME -");
        mioAudio.play();
    }
}
