import java.util.Scanner;

/**
 * <h1>Desafio DIO - Acesso a um Banco via Terminal</h1>
 * <br>
 * 
 * @author Igor Augusto
 * @version 1.0
 * @since 18/07/2024
 * 
 */

public class ContaTerminal {
    /**
     * Obtendo parâmetros pelo <b>Scanner</b> (java.util.Scanner)
     * @param conta é o primeiro parâmetro contendo o número da conta do usuário.
     * @param agencia é o segundo parâmetro contendo a agência do usuário.
     * @param nomeCliente é o terceiro parâmetro contendo o nome do usuário.
     * @param saldo é o quarto parâmetro contendo a quantia de saldo do usuário.
     * @return Uma mensagem contendo todos os parâmetros.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        Integer conta = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = myScanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = myScanner.nextLine().toUpperCase();

        System.out.println("Digite o seu saldo: ");
        Double saldo = myScanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
        myScanner.close();
    }
}
