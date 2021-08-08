package com.Principal;

public class Menu {

    int opcion;
    boolean salir = false;
    public Menu() {
        opcion = 0;
    } //constructor

    public void MenuInicial() {

        Lectura read = new Lectura(); //invocamos la funcion lectura
        salir = false;

        do {
            encabezado();
            System.out.println("\t* Menu Calculadora *");
            System.out.println("1. Calculadora Basica");
            System.out.println("2. Calculadora Avanzada");
            System.out.println("3. Salir del programa");
            System.out.print("\nIngrese una opcion: ");
            int opcion = read.lecturaEntero();

            switch (opcion) {

                case 1:
                    MenuB Basico = new MenuB();
                    Basico.CalcuBasic();
                    break;

                case 2:
                    MenuP Profesional = new MenuP();
                    Profesional.CalcuProf();
                    break;

                case 3: mensajeSalir(); salir = true; break;

                default: mensaje(); break;
            }
        }while (!salir);
    }


    public void mensaje(){
        System.out.println("__________________________________________");
        System.out.println("| Sintaxis erronea! opcion no encontrada |");
        System.out.println("__________________________________________\n");
    }

    public void encabezado(){
        System.out.println("\n\t*************************************");
        System.out.println("\t* BIENVENIDO AL PROGRAMA CALCULADORA*");
        System.out.println("\t*************************************\n");
    }

    public void mensajeDatoUno(){ System.out.print("\nIngrese el primer numero: "); }

    public void mensajeDatoDos(){ System.out.print("\nIngrese el segundo numero: "); }

    public void mensajeSalir(){
        System.out.println("\n\t**********************");
        System.out.println("\t* Salio del programa *");
        System.out.println("\t**********************");

    }
}





