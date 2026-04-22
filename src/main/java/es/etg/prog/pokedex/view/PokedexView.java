package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    private Scanner sc = new Scanner(System.in);
    public final static String MENU_TITULO = "Menú Principal Pokedex %n\t%s";
    public final static String MENU_INTR_NOMBRE = "Introducir el nombre del entrenador";
    public final static String MENU_CARGAR = "Cargar datos desde fichero";
    public final static String MENU_GUARDAR = "Guardar datos desde fichero";
    public final static String MENU_SALIR = "Salir";

    public final static int OPC_INTR_NOMBRE = 1;
    public final static int OPC_CARGAR = 2;
    public final static int OPC_GUARDAR = 3;
    public final static int OPC_SALIR = 4;

    public void mostrarMenu() {
        String opciones = String.format(
                "1. %s%n" +
                "2. %s%n" +
                "3. %s%n" +
                "4. %s%n",
                MENU_INTR_NOMBRE,
                MENU_CARGAR,
                MENU_GUARDAR,
                MENU_SALIR);

        System.out.println(MENU_TITULO + opciones);
    }

    public String leerString(String msg) {
        System.out.println(msg);
        String res;
        res = sc.nextLine();
        return res;
    }

    public int leerEntero(String msg) {
        return Integer.parseInt(leerString(msg));
    }

}
