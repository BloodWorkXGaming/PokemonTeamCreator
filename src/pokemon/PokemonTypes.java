package pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum PokemonTypes {
    NORMAL,
    FIRE,
    WATER,
    ELECTRIC,
    GRASS,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DRAGON,
    DARK,
    STEEL,
    FAIRY;

    List<TypeInteraction> typeInteractionsAttack = new ArrayList<>();

    // inits all the attack combos
    static {
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, NORMAL));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, FIRE));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, WATER));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, ELECTRIC));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, GRASS));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, ICE));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, FIGHTING));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, POISON));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, GROUND));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, FLYING));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, PSYCHIC));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, BUG));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, NORMAL, ROCK));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, NORMAL, GHOST));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, DRAGON));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, DARK));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, NORMAL, STEEL));
        NORMAL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, NORMAL, FAIRY));

        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, NORMAL));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIRE, FIRE));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIRE, WATER));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, ELECTRIC));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIRE, GRASS));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIRE, ICE));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, FIGHTING));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, POISON));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, GROUND));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, FLYING));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, PSYCHIC));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIRE, BUG));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIRE, ROCK));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, GHOST));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIRE, DRAGON));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, DARK));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIRE, STEEL));
        FIRE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIRE, FAIRY));

        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, NORMAL));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, WATER, FIRE));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, WATER, WATER));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, ELECTRIC));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, WATER, GRASS));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, ICE));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, FIGHTING));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, POISON));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, WATER, GROUND));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, FLYING));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, PSYCHIC));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, BUG));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, WATER, ROCK));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, GHOST));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, WATER, DRAGON));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, DARK));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, STEEL));
        WATER.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, WATER, FAIRY));

        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, NORMAL));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, FIRE));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ELECTRIC, WATER));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ELECTRIC, ELECTRIC));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ELECTRIC, GRASS));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, ICE));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, FIGHTING));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, POISON));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, ELECTRIC, GROUND));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ELECTRIC, FLYING));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, PSYCHIC));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, BUG));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, ROCK));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, GHOST));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ELECTRIC, DRAGON));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, DARK));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, STEEL));
        ELECTRIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ELECTRIC, FAIRY));

        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, NORMAL));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, FIRE));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GRASS, WATER));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, ELECTRIC));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, GRASS));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, ICE));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, FIGHTING));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, POISON));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GRASS, GROUND));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, FLYING));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, PSYCHIC));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, BUG));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GRASS, ROCK));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, GHOST));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, DRAGON));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, DARK));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GRASS, STEEL));
        GRASS.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GRASS, FAIRY));

        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, NORMAL));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ICE, FIRE));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ICE, WATER));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, ELECTRIC));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ICE, GRASS));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ICE, ICE));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, FIGHTING));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, POISON));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ICE, GROUND));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ICE, FLYING));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, PSYCHIC));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, BUG));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, ROCK));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, GHOST));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ICE, DRAGON));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, DARK));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ICE, STEEL));
        ICE.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ICE, FAIRY));

        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIGHTING, NORMAL));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, FIRE));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, WATER));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, ELECTRIC));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, GRASS));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIGHTING, ICE));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, FIGHTING));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIGHTING, POISON));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, GROUND));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIGHTING, FLYING));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIGHTING, PSYCHIC));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIGHTING, BUG));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIGHTING, ROCK));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, FIGHTING, GHOST));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FIGHTING, DRAGON));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIGHTING, DARK));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FIGHTING, STEEL));
        FIGHTING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FIGHTING, FAIRY));

        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, NORMAL));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, FIRE));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, WATER));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, ELECTRIC));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, POISON, GRASS));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, ICE));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, FIGHTING));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, POISON, POISON));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, POISON, GROUND));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, FLYING));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, PSYCHIC));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, BUG));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, POISON, ROCK));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, POISON, GHOST));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, DRAGON));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, POISON, DARK));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, POISON, STEEL));
        POISON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, POISON, FAIRY));

        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, NORMAL));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GROUND, FIRE));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, WATER));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GROUND, ELECTRIC));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GROUND, GRASS));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, ICE));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, FIGHTING));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GROUND, POISON));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, GROUND));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, GROUND, FLYING));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, PSYCHIC));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GROUND, BUG));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GROUND, ROCK));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, GHOST));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, DRAGON));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, DARK));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GROUND, STEEL));
        GROUND.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GROUND, FAIRY));

        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, NORMAL));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, FIRE));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, WATER));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FLYING, ELECTRIC));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FLYING, GRASS));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, ICE));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FLYING, FIGHTING));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, POISON));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, GROUND));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, FLYING));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, PSYCHIC));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FLYING, BUG));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FLYING, ROCK));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, GHOST));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, DRAGON));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, DARK));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FLYING, STEEL));
        FLYING.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FLYING, FAIRY));

        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, NORMAL));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, FIRE));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, WATER));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, ELECTRIC));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, GRASS));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, ICE));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, PSYCHIC, FIGHTING));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, PSYCHIC, POISON));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, GROUND));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, FLYING));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, PSYCHIC, PSYCHIC));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, BUG));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, ROCK));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, GHOST));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, DRAGON));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, PSYCHIC, DARK));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, PSYCHIC, STEEL));
        PSYCHIC.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, PSYCHIC, FAIRY));

        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, NORMAL));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, FIRE));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, WATER));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, ELECTRIC));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, BUG, GRASS));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, ICE));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, FIGHTING));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, POISON));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, GROUND));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, FLYING));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, BUG, PSYCHIC));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, BUG));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, ROCK));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, GHOST));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, BUG, DRAGON));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, BUG, DARK));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, STEEL));
        BUG.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, BUG, FAIRY));

        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, NORMAL));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ROCK, FIRE));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, WATER));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, ELECTRIC));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, GRASS));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ROCK, ICE));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ROCK, FIGHTING));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, POISON));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ROCK, GROUND));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ROCK, FLYING));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, PSYCHIC));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, ROCK, BUG));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, ROCK));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, GHOST));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, DRAGON));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, DARK));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, ROCK, STEEL));
        ROCK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, ROCK, FAIRY));

        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, GHOST, NORMAL));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, FIRE));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, WATER));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, ELECTRIC));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, GRASS));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, ICE));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, FIGHTING));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, POISON));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, GROUND));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, FLYING));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GHOST, PSYCHIC));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, BUG));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, ROCK));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, GHOST, GHOST));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, DRAGON));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, GHOST, DARK));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, STEEL));
        GHOST.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, GHOST, FAIRY));

        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, NORMAL));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, FIRE));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, WATER));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, ELECTRIC));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, GRASS));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, ICE));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, FIGHTING));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, POISON));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, GROUND));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, FLYING));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, PSYCHIC));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, BUG));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, ROCK));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, GHOST));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, DRAGON, DRAGON));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DRAGON, DARK));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, DRAGON, STEEL));
        DRAGON.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NO_DAMAGE, DRAGON, FAIRY));

        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, NORMAL));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, FIRE));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, WATER));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, ELECTRIC));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, GRASS));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, ICE));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, DARK, FIGHTING));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, POISON));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, GROUND));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, FLYING));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, DARK, PSYCHIC));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, BUG));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, ROCK));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, DARK, GHOST));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, DRAGON));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, DARK, DARK));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, DARK, STEEL));
        DARK.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, DARK, FAIRY));

        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, NORMAL));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, STEEL, FIRE));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, STEEL, WATER));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, STEEL, ELECTRIC));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, GRASS));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, STEEL, ICE));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, FIGHTING));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, POISON));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, GROUND));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, FLYING));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, PSYCHIC));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, BUG));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, STEEL, ROCK));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, GHOST));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, DRAGON));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, STEEL, DARK));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, STEEL, STEEL));
        STEEL.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, STEEL, FAIRY));

        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, NORMAL));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FAIRY, FIRE));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, WATER));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, ELECTRIC));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, GRASS));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, ICE));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FAIRY, FIGHTING));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FAIRY, POISON));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, GROUND));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, FLYING));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, PSYCHIC));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, BUG));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, ROCK));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, GHOST));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FAIRY, DRAGON));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.MORE_DAMAGE, FAIRY, DARK));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.LESS_DAMAGE, FAIRY, STEEL));
        FAIRY.typeInteractionsAttack.add(new TypeInteraction(TypeInteraction.InteractionType.ATTACK, StrengthType.NEUTRAL, FAIRY, FAIRY));
    }

    static Map<String, PokemonTypes> nameEnumMap = new HashMap<>();
    static {
        for (PokemonTypes pokemonTypes : values()) {
            nameEnumMap.put(pokemonTypes.name(), pokemonTypes);
        }
    }

    public TypeInteraction getAttack(PokemonTypes type){
        for (TypeInteraction typeInteraction : this.typeInteractionsAttack) {
            if (typeInteraction.getTypeEnemy() == type){
                return typeInteraction;
            }
        }

        return null;
    }

    public TypeInteraction getDefend(PokemonTypes type){

        return null;
    }

    public static PokemonTypes get(int i){
        return PokemonTypes.values()[i];
    }

    public static PokemonTypes getByName(String name){
        return nameEnumMap.get(name);
    }
}
