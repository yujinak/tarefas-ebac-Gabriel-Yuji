package gabriel.yuji;

import gabriel.yuji.Carros.CarroCombustivel;
import gabriel.yuji.Carros.CarroEletrico;
import gabriel.yuji.fabricas.FabricaAbstrataDeCarros;

public class App {
    private CarroEletrico carroEletrico;
    private CarroCombustivel carroCombustivel;

    public App(FabricaAbstrataDeCarros fabrica){
        carroEletrico = fabrica.fabricarCarroEletrico();
        carroCombustivel = fabrica.fabricarCarroCombustivel();
    }

    public void info(){
        carroCombustivel.info();
        carroEletrico.info();
    }
}
