/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoorestaurante;

/**
 *
 * @author Hp
 */
public class PlatoDeComida {
    private String nombre;
    private double precio;
    private String tipo;
    private double calorias;
    
    public PlatoDeComida(){
        this.nombre="";
        this.precio=0;
        this.tipo="";
        this.calorias=0;
    
}
    
    public PlatoDeComida(String nombre, double precio, String tipo, double calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.calorias = calorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", calorias=" + calorias +"\n";
    }
    
    
    
    
}
