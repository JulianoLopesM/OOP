package Exercicio2;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(12345, "Tico Silva", 0.0);
        System.out.println("Numero da conta " + conta.getNumeroDaConta());
        System.out.println("Nome do correntista " + conta.getNomeCorrentista());
        System.out.println("Saldo Atual: " + conta.getSaldo());
        conta.deposito(1000);
        System.out.println("Saldo Atual após depósito: R$" + conta.getSaldo());
        conta.saque(500);
        System.out.println("Saldo atual após saque: R$" +conta.getSaldo());
        conta.alterarNome("Tico Gomes");
        System.out.println("Novo nome: " +conta.getNomeCorrentista());

    }
}
