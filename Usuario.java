import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Playlist> playlists;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.playlists = new ArrayList<>();
    }

    // Método para criar uma nova playlist
    public Playlist criarPlaylist(String nome) {
        Playlist playlist = new Playlist(nome);
        playlists.add(playlist);
        return playlist;
    }

    // Método para adicionar uma música a uma playlist específica
    public void adicionarMusicaPlaylist(Playlist playlist, Musica musica) {
        if (playlist != null) {
            playlist.adicionarMusica(musica);
        } else {
            System.out.println("Playlist não encontrada.");
        }
    }

    // Método para remover uma música de uma playlist específica
    public void removerMusicaPlaylist(Playlist playlist, Musica musica) {
        if (playlist != null) {
            playlist.removerMusica(musica);
        } else {
            System.out.println("Playlist não encontrada.");
        }
    }

    // Método para tocar todas as músicas de uma playlist
    public void tocarPlaylist(Playlist playlist) {
        if (playlist != null) {
            playlist.tocarTodasMusicas();
        } else {
            System.out.println("Playlist não encontrada.");
        }
    }

    // Método para listar as playlists do usuário
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
