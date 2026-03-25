package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    private Scanner sc = new Scanner(System.in);
    final static public String TEXTO_OPCIONES = "Menú Principal Pokedex %n\t%s - %s%n";
    final static public String STR_MENU_SALIR = "Salir";
    final static public int OPC_MENU_SALIR = 3;

    public void mostrarMenu(){
        String menu = String.format(TEXTO_OPCIONES, OPC_MENU_SALIR, STR_MENU_SALIR);
        System.out.println(menu);
    }

    public String leerString(){
        String res;
        res = sc.nextLine();
        return res;
    }

    public int leerEntero(){
        return Integer.parseInt(leerString());
    }
}
