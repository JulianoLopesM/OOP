package Exercicio2;



public class ContaCorrente {

    public int numeroDaConta;
    public String nomeCorrentista;
    public double saldo;

    public ContaCorrente(int numeroDaConta, String nome, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nome;
        this.saldo = 0.0;
    }
    public void alterarNome(String novoNome){
        this.nomeCorrentista = novoNome;
    }

    public void deposito (double valor){
        if(valor > 0 ){
            this.saldo += valor;
            System.out.println("Deposito de R$" + valor + " foi realizado.");
        }else{
            System.out.println("O valor depositado deve ser maior do que zero.");
        }
    }
    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para efetuar o saque ou valor inválido.");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }


}
