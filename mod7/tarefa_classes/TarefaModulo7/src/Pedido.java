/** @author Gabriel Yuji Nakashima */
public class Pedido {

    private String pedido;
    private int valor;

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }



    /**Este método pergunta qual será o pedido e define "pedido" com a string que receber como argumento.*/
    public void registrarPedido(String pedido){
        System.out.println("Qual vai ser o seu pedido?");
        setPedido(pedido);
    }

    /**Retorna o valor do seu pedido*/
    public void retornaValor(){
        if (pedido == "salada"){
            valor = 20;
            System.out.format("O preço da salada é %d reais", valor);
        } else if (pedido == "prato feito") {
            valor = 30;
            System.out.format("O preço do prato feito é %d reais", valor);
        }
    }
}
