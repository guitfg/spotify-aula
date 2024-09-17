import java.util.ArrayList;
import java.util.List;

// Classe Playlist
class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public void tocarMusica(int index) {
        if (index >= 0 && index < musicas.size()) {
            System.out.println("Tocando música: " + musicas.get(index).getTitulo());
        } else {
            System.out.println("Música não encontrada");
        }
    }

    public void tocarTodasMusicas() {
        for (Musica musica : musicas) {
            System.out.println("Tocando: " + musica.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
