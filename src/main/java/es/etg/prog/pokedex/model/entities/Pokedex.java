package es.etg.prog.pokedex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import es.etg.prog.pokedex.model.persistence.IPokemonRepository;

@Data @AllArgsConstructor
public class Pokedex {
 
    private IPokemonRepository repository;
    private List<Pokemon> pokemons = new ArrayList<>();
    private String entrenador;
}