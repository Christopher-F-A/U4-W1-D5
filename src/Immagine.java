public class Immagine extends ElementoMultimediale {
    public int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        String str = titolo + " ";
        for (int l = 0; l < luminosita; l++) str += " *";
        System.out.println(str);
    }
}