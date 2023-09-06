package utilidades.reprodutormusical;

public abstract class Tocar implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
}
