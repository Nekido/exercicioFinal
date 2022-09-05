import java.util.Locale;
import java.util.Scanner;

public class ExercicioFinal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        saudacao();
        int unidadeInp = 0, unidadeOut = 0;
        double resultado, tempIn, tempOut;
        String unidadeTemp, opcao, Celsius, Fahrenheit, Kelvin;
        int N, i;
        final double v = 1.8;
        double soma = 0;
        float soma1 = 0, soma2 = 0;
        double media1 = 0, media2 = 0;


        try {

            System.out.println("Digite a unidade de temperatura que você deseja transformar:");
            System.out.println("* Digite 1 para Celsius:");
            System.out.println("* Digite 2 para Fahrenheit:");
            System.out.println("* Digite 3 para Kelvin:");
            unidadeInp = sc.nextInt();
            System.out.println("Para qual unidade de temperatura você deseja converter?");
            unidadeOut = sc.nextInt();


            System.out.println("Digite a quantidade de temperaturas que você vai transformar:");
            N = sc.nextInt();
            double[] vet = new double[N];


            for (i = 0; i < N; i++) {
                System.out.print("Digite a " + (i + 1) + "ª temperatura:");
                vet[i] = sc.nextDouble();

            }
            double[] vet2 = new double[N];
            for (i = 0; i < N; i++) {
                if (unidadeInp == 1 && unidadeOut == 2) {
                    vet2[i] = ((vet[i] * v) + 32);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º Celsius" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Fahrenheit");
                } else if (unidadeInp == 1 && unidadeOut == 3) {
                    vet2[i] = (vet[i] + 273.15);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º Celsius" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Kelvin");
                }
                if (unidadeInp == 2 && unidadeOut == 1) {
                    vet2[i] = ((vet[i] - 32) * v);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º Fahrenheit" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Celsius");
                } else if (unidadeInp == 2 && unidadeOut == 3) {
                    vet2[i] = ((vet[i] - 32) * 5 / 9 + 273.15);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º Fahrenheit" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Kelvin");
                }
                if (unidadeInp == 3 && unidadeOut == 1) {
                    vet2[i] = (vet[i] - 273.15);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º Kelvin" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Celsius");
                } else if (unidadeInp == 3 && unidadeOut == 2) {
                    vet2[i] = ((vet[i] - 273.15) * v + 32);
                    System.out.println("Temperatura digitada: " + String.format("%.2f", vet[i]) + " º kelvin" + " / Conversão: " + String.format("%.2f", vet2[i]) + " º Fahrenheit");
                }

                soma1 += soma + vet[i];
                soma2 += soma + vet2[i];
            }


            System.out.println("A média das temperaturas DIGITADAS é: " + (soma1 / N));
            System.out.println("A média das temperaturas CONVERTIDAS é: " + (soma2 / N));

        } catch (Exception e) {

            System.out.println("Bruno, sinto muito mas não consegui de jeito nenhum tratar erro especifico.");
            System.out.println("O programa será encerrado");

        }

    }


    private static void saudacao() {
        System.out.println("Seja bem vindo ao conversor da Caterine:");
    }

}