package DesafioBancoDigital;

public class Main {

    public static void main(String[] args) {
        Cliente juliano = new Cliente();
        juliano.setNome("Juliano");
        juliano.setCpf("111111111-11");

        Conta cc = new ContaCorrente(juliano);
        cc.depositar(100);
        Conta poupanca = new ContaPoupança(juliano);
        poupanca.depositar(100);
        poupanca.sacar(50);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");
        daniel.setCpf("222222222-22");


        cc = new ContaCorrente(daniel);
        cc.depositar(50);
        poupanca = new ContaPoupança(daniel);
        poupanca.depositar(50);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}
