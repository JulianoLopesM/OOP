package estabelecimento;

import utilidades.aparelhotelefonico.AparelhoTelefonico;
import utilidades.celular.Iphone;
import utilidades.navegadornainternet.NavegadorInternet;
import utilidades.reprodutormusical.ReprodutorMusical;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        NavegadorInternet navegadorInternet = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        ReprodutorMusical reprodutorMusical = iphone;


        System.out.println("FUNÇÕES DO NAVEGADOR DO IPHONE");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina();
        System.out.println("FUNÇÕES DE CHAMADA DO IPHONE");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("FUNÇÕES DE APLICATIVO DE MUSICA DO IPHONE");
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}
