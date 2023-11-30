package registros;

public class PessoaJuridica extends Pessoa {

    // Variáveis
    private long cnpj;
    private short numeroDeFuncionarios;

    // Métodos Setter e Getter

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public short getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(short numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}
