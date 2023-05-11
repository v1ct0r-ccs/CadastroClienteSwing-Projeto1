/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
package JavaApplication.dao;

import JavaApplication.domain.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ClienteDAO implements IClienteDAO {
    private final Map<Long, Cliente> mapaClientes = new HashMap<>();
    
    public void inserir(Cliente cliente) {
        mapaClientes.put(cliente.getCpf(), cliente);
    }
    
    @Override
    public boolean alterar (Long cpf, Cliente cliente) {
        if (mapaClientes.containsKey(cpf)) {
            mapaClientes.put(cpf, cliente);
            return true;
        }
        return false;
    }
    
    public void remover(long cpf) {
        mapaClientes.remove(cpf);
    }
    
    public Cliente buscarPorCpf(Long cpf) {
        return mapaClientes.get(cpf);
    }
    
    @Override
    public List<Cliente> buscarTodos() {
        return new ArrayList<>(mapaClientes.values());
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        if (mapaClientes.containsKey(cliente.getCpf())) {
            return false; // O cliente já existe no mapa
        } else {
            mapaClientes.put(cliente.getCpf(), cliente);
            return true; // o cliente foi cadastrado com sucesso
        }
    }

    @Override
    public boolean excluir(Long cpf) {
        if (mapaClientes.containsKey(cpf)) {
            mapaClientes.remove(cpf);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultar(Long cpf) {
        return mapaClientes.get(cpf);
    }

    @Override
    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : mapaClientes.values()) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void salvarCliente(Cliente cliente) {
        mapaClientes.put(cliente.getCpf(), cliente);
    }
}
*/