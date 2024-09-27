import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();

        int contagem = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') {
                contagem++;
            }
        }

        if (contagem > 0) {
            System.out.println("A letra 'a' foi encontrada " + contagem + " vez(es).");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}
