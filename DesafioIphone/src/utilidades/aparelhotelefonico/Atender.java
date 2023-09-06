package utilidades.aparelhotelefonico;

public abstract class Atender implements AparelhoTelefonico {
    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }
}
