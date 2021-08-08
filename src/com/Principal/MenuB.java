package com.Principal;

public class MenuB {

    int opcion;
    boolean salirBasic = false;

    public MenuB() {
        opcion = 0;
    } //constructor


    public void CalcuBasic(){
        Lectura read = new Lectura();
        salirBasic = false;
        do{
            System.out.println("\n\t Calculadora Basica ");
            System.out.println("\t--------------------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir del programa");
            System.out.print("\nIngrese una opcion: ");
            int opcion = read.lecturaEntero();

            switch(opcion){

                case 1: { Lectura read_dos = new Lectura();

                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    Calculadora resultado = new Calculadora(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resultado de la suma de " + numeroCalculadora + " + " + numero2Calculadora + " = " + resultado.sumar());
                }break;

                case 2: { Lectura read_dos = new Lectura();

                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    Calculadora resultado = new Calculadora(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resltado de la resta de " + numeroCalculadora + " - " + numero2Calculadora + " = " + resultado.restar());
                }break;

                case 3:{ Lectura read_dos = new Lectura();

                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    Calculadora resultado = new Calculadora(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resltado de la multiplicacion de " + numeroCalculadora + " * " + numero2Calculadora + " = " + resultado.multiplicar());
                } break;

                case 4:{Lectura read_dos = new Lectura();

                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    Calculadora resultado = new Calculadora(numeroCalculadora, numero2Calculadora);
                    System.out.println("El resltado de la division de " + numeroCalculadora + " / " + numero2Calculadora + " = " + resultado.dividir());} break;

                case 5:
                    Menu men = new Menu();
                    men.mensajeSalir(); salirBasic = true; break;

                default:
                    Menu men_dos = new Menu();
                    men_dos.mensaje(); break;
            }
        } while(!salirBasic);
    }
}
