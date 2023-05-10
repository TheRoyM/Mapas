package co.edu.unac.poo1.unidad1;
import co.edu.unac.poo1.unidad2.Unidad2;
import co.edu.unac.poo1.unidad3.Unidad3;

import java.util.Scanner;

public class Unidad1 {
    private static final int MAXIMA_OPCION_MENU = 7;
    public static void menuPrincipal() {
        int opcionMenu;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("-->\nWelcome to Relojeria TheRoyTM<--");
            System.out.println("\nPor favor digite una opcion:");
            System.out.println("1. Precio relojes comprados");
            System.out.println("2. Mapas :)");
            System.out.println("3. Mapas ordenados :)");
            System.out.println("4. Mapas con hasmap");
            System.out.println("5. Añadir dato Mapa");
            System.out.println("6. Añadir dato Mapa a lista");

            System.out.println(MAXIMA_OPCION_MENU + ". Salir de la aplicacion");
            opcionMenu = entrada.nextInt();
            entrada.nextLine();
            switch (opcionMenu){
                case 1 -> Unidad2.carritocompra();
                case 2 -> Unidad3.elejirRelojMapa();
                case 3 -> Unidad3.relojsOrdenados();
                case 4 -> Unidad3.ordenarListaHasmap();
                case 5 -> Unidad3.elementodeListaaMap();
                case 6 -> Unidad3.demapaAlista();
                case MAXIMA_OPCION_MENU -> System.out.println("Hasta pronto");
                default -> System.err.println("ERROR: Opcion invalida");
            }
        }while (opcionMenu != MAXIMA_OPCION_MENU);
    }
}
