package es.etg.prog.pokedex;

import java.io.IOException;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.model.exception.PokedexException;
import es.etg.prog.pokedex.view.PokedexView;

public class App {
    public static void main(String[] args) throws PokedexException {
        PokedexView vista = new PokedexView();
        PokedexController controlador = new PokedexController(vista);
        try {
            controlador.init();
        } catch (IOException e) {
            throw new PokedexException(e.getMessage());
        }
    }
}