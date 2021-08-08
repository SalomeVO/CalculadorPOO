package com.Principal;

public class MenuP {
    int opcion;
    boolean salirPro = false;

    public MenuP(){
        opcion = 0;
    }

    public void CalcuProf(){
        Lectura read_tres = new Lectura();
        salirPro = false;

        do{
            System.out.println("\n\t Calculadora Avanzada ");
            System.out.println("\t--------------------");
            System.out.println("1. Raiz cuadrada");
            System.out.println("2. Potencia");
            System.out.println("3. Seno");
            System.out.println("4. Coseno");
            System.out.println("5. Tangente");
            System.out.println("6. Salir del programa");
            System.out.print("\nIngrese una opcion: ");
            int opcion = read_tres.lecturaEntero();

            switch(opcion){

                case 1: { Lectura read = new Lectura();
                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    CalcudoraIndiviual resultado = new CalcudoraIndiviual(resultCalcudoraIndiviual);
                    CalcudoraIndiviual resultado_2 = new CalcudoraIndiviual(DresultCalcudoraIndiviual);

                    System.out.println("\nEl resultado de la raiz cuadrada de " + resultCalcudoraIndiviual + " es: " + resultado.raizCuadradas());
                    System.out.println("\nEl resultado de la raiz cuadrada de " + DresultCalcudoraIndiviual + " es: " + resultado_2.raizCuadradas());

                }break;

                case 2: { Lectura read = new Lectura();

                    System.out.print("Ingrese el numero base: ");
                    int numeroCalculadora = read.lecturaEntero();

                    System.out.print("Ingrese el numero potencia: ");
                    int numero2Calculadora = read.lecturaEntero();

                    Calculadora resultado = new Calculadora(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resltado de la base " + numeroCalculadora + " elevado a " + numero2Calculadora + " = " + resultado.potencias());
                }break;

                case 3:{ Lectura read = new Lectura();
                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    CalcudoraIndiviual resultado = new CalcudoraIndiviual(resultCalcudoraIndiviual);
                    CalcudoraIndiviual resultado_2 = new CalcudoraIndiviual(DresultCalcudoraIndiviual);

                    System.out.println("El resultado del seno de " + resultCalcudoraIndiviual + " es: " +  resultado.sen());
                    System.out.println("El resultado del seno de " + DresultCalcudoraIndiviual + " es: " + resultado_2.sen());

                } break;

                case 4:{Lectura read = new Lectura();
                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    CalcudoraIndiviual resultado = new CalcudoraIndiviual(resultCalcudoraIndiviual);
                    CalcudoraIndiviual resultado_2 = new CalcudoraIndiviual(DresultCalcudoraIndiviual);

                    System.out.println("El resultado del coseno de " + resultCalcudoraIndiviual + " es: " +  resultado.cos());
                    System.out.println("El resultado del coseno de " + DresultCalcudoraIndiviual + " es: " + resultado_2.cos());

                } break;

                case 5: {Lectura read = new Lectura();
                    Menu men = new Menu();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    CalcudoraIndiviual resultado = new CalcudoraIndiviual(resultCalcudoraIndiviual);
                    CalcudoraIndiviual resultado_2 = new CalcudoraIndiviual(DresultCalcudoraIndiviual);

                    System.out.println("El resultado de la tangente de " + resultCalcudoraIndiviual + " es: " +  resultado.tan());
                    System.out.println("El resultado de la tangente de " + DresultCalcudoraIndiviual + " es: " + resultado_2.tan());

                }break;

                case 6:
                    Menu men = new Menu();
                    men.mensajeSalir(); salirPro = true; break;

                default:
                    Menu men_2 = new Menu();
                    men_2.mensaje(); break;
            }
        } while(!salirPro);
    }
}
