package es.etg.prog.pokedex;

import java.io.IOException;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.view.PokedexView;

public class App {
    public static void main(String[] args) throws IOException {
        PokedexView vista = new PokedexView();
        PokedexController controlador = new PokedexController(vista);
        controlador.init();
    }
}