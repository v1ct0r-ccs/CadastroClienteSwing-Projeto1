/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication.dao;

import java.util.HashSet;
import java.util.Set;
import JavaApplication.domain.Cliente;

/**
 *
 * @author victo
 */
public abstract class ClienteSetDAO implements IClienteDAO {
    
    private final Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }
    
    public boolean cadastar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente encCliente = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                encCliente = cliente;
                break;
            }
        }
        
        if (encCliente != null) {
            this.set.remove(encCliente);
        }
    }

   @Override
    public void alterar(Cliente cliente) {
        
        if (this.set.contains(cliente)) {
            for (Cliente slvCliente : this.set){
                if (slvCliente.equals(cliente)){
                    slvCliente.setNome(cliente.getNome());
                    slvCliente.setTel(cliente.getTel());
                    slvCliente.setEnd(cliente.getEnd());
                    slvCliente.setNumero(cliente.getNumero());
                    slvCliente.setCidade(cliente.getCidade());
                    slvCliente.setEstado(cliente.getEstado());
                    break;  
                }                
            }  
        }
    }
   
    @Override
    public Cliente consultar(Long cpf) {       
        for (Cliente slvCliente : this.set) {
            if (slvCliente.getCpf().equals(cpf)) {
                return slvCliente;
            }
        }
        return null;
    }
/*    
    public void salvar (Cliente cliente) {
        if (consultar(cliente.getCpf()) != null) {
            atualizar(cliente);
        } else {
            this.set.add(cliente);
        }
    }
    
    public void atualizar (Cliente cliente) {
        this.set.removeIf(c -> c.getCpf().equals(cliente.getCpf()));
        this.set.add(cliente);
    }
*/
}
