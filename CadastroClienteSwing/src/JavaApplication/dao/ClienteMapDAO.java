/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication.dao;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import JavaApplication.domain.Cliente;
import javax.swing.JOptionPane;

import java.util.Iterator;



/**
 *
 * @author victo
 */
public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {       
        
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        
        map.put(cliente.getCpf(), cliente);
        return true;
    }    
        
    @Override
    public void excluir(Long cpf) {
        Cliente slvCliente = map.get(cpf);
        map.remove(slvCliente.getCpf(), slvCliente);
    }

    @Override
    public void alterar(Cliente cliente) {

        Cliente slvCliente = map.get(cliente.getCpf());
        slvCliente.setNome(cliente.getNome());
        slvCliente.setTel(cliente.getTel());
        slvCliente.setEnd(cliente.getEnd());
        slvCliente.setNumero(cliente.getNumero());
        slvCliente.setCidade(cliente.getCidade());
        slvCliente.setEstado(cliente.getEstado());
    }
   
    @Override
    public Cliente consultar(Long cpf) {
       return map.get(cpf);
    }   
}