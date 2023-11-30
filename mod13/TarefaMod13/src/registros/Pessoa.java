package registros;

public abstract class Pessoa {

    // Variáveis
    private String nome;
    private String localizacao;
    private Short anoDeRegistro;


    // Métodos Setter e Getter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Short getAnoDeRegistro() {
        return anoDeRegistro;
    }

    public void setAnoDeRegistro(Short anoDeRegistro) {
        this.anoDeRegistro = anoDeRegistro;
    }
}
