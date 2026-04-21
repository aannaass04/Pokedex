package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    private PokedexView vista;
    private static final int OPCION_SALIDA = PokedexView.OPC_MENU_SALIR;
    // private static final String FICHERO_ENTRENADOR = "entrenador.txt";

    public PokedexController (PokedexView vista){
        this.vista = vista;
    }

    public void init(){
        int entrada;
        do{
            vista.mostrarMenu();
            entrada = vista.leerEntero("Introduce la opcion:");
            switch (entrada) {
                case vista.OPC_MENU_INTRODUCIR_NOMBRE:
                    
                    break;
            
                default:
                    break;
            }

        }
        while(entrada!=OPCION_SALIDA);
    }
}
