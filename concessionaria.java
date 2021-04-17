/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

public class concessionaria {
    protected String marca;

    protected String modelo;
    protected double preco;
    protected int rodas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void printMarca(){
        System.out.println("Marca: " + this.marca);
    }
    
    public void printModelo(){
        System.out.println("Modelo: " + this.marca);
    }
    
    public void printPreco(){
        System.out.println("Salario: " + this.preco);
    }
    
    public void defRodas(){
        this.rodas = 4;
    }
}
