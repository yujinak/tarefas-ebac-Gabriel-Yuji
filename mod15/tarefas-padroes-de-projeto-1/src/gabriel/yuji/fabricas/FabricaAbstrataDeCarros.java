package gabriel.yuji.fabricas;

import gabriel.yuji.Carros.CarroCombustivel;
import gabriel.yuji.Carros.CarroEletrico;

public interface FabricaAbstrataDeCarros {
     CarroEletrico fabricarCarroEletrico();
     CarroCombustivel fabricarCarroCombustivel();
}
