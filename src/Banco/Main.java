package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");
        ContaCorrente cc = new ContaCorrente(lucas);
        ContaPoupanca cp = new ContaPoupanca(lucas);
        cc.depositar(1500);
        cp.depositar(3000);
        cc.transferir(400, cp);
        cc.imprimirInfos();

        //Lucas Marcelo
    }
}