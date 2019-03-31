/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoorestaurante;
import java.util.ArrayList;
/**
 *
 * @author Hp
 */
public class Cliente {
    private String nombre;
    private int edad;
    private boolean CreditCard;
    private boolean Efectivo;
    private double efectivo;
    private double credito;
    //public static ArrayList orden;
    
    
    //constructor
    public Cliente(){
        this.nombre="";
        this.edad=0;
        this.CreditCard=false;
        this.Efectivo=false;
        this.credito=0;
        this.efectivo=0;
        
    }

        
    public Cliente(String nombre,int edad,boolean CreditCard,boolean efectivo){
        this.nombre=nombre;
        this.edad=edad;
        this.CreditCard=CreditCard;
        this.Efectivo=efectivo;
        this.credito=0;
        this.efectivo=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCreditCard(boolean CreditCard) {
        this.CreditCard = CreditCard;
    }

    public void setEfectivo(boolean Efectivo) {
        this.Efectivo = Efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
     
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCreditCard() {
        return CreditCard;
    }

    public boolean isEfectivo() {
        return Efectivo;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public double getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", CreditCard=" + CreditCard + ", Efectivo=" + Efectivo + ", efectivo=" + efectivo + ", credito=" + credito;
    }
    
    
    
    public double pagar(boolean TCredito,boolean money,double TCredt,double Dinero,double total){
        if(money){
            System.out.println("money como forma de pago");
        }
        if (TCredito) {
            System.out.println("Targeta como forma de pago");
        }
        return total;
    }
    
    
}
