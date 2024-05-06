import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Conta Banco</h1>
* Conta Banco solicita informações do usuário sobre uma conta bancária
* 
* @author  Vivian Kailany
* @version 1.0
* @since   05/05/2024
*/

public class ContaTerminal {
    /**
     * Método principal que executa o programa.
     * @param args Os argumentos de linha de comando (não usados neste programa).
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            // Solicita o nome do cliente
            System.out.println("Por favor, digite o seu nome e sobrenome: ");
            String nomeCliente = scanner.nextLine();

            // Solicita o número da agência
            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scanner.next();

            // Solicita o número da conta
            System.out.println("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();

            // Solicita o saldo da conta
            System.out.println("Por favor, digite o valor do saldo: ");
            double saldo = scanner.nextDouble();

            // Exibe a mensagem de agradecimento com base nas informações fornecidas pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        } catch (Exception e) {
            // Exibe uma mensagem de erro caso ocorra uma exceção durante o processamento das entradas do usuário
            System.out.println("Ocorreu um erro ao processar sua entrada. Certifique-se de que os valores inseridos estão corretos e tente novamente.");
            // Limpa o buffer do scanner em caso de erro
            scanner.nextLine();
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}
