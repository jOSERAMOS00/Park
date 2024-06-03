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
static  void  showAdmin(){
    int respuesta =0;
    do {
        System.out.println("Menu de Administrador:");
        System.out.println("1. Ver espacios");
        System.out.println("2. Ocupar espacio");
        System.out.println("3. Liberar espacio");
        System.out.println("4. Salir");
        Scanner leer = new Scanner(System.in);
        respuesta=leer.nextInt();
        switch (respuesta) {
            case 1:
                //   verEspacios();
                break;
            case 2:
                //  ocuparEspacio(Scanner);
                break;
            case 3:
                //    liberarEspacio(Scanner);
                break;
            case 4:
                System.out.println("Saliendo del menu de administrador.");
                return;
            default:
                System.out.println("Opción no válida.");

        }

    }while (respuesta!=0);
}
static void showCliente(){
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
}
