package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    private PokedexView vista;
    final int OPCION_SALIDA = PokedexView.OPC_MENU_SALIR;

    public PokedexController (PokedexView vista){
        this.vista = vista;
    }

    public void init(){
        int entrada;
        do{
            vista.mostrarMenu();
            entrada = vista.leerEntero();

        }
        while(entrada!=OPCION_SALIDA);
    }
}
