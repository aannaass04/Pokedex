package es.etg.prog.pokedex.model.persistence;
import java.util.List;
import es.etg.prog.pokedex.model.entities.Pokemon;


public interface IPokemonRepository {
    public List<Pokemon> cargar();
    public void guardar(List<Pokemon> pokemons);
}
