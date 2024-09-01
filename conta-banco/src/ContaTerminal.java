import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();

        System.out.println("Digite o saldo:");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia 
        + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
