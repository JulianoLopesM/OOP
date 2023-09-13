package DesafioBancoDigital;

public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("--Extrato conta poupança--");
        super.imprimirInfosComuns();

    }
}
