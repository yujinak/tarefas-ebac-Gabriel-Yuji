package registros;

public class App {

    public static void main (String[] args){

        System.out.println("\n----------------- Pessoa Física -------------------");
        //Criando Pessoa Física
        PessoaFisica gabriel = new PessoaFisica();
        gabriel.setCpf(123455671L);
        gabriel.setIdade((short) 29);

        gabriel.setNome("Gabriel Yuji");
        gabriel.setLocalizacao("Curitiba, PR, Brasil");
        gabriel.setAnoDeRegistro((short) 2023);

        apresentacaoComum(gabriel.getNome(), gabriel.getLocalizacao(), gabriel.getAnoDeRegistro());
        System.out.println("Possui CPF de nº " + gabriel.getCpf() + ", e tem " + gabriel.getIdade() + " anos de idade.");

        System.out.println("\n----------------- Pessoa Jurídica -------------------");

        //Criando Pessoa Jurídica
        PessoaJuridica gabrielStudio = new PessoaJuridica();
        gabrielStudio.setCnpj(12213244342342L);
        gabrielStudio.setNumeroDeFuncionarios((short) 12);

        gabrielStudio.setNome("Studio Gabriel&Co.");
        gabrielStudio.setLocalizacao("Okinawa, Japan");
        gabrielStudio.setAnoDeRegistro((short) 2032);

        apresentacaoComum(gabrielStudio.getNome(), gabrielStudio.getLocalizacao(), gabrielStudio.getAnoDeRegistro());
        System.out.println("Possui CNPJ de nº " + gabrielStudio.getCnpj() + ", contando com " + gabrielStudio.getNumeroDeFuncionarios() + " trabalhadores.");

    }

    public static void apresentacaoComum(String nome, String localizacao, Short registro){
        System.out.println(nome + " está localizado em " + localizacao + " , de acordo com o registro de " + registro);
    }

}
