package es.etg.prog.pokedex.model.exception;

import java.io.StringReader;

public class PokemonNotFoundException extends PokedexException{
    StringReader sr = new StringReader(getLocalizedMessage());
}
