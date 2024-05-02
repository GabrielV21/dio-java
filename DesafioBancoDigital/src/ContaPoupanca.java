public class ContaPoupanca extends  Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void imprimirInfosComuns(){
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
