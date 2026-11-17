import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {
    public static String gerarIniciais(String nomeCompleto) {
        String[] palavras = nomeCompleto.trim().split("\\s+");
        String iniciais = "";

        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                iniciais += palavras[i].substring(0, 1)
                        .toUpperCase(Locale.ROOT) + ".";
            }
        }

        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(
                    (i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")"
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
    }
}