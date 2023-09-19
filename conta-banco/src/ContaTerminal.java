import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) throws Exception {
       //Criando o objeto scanner
        
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite o seu nome!");
       String nome = scanner.next();

       System.out.println("Por favor, digite seu sobrenome!");
       String sobrenome = scanner.next();

       System.out.println("Por favor, digite o número da Agência!");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o número da Conta:");
       int numero = scanner.nextInt();

       System.out.println("Digite o valor para depósito - saldo:");
       float saldo = scanner.nextFloat();

       System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque.");

    }
}
