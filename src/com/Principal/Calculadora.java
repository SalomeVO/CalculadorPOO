package com.Principal;

public class Calculadora {

    //atributos
    private int numero;
    private int numero2;

    //Contructores sirven para iniciarlizar la clase y sus atributos
    public Calculadora(){

    }

    public Calculadora(int numero, int numero2){
        this.numero = numero;
        this.numero2 = numero2;
    }

    //Metodos
    public int sumar(){
        int suma = this.numero + this.numero2;
        return suma;
    }

    public int restar(){
        int resta = this.numero - this.numero2;
        return resta;
    }

    public int multiplicar(){
        int multiplicacion = this.numero * this.numero2;
        return multiplicacion;
    }

    public double dividir(){
        double division = (double)this.numero / (double)this.numero2;
        return division;
    }

    public int potencias(){
        int resultado_potencia = (int)Math.pow(this.numero, this.numero2);
        return resultado_potencia;
    }

    //get(mostrar) y set(modificar) son el morfismos y encapsulamiento
    public int getNumero(){ return numero; }

    public void setNumero(){ this.numero = numero;}

    public int getNumero2(){
        return numero2;
    }

    public void setNumero2(){ this.numero2 = numero2; }
}
