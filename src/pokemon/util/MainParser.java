package pokemon.util;

import pokemon.StrengthType;
import pokemon.TypeInteraction;

public class MainParser {

    static String[] types = {
            "NORMAL",
            "FIRE",
            "WATER",
            "ELECTRIC",
            "GRASS",
            "ICE",
            "FIGHTING",
            "POISON",
            "GROUND",
            "FLYING",
            "PSYCHIC",
            "BUG",
            "ROCK",
            "GHOST",
            "DRAGON",
            "DARK",
            "STEEL",
            "FAIRY"
    };
    static String[] typesStrength = {
            "NORMAL,   1,1,1,1,1,1,1,1,1,1,1,1,3,0,1,1,3,1",
            "FIRE,     1,3,3,1,2,2,1,1,1,1,1,2,3,1,3,1,2,1",
            "WATER,    1,2,3,1,3,1,1,1,2,1,1,1,2,1,3,1,1,1",
            "ELECTRIC, 1,1,2,3,3,1,1,1,0,2,1,1,1,1,3,1,1,1",
            "GRASS,    1,3,2,1,3,1,1,3,2,3,1,3,2,1,3,1,3,1",
            "ICE,      1,3,3,1,2,3,1,1,2,2,1,1,1,1,2,1,3,1",
            "FIGHTING, 2,1,1,1,1,2,1,3,1,3,3,3,2,0,1,2,2,3",
            "POISON,   1,1,1,1,2,1,1,3,3,1,1,1,3,3,1,1,0,2",
            "GROUND,   1,2,1,2,3,1,1,2,1,0,1,3,2,1,1,1,2,1",
            "FLYING,   1,1,1,3,2,1,2,1,1,1,1,2,3,1,1,1,3,1",
            "PSYCHIC,  1,1,1,1,1,1,2,2,1,1,3,1,1,1,1,0,3,1",
            "BUG,      1,3,1,1,2,1,3,3,1,3,2,1,1,3,1,2,3,3",
            "ROCK,     1,2,1,1,1,2,3,1,3,2,1,2,1,1,1,1,3,1",
            "GHOST,    0,1,1,1,1,1,1,1,1,1,2,1,1,2,1,3,1,1",
            "DRAGON,   1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,3,0",
            "DARK,     1,1,1,1,1,1,3,1,1,1,2,1,1,2,1,3,1,3",
            "STEEL,    1,3,3,3,1,2,1,1,1,1,1,1,2,1,1,1,3,2",
            "FAIRY,    1,3,1,1,1,1,2,3,1,1,1,1,1,1,2,2,3,1"

    };

    static String[] sTypes = {
            "StrengthType.NO_DAMAGE", // 0
            "StrengthType.NEUTRAL", // 1
            "StrengthType.MORE_DAMAGE", // 2
            "StrengthType.LESS_DAMAGE" // 3

    };

    public static void main(String[] args){
        for (String s : typesStrength) {
            String[] split = s.split(",");

            String t = "";

            for (int i = 0; i < split.length; i++) {
                if (i == 0){
                    t = split[0];
                    continue;
                }

                int str = Integer.parseInt(split[i].trim());
                System.out.println(t + ".typeInteractions.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, " + sTypes[str] + ", " + t + ", " + types[i-1] + "));");
            }
            System.out.println("");
        }
    }
}
