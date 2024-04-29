import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo à criação de conta, favor digitar as informações necessárias!");
        ContaTerminal contaCliente = new ContaTerminal();
        System.out.println("Favor informar o nome+sobrenome!");
        contaCliente.setNomeCliente(sc.nextLine());
        System.out.println("Favor informar o numero da conta!");
        contaCliente.setNumero(sc.nextInt());
        System.out.println("Favor informar a agencia!");
        sc.nextLine();
        contaCliente.setAgencia(sc.nextLine());
        System.out.println("Favor informar o saldo inicial!");
        contaCliente.setSaldo(sc.nextDouble());
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d, e seu saldo de R$ %.2f ja esta disponivel para saque.", contaCliente.getNomeCliente(),contaCliente.getAgencia(),contaCliente.getNumero(),contaCliente.getSaldo());
    }
}