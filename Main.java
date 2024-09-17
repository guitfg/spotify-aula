import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando um usuário
        Usuario usuario = new Usuario("João", "joao@email.com", "12345");
        Playlist playlist = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar uma playlist");
            System.out.println("2. Adicionar musica a playlist");
            System.out.println("3. Remover musica da playlist");
            System.out.println("4. Tocar uma musica especifica");
            System.out.println("5. Tocar todas as musicas da playlist");
            System.out.println("6. Exibir informacoes de uma musica");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da playlist: ");
                    String nomePlaylist = scanner.nextLine();
                    playlist = usuario.criarPlaylist(nomePlaylist);
                    System.out.println("Playlist '" + nomePlaylist + "' criada");
                    break;

                case 2:
                    if (playlist == null) {
                        System.out.println("Por favor, crie uma playlist primeiro.");
                        break;
                    }
                    System.out.print("Digite o titulo da musica: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Digite o album: ");
                    String album = scanner.nextLine();
                    System.out.print("Digite a duracao da musica (em segundos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine(); // Consumir o newline
                    Musica musica = new Musica(titulo, artista, album, duracao);
                    usuario.adicionarMusicaPlaylist(playlist, musica);
                    System.out.println("Musica adicionada a playlist");
                    break;

                case 3:
                    if (playlist == null) {
                        System.out.println("Por favor, crie uma playlist primeiro.");
                        break;
                    }
                    System.out.print("Digite o titulo da musica a ser removida: ");
                    String tituloRemover = scanner.nextLine();
                    Musica musicaRemover = null;
                    for (Musica m : playlist.getMusicas()) {
                        if (m.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            musicaRemover = m;
                            break;
                        }
                    }
                    if (musicaRemover != null) {
                        usuario.removerMusicaPlaylist(playlist, musicaRemover);
                        System.out.println("Musica removida da playlist");
                    } else {
                        System.out.println("Musica nao encontrada.");
                    }
                    break;

                case 4:
                    if (playlist == null) {
                        System.out.println("Por favor, crie uma playlist primeiro.");
                        break;
                    }
                    System.out.print("Digite o indice da musica a ser tocada: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Consumir o newline
                    playlist.tocarMusica(indice);
                    break;

                case 5:
                    if (playlist == null) {
                        System.out.println("Por favor, crie uma playlist primeiro.");
                        break;
                    }
                    usuario.tocarPlaylist(playlist);
                    break;

                case 6:
                    if (playlist == null) {
                        System.out.println("Por favor, crie uma playlist primeiro.");
                        break;
                    }
                    System.out.print("Digite o titulo da musica para exibir informacoes: ");
                    String tituloInfo = scanner.nextLine();
                    Musica musicaInfo = null;
                    for (Musica m : playlist.getMusicas()) {
                        if (m.getTitulo().equalsIgnoreCase(tituloInfo)) {
                            musicaInfo = m;
                            break;
                        }
                    }
                    if (musicaInfo != null) {
                        musicaInfo.exibirInfo();
                    } else {
                        System.out.println("Musica nao encontrada.");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}
