import java.util.Scanner;

public class Atividade8 {
    public static String maiorPalavra(String[] palavras) {
        String maior = "";

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }

        return maior;
    }

    public static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase com as palavras separadas por um espaço: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");

        exibirPalavras(palavras);

        System.out.println("Total de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maiorPalavra(palavras));
    }
}