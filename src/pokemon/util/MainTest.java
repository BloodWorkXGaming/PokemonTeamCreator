package pokemon.util;

import pokemon.MatchChecker;
import pokemon.PokemonTypes;

import static pokemon.PokemonTypes.*;

public class MainTest {
    public static void main(String[] args){
        MatchChecker checker = new MatchChecker();
        // checker.checkMatches(BUG, NORMAL, NORMAL, NORMAL);
        checker.checkMatches(PokemonTypes.DRAGON, FIRE, FLYING, WATER, FAIRY, POISON, GRASS, FIGHTING, STEEL, GHOST, FAIRY, DARK, POISON, BUG, ROCK, GROUND, ICE, ELECTRIC, STEEL, PSYCHIC);
        checker.dumpResults();
    }
}
