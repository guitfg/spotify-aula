import java.util.ArrayList;
import java.util.List;

// Classe Musica
class Musica {
    private String titulo;
    private String artista;
    private String album;
    private int duracao; // Em segundos

    public Musica(String titulo, String artista, String album, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Album: " + album);
        System.out.println("Duracao: " + duracao + " segundos");
    }

    public String getTitulo() {
        return titulo;
    }
}
