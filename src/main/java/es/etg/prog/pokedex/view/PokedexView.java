package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("Menu Principal Pokedex");
        System.out.println("");
        System.out.println("1. Ver Pokemons");
        System.out.println("2. Ver carnet de entrenador");
        System.out.println("3. Salir");
    }

    public String leerString(){
        String res;
        res = sc.nextLine();
        return res;
    }

    public int leerEntero(){
        int res;
        res = sc.nextInt();
        return res;
    }
}
