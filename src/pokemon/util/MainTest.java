package pokemon.util;

import pokemon.PokemonTypes;

public class MainTest {
    public static void main(String[] args){
        System.out.println(PokemonTypes.NORMAL.getTypeInteractionTowards(PokemonTypes.BUG));
    }
}
