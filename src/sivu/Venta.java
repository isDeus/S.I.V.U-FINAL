/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sivu;



public class Venta {
    private int valor;
    private int codigo;
    private int cantidad;
    
    public Venta(int valor, int codigo, int cantidad){
        this.valor = valor;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public int returnCodigo(){
        return this.codigo;
    }
    
    public int returnCantidad(){
        return this.cantidad;
    }


}
