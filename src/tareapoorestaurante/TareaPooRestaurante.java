/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoorestaurante;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class TareaPooRestaurante {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente nuevo=new Cliente();
        
        mesa mesa=new mesa();
        int tamano=0;
        LinkedList <Cliente> listClientes=new LinkedList <Cliente>();
        LinkedList <PlatoDeComida> PlatF =new LinkedList<PlatoDeComida>();
        LinkedList <PlatoDeComida> ListaPostres=new LinkedList <PlatoDeComida>();
        LinkedList <PlatoDeComida> ListaAperitivo=new LinkedList <PlatoDeComida>();
        Scanner op=new Scanner(System.in);
        Scanner op2=new Scanner(System.in);
        PlatoDeComida p1=new PlatoDeComida();
        
        while(true){
        int x=menuPrincipal(op);
        System.out.println("opcion: "+x);
        
        switch(x){
            case 1:System.out.println("opcion 1");
            //asignacionDeMesas(op,op2,nuevo,listClientes,mesa);
            System.out.println("Para cuantas personas es la mesa:");
            int num=op.nextInt();
            mesa.setClientesEnMesa(num);
        
            for (int i = 0; i < num; i++) {
                int c=i+1;
                System.out.println("Nombre del cliente numero "+c);
                nuevo.setNombre(op.nextLine());
                System.out.println("Edad: ");
                nuevo.setEdad(op2.nextInt());
                System.out.println("Forma de pago: 1. Efectivo      2.CreditCard");
                int opc=op2.nextInt();
                    switch(opc){
                        case 1: nuevo.setEfectivo(true);break;
                        case 2: nuevo.setCreditCard(true);break;
                }
                listClientes.addLast(nuevo);           
            }
            mesa.setListaCliente(listClientes);
            System.out.println("Elija numero de mesa:");
            mesa.setNumeroDeMesa(op.nextInt());
            
            //menuPrincipal(op);
            
            break;
            case 2:System.out.println("opcion 2"); 
            //generador_de_platos(ListaPlatosFuertes,ListaAperitivo,ListaPostres,op,op2,comida);
            System.out.println("Cauntos platos quiere agregar:");
            tamano=op.nextInt();
            for (int i = 0; i < tamano; i++) {
                
                PlatoDeComida comida  =new PlatoDeComida();                
                System.out.println("Nombre del plato:");
                comida.setNombre(op2.nextLine());
                op.nextLine();
                System.out.println("Precio:");
                comida.setPrecio(op.nextDouble());
                System.out.println("Tipo: 1. plato fuerte       2. Aperitivo        3. Postre ");
                System.out.println("escoja tipo.");
                int c=op.nextInt();
                String tipoo="";
                switch (c){
                    case 1: tipoo="Plato Fuerte";break;
                    case 2: tipoo="Aperitivo";break;
                    case 3: tipoo="Postre"; break;
                }
                comida.setTipo(tipoo);
                System.out.println("Ingrese cuantas calorias tiene:");
                comida.setCalorias(op.nextInt());
                switch (c){
                    case 1: PlatF.addLast(comida);/*comida=null;*/break;
                    case 2: ListaAperitivo.addLast(comida);break;
                    case 3: ListaPostres.addLast(comida);break;
                }
                op.nextLine();    
        }
                System.out.println("tamano lista: "+PlatF.size());
           // menuPrincipal(op);
            break;
            case 3:System.out.println("opcion 3");
                    tomarPedido(PlatF,ListaAperitivo,ListaPostres);
                    //menuPrincipal(op);
            break;
            case 4:System.out.println("");
            //menuPrincipal(op);
            break;
        }
        
        //System.out.println("name: "+comida.getNombre()+" Precio: $"+comida.getPrecio()+" tipo: "+comida.getTipo()+" calorias: "+comida.getCalorias());
        System.out.println(PlatF);
        int w=tamano;
        int e= ListaPostres.size();
        int r= ListaAperitivo.size();
        
        /*
        System.out.println("PF: "+w+" lp: "+e+" la: "+r);
        System.out.println(ListaPlatosFuertes.get(0).equals(comida.equals("pato")));
        */
    }}
    public static int menuPrincipal(Scanner opcion){
        System.out.println("---------------------------------------------------------");
        System.out.println("|                          Menu                         |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|               1.  Asignacion de mesas                 |");
        System.out.println("|               2.  Agregar Plato                       |");
        System.out.println("|               3.  Toma de pedidos                     |");
        System.out.println("|               4.  Cuenta                              |");
        System.out.println("---------------------------------------------------------");
        int option=opcion.nextInt();
        return option;
    }
    
    public static void generador_de_platos(ArrayList lista,ArrayList lista2,ArrayList lista3,Scanner op,Scanner op2,PlatoDeComida comida){
        
        
        
        
    }
    
    public static void tomarPedido(List platoF,List Aperitivo, List postre)
    {   PlatoDeComida plato=new PlatoDeComida();
        System.out.println("---------------------------------------------------------");
        System.out.println("|                Menu de platos                         |");
        System.out.println("---------------------------------------------------------");
        int num1=platoF.size();
        int num2=Aperitivo.size();
        int num3=postre.size();
        int cont=0;
        
        
        
        System.out.println("---------------------------------------------------------");
        System.out.println("|                     Plato Fuerte                       |");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < num1; i++) {
            cont=cont+1;
            //plato;
            
            System.out.println("|               "+cont+". "+ platoF.get(i));
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                       Aperitivo                      |");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < num2; i++) {
            cont=cont+1;
            
            System.out.println("|               "+cont+". "+Aperitivo.get(i)+"");
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|                        Postre                        |");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < num3; i++) {
            cont=cont+1;
            
            System.out.println("|               "+cont+". "+postre.get(i)+"");
        }
        
    }
}
