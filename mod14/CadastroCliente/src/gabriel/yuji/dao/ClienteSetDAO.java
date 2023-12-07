package gabriel.yuji.dao;

import gabriel.yuji.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements  IClienteDAO{

    private Set<Cliente> set;

    public ClienteSetDAO(Set<Long> set) {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.set.contains(cliente.getCpf())){
            return false;
        }
        this.set.add(cliente);
        return null;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
            }
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set){
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setEnd(cliente.getEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteCadastrado : this.set){
            if (clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
