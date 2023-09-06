package utilidades.navegadornainternet;

public abstract class ExibirPagina implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }
}
