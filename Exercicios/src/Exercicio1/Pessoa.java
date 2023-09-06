package Exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
   private String nome;
   private LocalDate dataNascimento;
   private Double altura;

    public Pessoa(String nome, LocalDate dataNascimento, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period period = Period.between(dataNascimento, dataAtual);
        return period.getYears();

    }
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura +  " metros");
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("idade: " + calcularIdade() + " anos");
    }
}