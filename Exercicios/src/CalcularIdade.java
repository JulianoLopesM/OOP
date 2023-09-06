import java.time.LocalDate;

public class CalcularIdade  {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", LocalDate.of(1980,8, 15),  1.8);
        joao.imprimirDados();
    }

}
