/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoorestaurante;

import java.util.LinkedList;
/**
 *
 * @author Hp
 */
public class mesa {
    private int numeroDeMesa;
    private int ClientesEnMesa;
    private LinkedList <Cliente> listaCliente;

    public mesa(int numeroDeMesa, int ClientesEnMesa, LinkedList listaCliente) {
        this.numeroDeMesa = numeroDeMesa;
        this.ClientesEnMesa = ClientesEnMesa;
        this.listaCliente = listaCliente;
    }

    public mesa() {
        this.numeroDeMesa = 0;
        this.ClientesEnMesa = 0;
        this.listaCliente = null;
    }
    

    public void setNumeroDeMesa(int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public void setClientesEnMesa(int ClientesEnMesa) {
        this.ClientesEnMesa = ClientesEnMesa;
    }

    public void setListaCliente(LinkedList listaCliente) {
        this.listaCliente = listaCliente;
    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public int getClientesEnMesa() {
        return ClientesEnMesa;
    }

    public LinkedList getListaCliente() {
        return listaCliente;
    }
    
    public void agregarALista(Cliente cliente){
        listaCliente.add(cliente);
        
    }
}
