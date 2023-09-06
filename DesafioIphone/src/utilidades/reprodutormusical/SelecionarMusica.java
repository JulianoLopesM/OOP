package utilidades.reprodutormusical;

public abstract class SelecionarMusica implements ReprodutorMusical {
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
