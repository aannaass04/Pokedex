package es.etg.prog.pokedex.controller;

import java.io.IOException;

import es.etg.prog.pokedex.model.entities.Pokedex;
import es.etg.prog.pokedex.util.FicheroManager;
import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    
    private static final int OPCION_SALIDA = PokedexView.OPC_SALIR;
    private static final String FICHERO_ENTRENADOR = "entrenador.txt";
    private static final String OPC_NO_VALIDA = "La opción no es válida!";
    private static final String OPC_TEXTO_SALIR = "Saliendo del programa...";

    private PokedexView vista;

    private Pokedex pokedex = new Pokedex(null, null, null);

    public PokedexController (PokedexView vista){
        this.vista = vista;
    }
    
    public void init() throws IOException{
        int entrada;
        do{
            vista.mostrarMenu();
            entrada = vista.leerEntero("Introduce la opcion:");
            switch (entrada) {
                case PokedexView.OPC_INTR_NOMBRE -> {
                    String nombre = vista.leerString("Introduce el nombre del entrenador");
                    pokedex.setEntrenador(nombre);
                }

                case PokedexView.OPC_CARGAR -> FicheroManager.read(FICHERO_ENTRENADOR); //Aqui en el read se puede poner como un sysout para imprimir el nombre?

                case PokedexView.OPC_GUARDAR ->{ 
                    byte[] bytes = FicheroManager.convertirString(pokedex.getEntrenador());
                    FicheroManager.write(FICHERO_ENTRENADOR, bytes);
                } 

                case PokedexView.OPC_SALIR -> vista.imprimir(OPC_TEXTO_SALIR); //Preguntar a Julian si aqui se puede poner un sysout o es hardcode

                default -> vista.imprimir(OPC_NO_VALIDA);
                
            }

        }
        while(entrada!=OPCION_SALIDA);
    }
}
