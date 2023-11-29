package gabriel.yuji.lista;

import gabriel.yuji.domain.Pessoa;

import java.util.*;

public class ExercicioMod11 {
    public static void main(String[] args) {

        System.out.println("Olá! Esta aplicação permite cadastras pessoas e dividr em dois grupos, separados por gênero.");

        // Cria listas Feminino e Masculino
        List<Pessoa> feminino = new ArrayList<>();
        List<Pessoa> masculino = new ArrayList<>();




        for(int i=0;i<=10; i++){
            Pessoa pessoa = new Pessoa("", "");
            String nome = pessoa.getNome();
            String genero = pessoa.getGenero();

            Scanner reader = new Scanner(System.in);
            System.out.println("Insira o nome de uma pessoa:");
            pessoa.setNome(reader.nextLine());

            System.out.println("Agora escreva se o gênero desta pessoa é masculino ou feminino: ");

            String input = reader.next();

            if(input.equalsIgnoreCase("masculino")) {
                pessoa.setGenero(input);
                masculino.add(pessoa);
            } else if(input.equalsIgnoreCase("feminino")){
                pessoa.setGenero(input);
                feminino.add(pessoa);
            } else {
                System.out.println("Resposta inválida");
            }
            System.out.println(pessoa);
            System.out.println("Pessoa de nome " + pessoa.getNome() + " , do gênero " + pessoa.getGenero() + " cadastrado com sucesso.");

            System.out.println("Deseja cadastrar outra pessoa? Digite qualquer tecla para continuar ou 'não' para parar.");
            String resposta = reader.next();
            if(resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao")) break;

        }
        System.out.println("Cadastro de pessoas finalizado. Foram cadastradas " + feminino.size() + masculino.size() + " pessoas ao todo.");
        System.out.println("O grupo Femenino contém " + feminino.size() + " pessoas, sendo elas: " + feminino );
        System.out.println("O grupo Masculino contém " + masculino.size() + " pessoas, sendo elas: " + masculino );

    }
}
