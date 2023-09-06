package utilidades.celular;

import utilidades.aparelhotelefonico.AparelhoTelefonico;
import utilidades.navegadornainternet.NavegadorInternet;
import utilidades.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acionando o correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");

    }

    @Override
    public void pausar() {
        System.out.println("pausando música");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");

    }
}