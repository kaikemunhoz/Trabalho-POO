import java.util.ArrayList;
import java.util.Scanner;

public class CRUDJogos {

    private static ArrayList<Jogo> jogos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu CRUD de Jogos ===");
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Atualizar jogo");
            System.out.println("4 - Excluir jogo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarJogo(scanner);
                    break;
                case 2:
                    listarJogos();
                    break;
                case 3:
                    atualizarJogo(scanner);
                    break;
                case 4:
                    excluirJogo(scanner);
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // Método para cadastrar jogo
    private static void cadastrarJogo(Scanner scanner) {
        System.out.print("Digite o ID do jogo: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (buscarPorId(id) != null) {
            System.out.println("Já existe um jogo com esse ID.");
            return;
        }

        System.out.print("Digite o nome do jogo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o gênero do jogo: ");
        String genero = scanner.nextLine();

        System.out.print("Digite a plataforma do jogo: ");
        String plataforma = scanner.nextLine();

        Jogo novo = new Jogo(id, nome, genero, plataforma);
        jogos.add(novo);
        System.out.println("Jogo cadastrado com sucesso!");
    }

    // Listar todos os jogos
    private static void listarJogos() {
        if (jogos.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
        } else {
            for (Jogo j : jogos) {
                System.out.println(j);
            }
        }
    }

    // Atualizar um jogo
    private static void atualizarJogo(Scanner scanner) {
        System.out.print("Digite o ID do jogo a atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Jogo j = buscarPorId(id);
        if (j != null) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();

            System.out.print("Novo gênero: ");
            String novoGenero = scanner.nextLine();

            System.out.print("Nova plataforma: ");
            String novaPlataforma = scanner.nextLine();

            j.setNome(novoNome);
            j.setGenero(novoGenero);
            j.setPlataforma(novaPlataforma);

            System.out.println("Jogo atualizado com sucesso!");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    // Excluir um jogo
    private static void excluirJogo(Scanner scanner) {
        System.out.print("Digite o ID do jogo a excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Jogo j = buscarPorId(id);
        if (j != null) {
            jogos.remove(j);
            System.out.println("Jogo excluído com sucesso!");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    // Buscar um jogo pelo ID
    private static Jogo buscarPorId(int id) {
        for (Jogo j : jogos) {
            if (j.getId() == id) {
                return j;
            }
        }
        return null;
    }
}