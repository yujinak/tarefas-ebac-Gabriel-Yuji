package registros;

public class PessoaFisica extends Pessoa{

    // Variáveis
    private long cpf;
    private short idade;

    // Métodos Getter e Setter
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }
}
