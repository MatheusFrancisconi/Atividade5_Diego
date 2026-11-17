import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        Locale brasil = Locale.forLanguageTag("pt-BR");

        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);

            System.out.printf(
                    brasil,
                    "Pessoa %d: IMC %.2f - %s%n",
                    i + 1, imc, classificarImc(imc)
            );
        }
    }

    public static void main(String[] args) {
        Locale brasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(brasil);

        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Digite o peso da pessoa " + (i + 1) + " em kg: ");
            pesos[i] = sc.nextDouble();

            System.out.print("Digite a altura da pessoa " + (i + 1) + " em metros: ");
            alturas[i] = sc.nextDouble();
        }
        exibirRelatorio(pesos, alturas);
    }
}