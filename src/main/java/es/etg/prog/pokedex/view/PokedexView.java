package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    private Scanner sc = new Scanner(System.in);
    public final static String MENU_UNO = "Menú Principal Pokedex %n\t%s";
    public final static String MENU_DOS = "Introducir el nombre del entrenador";
    public final static String MENU_TRES = "Cargar datos desde fichero";
    public final static String MENU_DOS = "Guardar datos desde fichero";
    public final static String MENU_CUATRO = "Salir";

    public final static String STR_MENU_SALIR = "Salir";
    public final static int OPC_MENU_SALIR = 3;
    public final static int OPC_MENU_INTRODUCIR_NOMBRE = 1;
    

    public void mostrarMenu(){
        String menu = String.format(MENU_COMPLETO);
        System.out.println(menu);
    }

    public String leerString(String msg){
        System.out.println(msg);
        String res;
        res = sc.nextLine();
        return res;
    }

    public int leerEntero(String msg){
        return Integer.parseInt(leerString(msg));
    }
}
