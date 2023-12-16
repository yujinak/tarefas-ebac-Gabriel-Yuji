package gabriel.yuji;

import gabriel.yuji.fabricas.FabricaAbstrataDeCarros;
import gabriel.yuji.fabricas.FabricaHonda;
import gabriel.yuji.fabricas.FabricaPeugeot;

public class Demo {

    private static App configurarAplicacao(String marca){
        App aplicacao;

        FabricaAbstrataDeCarros fabrica;
        marca = marca.toLowerCase();
        if(marca.contains("honda")){
            fabrica = new FabricaHonda();
        } else {
            fabrica = new FabricaPeugeot();
        }

        aplicacao = new App(fabrica);
        return aplicacao;
    }

    public static void main(String[] args) {
        App aplicacao = configurarAplicacao("Honda");
        aplicacao.info();

        App aplicacao2 = configurarAplicacao("Peugeot");
        aplicacao2.info();
    }
}
