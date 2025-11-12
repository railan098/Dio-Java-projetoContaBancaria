import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TUDO: Conhecer e importa a classe Scanner
        double valorCliente = 10000.00;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Conta Sicred");

        System.out.println("Digita Seu nome Completo: ");

        String nomeCliente = scanner.next();

        System.out.println("Digita seu CPF: ");

        long cpfCliente = scanner.nextLong();

        System.out.println("Holla " + nomeCliente + " portador do CPF nº: " + cpfCliente + "Seu Saldo Bancario de R$ "
                + valorCliente);

    }
}
