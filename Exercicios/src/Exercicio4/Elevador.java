package Exercicio4;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }
    public void entrar(){
        if(pessoasPresentes < capacidadeElevador){
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        }else {
            System.out.println("O elevador está cheio.");
        }
    }
    public void sair(){
        if (pessoasPresentes > 0){
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador");
        }else {
            System.out.println("O elevador ja está vazio");
        }

    }
    public void subir(){
        if (andarAtual < totalAndares){
            andarAtual++;
            System.out.println("O elevador subiu para o andar: " + andarAtual);
        }else {
            System.out.println("O elevador já está no ultimo andar");
        }
    }
    public void descer(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.println("O elevador desceu para o andar: " + andarAtual);
        }else {
            System.out.println("O elevador já está no terreo.");
        }
    }
}
