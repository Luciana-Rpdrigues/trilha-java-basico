import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu  nome completo:");
        String nomeCliente = scanner.nextLine();
        String[] partes = nomeCliente.split(" ");
        
        System.out.println("Por favor, digite o número da Agência separando o dígito com -:" );
        String agencia = scanner.next();
        
        System.out.println("Digite sua conta corrente, somente números:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o valor que deseja sacar.");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente.split(" ")[0] + " " + partes[partes.length - 1] + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o valor de R$ " + saldo + " já está disponível para saque. Volte sempre!");

    }
}
