package Banco;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected  static int SEQUENCIAL =1;
    protected final static int AGENCIA_PADRAO = 1;

    

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfos(){
        System.out.format("Agencia: %d ", this.agencia);
        System.out.format("Conta: %d ", this.numero);
        System.out.format("Saldo: %.2f ", this.saldo);
    }
}