package pokemon;

import pokemon.util.WeightedType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MatchChecker {
    private HashMap<PokemonTypes, WeightedType<PokemonTypes>> weigethedTypeHashMap = new HashMap<>();

    public void checkMatches(PokemonTypes... types){
        for (PokemonTypes type : types) {
            int pokValue = type.ordinal();

            for (int i = 0; i < StrengthMatrix.strengthMatrix.length; i++) {
                StrengthType strengthType = StrengthMatrix.strengthMatrix[pokValue][i];
                PokemonTypes otherType = PokemonTypes.get(i);

                WeightedType<PokemonTypes> weightedType = weigethedTypeHashMap.getOrDefault(otherType, new WeightedType<>(otherType, 0));

                switch (strengthType){
                    case NO_DAMAGE:
                        System.out.println(otherType + " -> " + type + " deals no damage");
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
                weigethedTypeHashMap.put(otherType, weightedType);

            }
        }
    }

    public void dumpResults(){
        Comparator<WeightedType<?>> comp = Comparator.comparingInt(WeightedType::getWeight);

        List<WeightedType<PokemonTypes>> weightedTypeList = new ArrayList<>();

        weigethedTypeHashMap.forEach((types,pokemonTypesWeightedType)-> weightedTypeList.add(pokemonTypesWeightedType));
        weightedTypeList.sort(comp);
        for (WeightedType<PokemonTypes> weightedType : weightedTypeList) {
            System.out.println(weightedType);
        }

    }
}
