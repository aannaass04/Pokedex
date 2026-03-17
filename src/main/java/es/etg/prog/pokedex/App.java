package es.etg.prog.pokedex;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.view.PokedexView;

public class App {
    public static void main(String[] args) {
        PokedexView vista = new PokedexView();
        PokedexController controlador = new PokedexController(vista);
        controlador.init();
    }
}