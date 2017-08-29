package pokemon;

import javafx.util.Pair;
import pokemon.util.WeightedType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatchChecker {
    private HashMap<PokemonTypes, WeightedType<PokemonTypes>> weigethedTypeHashMap = new HashMap<>();
    private HashMap<Pair<PokemonTypes, PokemonTypes>, Integer> noDamageMap = new HashMap<>();

    public void checkMatches(PokemonTypes... types){
        for (PokemonTypes defenderType : types) {
            int pokValue = defenderType.ordinal();

            for (int i = 0; i < StrengthMatrix.strengthMatrix.length; i++) {
                StrengthType strengthType = StrengthMatrix.strengthMatrix[i][pokValue];
                PokemonTypes attackerType = PokemonTypes.get(i);

                WeightedType<PokemonTypes> weightedType = weigethedTypeHashMap.getOrDefault(attackerType, new WeightedType<>(attackerType, 0));

                switch (strengthType){
                    case NO_DAMAGE:
                        System.out.println(attackerType + " -> " + defenderType + " deals no damage");

                        Pair<PokemonTypes, PokemonTypes> pair = new Pair<>(attackerType, defenderType);
                        Integer value = noDamageMap.getOrDefault(pair, 0);
                        noDamageMap.put(pair, ++value);
                        // noDamageMessageList.add(otherType + " -> " + defenderType + " deals no damage");

                        weightedType.decrWeight();
                        weightedType.decrWeight();
                        break;
                    case LESS_DAMAGE:
                        weightedType.decrWeight();
                        break;
                    case NEUTRAL:
                        break;
                    case MORE_DAMAGE:
                        weightedType.incrWeight();
                        break;
                }
                weigethedTypeHashMap.put(attackerType, weightedType);

            }
        }
    }

    public void dumpResults(){
        List<WeightedType<PokemonTypes>> weightedTypeList = new ArrayList<>();

        weigethedTypeHashMap.forEach((types,pokemonTypesWeightedType)-> weightedTypeList.add(pokemonTypesWeightedType));
        weightedTypeList.sort(WeightedType.COMPARATOR);

        for (WeightedType<PokemonTypes> weightedType : weightedTypeList) {
            System.out.println(weightedType);
        }

    }

    public List<String> getMessages(){
        List<WeightedType<PokemonTypes>> weightedTypeList = new ArrayList<>();
        List<String> messages = new ArrayList<>();

        noDamageMap.forEach((pokemonTypesPokemonTypesPair, integer) -> messages.add(pokemonTypesPokemonTypesPair.getKey() + " -> " + pokemonTypesPokemonTypesPair.getValue() + " deals no damage " + integer + " times"));

        weigethedTypeHashMap.forEach((types,pokemonTypesWeightedType)-> weightedTypeList.add(pokemonTypesWeightedType));
        weightedTypeList.sort(WeightedType.COMPARATOR);

        for (WeightedType<PokemonTypes> weightedType : weightedTypeList) {
            messages.add(weightedType.toString());
        }

        return messages;
    }
}
