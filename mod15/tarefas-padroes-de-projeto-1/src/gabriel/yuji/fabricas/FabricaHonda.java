package gabriel.yuji.fabricas;

import gabriel.yuji.Carros.CarroCombustivel;
import gabriel.yuji.Carros.CarroCombustivelHonda;
import gabriel.yuji.Carros.CarroEletrico;
import gabriel.yuji.Carros.CarroEletricoHonda;

public class FabricaHonda implements FabricaAbstrataDeCarros {
    @Override
    public CarroEletrico fabricarCarroEletrico() {
        return new CarroEletricoHonda();
    }

    @Override
    public CarroCombustivel fabricarCarroCombustivel() {
        return new CarroCombustivelHonda();
    }
}
