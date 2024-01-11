package yujinak;

public abstract class Carros<T> {

    protected String nomeDoCarro;

    // Constructor
    public Carros(){
    }

    public void ligar(){
        System.out.println( nomeDoCarro + " ligado");
    }


    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }


    @Override
    public String toString() {
        return nomeDoCarro;
    }
}
