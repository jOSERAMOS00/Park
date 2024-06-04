package ui;

import java.util.Scanner;



public class UIMenu {
    public static void ShowMenu(){
        System.out.println("Bienvennido");
        System.out.println("como quieres ingresar");


        int respuesta =0;
        do{
            System.out.println("1.Admin");
            System.out.println("2.Cliente");
            System.out.println("0.salir");

            Scanner leer= new Scanner(System.in);
            respuesta= leer.nextInt();
            switch (respuesta){
                case 1:

                    showAdmin();
                    break;
                case 2:
                    showCliente();
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println(" error de ingreso ");

            }
        }while (respuesta!=0);


    }
    public static  void  showAdmin(){
        // Inicializar una matriz 2D para representar el parqueadero  es de tipo char que solo permite 1 solo caracter
        // 'L' para espacio LIBRE, 'O' para espacio ocupado
        char[][] parqueadero = {
                {'L', 'O', 'L', 'L'},
                {'O', 'O', 'L', 'O'},
                {'L', 'L', 'L', 'O'},
                {'O', 'L', 'O', 'L'}
        };
// variable para intrododucir la opcion por consola

        int respuesta =0;
        //Scaneer
        Scanner leer = new Scanner(System.in);
        //VARIABLE PARA PODER SALIR  con valor FALSA
        boolean volver = false;
        while (!volver){
            //llama la funciones de mostrar el estado del parquiadero
            mostrarEstadoParqueadero(parqueadero);
            //menu
            System.out.println("Menu de Administrador:");
            System.out.println("1. Ocupar espacio");
            System.out.println("2. Liberar espacio");
            System.out.println("3. Salir");
            respuesta=leer.nextInt();
            switch (respuesta) {
                //ocupar espacio
                case 1:
                    int filaocupada;
                    int columnaocupada;

                    System.out.println("ingrese la fila  a ocupar:");
                    filaocupada= leer.nextInt();
                    System.out.println("ingrese la fila  a ocupar:");
                    columnaocupada= leer.nextInt();


                    break;
                case 2:
                    //    liberarEspacio(Scanner);
                    break;
                case 3:
                //    System.out.println("Saliendo del menu de administrador.");
                    volver=true;
                   break;
                default:
                    System.out.println("Opción no válida.");

            }

        }
    }
    public static void showCliente(){
        int respuesta= 0;
        do {
            System.out.println("Menu de Cliente:");
            System.out.println("1. Ver espacios");
            System.out.println("2. Reservar espacio");
            System.out.println("3. cancelar reserva");
            System.out.println("4. Salir");
            Scanner leer=new Scanner(System.in);
            respuesta=leer.nextInt();
            switch (respuesta) {
                case 1:
                    //   verEspacios();
                    break;
                case 2:
                    // reservarEspacio(scanner);
                    break;
                case 3:
                    //  liberarReserva(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del menu de cliente.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

        }while (respuesta!=0);
    }

    public static void mostrarEstadoParqueadero(char[][] parqueadero) {
        //bucle externo fila
        for (int i = 0; i < parqueadero.length; i++) {
            //bucle inteno columnas
            for (int j = 0; j < parqueadero[i].length; j++) {
                if (parqueadero[i][j] == 'L') {
                    System.out.print("L ");
                } else if (parqueadero[i][j] == 'O') {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }


}









