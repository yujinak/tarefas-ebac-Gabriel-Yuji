package gabriel.yuji;

import gabriel.yuji.dao.ClienteMapDAO;
import gabriel.yuji.dao.IClienteDAO;
import gabriel.yuji.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = menu();

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            JOptionPane.showInputDialog(null,"Opção inválida. Digite novamente:" );
            opcao = menu();
        }

        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)){
                String consulta = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente a ser consultado:",
                        "Consulta",
                        JOptionPane.INFORMATION_MESSAGE);
                consultar(consulta);
            } else if (isExclusao(opcao)){
                String exclusao = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente a ser excluído: ",
                        "Exclusão",
                        JOptionPane.INFORMATION_MESSAGE);
                excluir(exclusao);
            } else if (isAlteracao(opcao)) {
                String alteracao = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Alteração",
                        JOptionPane.INFORMATION_MESSAGE);
                alterar(alteracao);
            }

            opcao = menu();
        }

    }



    //////////////////////////////////////////-VERIFICANDO OPÇÕES-//////////////////////////////////////////////////////
    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }
    private static boolean isConsulta(String opcao) {
        return "2".equals(opcao);
    }
    private static boolean isExclusao(String opcao) {
        return "3".equals(opcao);
    }
    private static boolean isAlteracao(String opcao) {
        return "4".equals(opcao);
    }
    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }
    ////////////////////////////////////////////-EXECUTA OPÇÕES-////////////////////////////////////////////////////////

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        // Caso 'dados' não possuam elementos suficientes para preenche a array dadosSeparados, dará erro
        // Portanto, deve-se validar e passar null para cada dado não preenchido, através do constructor
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void consultar(String consulta) {
        // Validar se foi passado somente cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(consulta));

        if (cliente != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado ", "Erro", JOptionPane.INFORMATION_MESSAGE);

        }

    }
    private static void excluir(String exclusao) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(exclusao));

        if (cliente != null){
            int confirmacao = JOptionPane.showConfirmDialog(null,
                    "Cliente encontrado: " + cliente.toString() + "\n Deseja realmente excluir os dados do cliente encontrado?");

            if(confirmacao == 0){
                iClienteDAO.excluir(Long.parseLong(exclusao));
                JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso!");
            } else if (confirmacao == 1) {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void alterar(String alteracao) {
        String[] dadosSeparados = alteracao.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static String menu() {
        return JOptionPane.showInputDialog(
                null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE
        );
    }




    private static void sair () {
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }

}
