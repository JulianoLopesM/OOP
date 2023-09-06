package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora {

    public void copiar() {
        System.out.println("Copiando via Equipamento Multi Funcional");
    }


    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multi Funcional");
    }


    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multi Funcional");
    }
}
