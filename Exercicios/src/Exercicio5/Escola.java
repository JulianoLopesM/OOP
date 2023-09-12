package Exercicio5;
public class Escola {
    public static void main(String[] args) {
        Aluno juliano = new Aluno("55555", "Juliano", 10.0, 10.0, 10.0 );
        juliano.media();
        juliano.notaFinal();
        Aluno matheus = new Aluno("44444", "Matheus", 7.0, 6.0, 6.0);
        matheus.media();
        matheus.notaFinal();
    }
}
