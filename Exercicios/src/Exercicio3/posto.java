package Exercicio3;

public class posto {
    public static void main(String[] args) {
        BombaCombustivel bombaCombustivel = new BombaCombustivel("Gasolina", 8.0, 100.0);
        System.out.println("Tipo de combustivel: " + bombaCombustivel.tipoCombustivel);
        System.out.println("Valor por litro: " + bombaCombustivel.valorCombustivelPorLitro);
        System.out.println("Quantidade de combustivel: "+bombaCombustivel.quantidadeCombustivel);
        bombaCombustivel.abastecerPorValor(50);
        bombaCombustivel.abastecerPorlitro(10);
        bombaCombustivel.alterarValor(5);
        bombaCombustivel.alterarCombustivel("Etanol");
        bombaCombustivel.alterarQuantidadeCombustivel(80);
    }
}
