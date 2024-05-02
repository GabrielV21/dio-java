public abstract class Conta {
    private static final int agenciaPD = 1;
    private static int seq = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = agenciaPD;
        this.numero = seq++;
        this.cliente = cliente;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }


    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
