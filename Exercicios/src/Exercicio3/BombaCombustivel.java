package Exercicio3;

public class BombaCombustivel {
    public String tipoCombustivel;
    public double valorCombustivelPorLitro;
    public double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorCombustivelPorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorCombustivelPorLitro = valorCombustivelPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor){
        if(valor > 0 && valor <= (this.quantidadeCombustivel * this.valorCombustivelPorLitro)){
            double litrosAbastecidos = valor/this.valorCombustivelPorLitro;
            this.quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Foram abastecidos "+ litrosAbastecidos + " litros");
        }else {
            System.out.println("Valor inválido");
        }



    }
    public void abastecerPorlitro(double litros){
        if(litros > 0 && litros <= (this.quantidadeCombustivel)){
            double valorAPagar = litros * this.valorCombustivelPorLitro;
            this.quantidadeCombustivel -= litros;
            System.out.println("Valor a pagar: R$"+ valorAPagar);

        }else {
            System.out.println("Quantidade de litros inválida ou combustivel insuficiente");
        }
    }
    public void alterarCombustivel(String novoTipo){
        this.tipoCombustivel = novoTipo;
        System.out.println("Tipo de combustivel alterado para "+novoTipo);
    }
    public void alterarQuantidadeCombustivel(double novaQuantidade){
        if(novaQuantidade >= 0){
            this.quantidadeCombustivel = novaQuantidade;
            System.out.println("Quantidade de combusitivel alterada para: "+ novaQuantidade);
        }else {
            System.out.println("Quantidade de combustivel inválida.");
        }
    }
}
