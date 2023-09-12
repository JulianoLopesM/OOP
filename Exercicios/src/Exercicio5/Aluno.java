package Exercicio5;

public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;
    private double notaMedia;

    public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }
    public void media(){
         this.notaMedia = ((nota1 * 2.5) + (nota2 * 2.5) + (notaTrabalho * 2)) / 7;
         System.out.printf( " %s a sua média foi de: %.2f%n " , nome, notaMedia);
    }
    public void notaFinal(){
        double quantoFalta = 7 - notaMedia;
        if (notaMedia < 7){
            System.out.printf("Ainda faltam %.2f pontos para passar de ano ", quantoFalta);
        }else {
            System.out.println("Não falta nada");
        }
    }
}
