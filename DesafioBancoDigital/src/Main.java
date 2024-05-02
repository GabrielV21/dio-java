public class Main {
    public static void main(String[] args) {
        Cliente davi = new Cliente("Davi");
        ContaCorrente coc = new ContaCorrente(davi);
        Conta poup = new ContaPoupanca(davi);
        Banco banco = new Banco("DIO");
        coc.depositar(200);
        coc.transferir(100,poup);

        System.out.println("Banco: "+banco.getNome());
        coc.imprimirInfosComuns();
        poup.imprimirInfosComuns();
    }
}