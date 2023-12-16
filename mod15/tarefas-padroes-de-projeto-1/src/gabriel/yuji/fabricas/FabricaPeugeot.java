package gabriel.yuji.fabricas;

import gabriel.yuji.Carros.CarroCombustivel;
import gabriel.yuji.Carros.CarroCombustivelPeugeot;
import gabriel.yuji.Carros.CarroEletrico;
import gabriel.yuji.Carros.CarroEletricoPeugeot;
import gabriel.yuji.fabricas.FabricaAbstrataDeCarros;

public class FabricaPeugeot implements FabricaAbstrataDeCarros {

    @Override
    public CarroEletrico fabricarCarroEletrico() {

        return new CarroEletricoPeugeot();
    }

    @Override
    public CarroCombustivel fabricarCarroCombustivel() {

        return new CarroCombustivelPeugeot();
    }
}
