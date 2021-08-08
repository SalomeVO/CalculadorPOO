package com.Principal;

public class CalcudoraIndiviual {
    //atributos
    private int result;

    //Contructores sirven para iniciarlizar la clase y sus atributos
    public CalcudoraIndiviual(){

    }

    public CalcudoraIndiviual(int result){
        this.result = result;
    }

    public double raizCuadradas(){
        double resultado_raiz = Math.sqrt(this.result);
        return resultado_raiz;
    }

    public double sen(){
        double numeroEnRadianes = Math.toRadians(this.result);
        double seno = Math.sin(numeroEnRadianes);
        return seno;
    }

    public double cos(){
        double numeroEnRadianes = Math.toRadians(this.result);
        double coseno = Math.cos(numeroEnRadianes);
        return coseno;
    }

    public double tan(){
        double numeroEnRadianes = Math.toRadians(this.result);
        double tangente = Math.tan(numeroEnRadianes);
        return tangente;
    }

    //get(mostrar) y set(modificar) son el morfismos y encapsulamiento
    public int getNumero(){ return result; }

    public void setNumero(){ this.result = result;}


}
