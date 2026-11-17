import java.util.Scanner;

public class Atividade6 {
    public static int contarVogais(String texto) {
        String vogais = "aeiouáàâãäéèêëíìîïóòôõöúùûü";
        texto = texto.toLowerCase(java.util.Locale.ROOT);
        int quantidade = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) >= 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        int maiorQuantidade = -1;
        int indiceMaior = 0;

        for (int i = 0; i < frases.length; i++) {
            int quantidade = contarVogais(frases[i]);

            System.out.println(
                    frases[i] + " - Quantidade de vogais: " + quantidade
            );

            if (quantidade > maiorQuantidade) {
                maiorQuantidade = quantidade;
                indiceMaior = i;
            }
        }

        System.out.println("Frase com mais vogais: " + frases[indiceMaior]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
    }
}