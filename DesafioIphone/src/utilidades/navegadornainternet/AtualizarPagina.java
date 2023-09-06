package utilidades.navegadornainternet;

public abstract class AtualizarPagina implements NavegadorInternet{
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}
