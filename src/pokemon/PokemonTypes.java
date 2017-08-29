package pokemon;

import java.util.ArrayList;
import java.util.List;

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

    List<TypeInteraction> typeInteractions = new ArrayList<>();

    static {
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, NORMAL));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, FIRE));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, WATER));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, ELECTRIC));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, GRASS));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, ICE));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, FIGHTING));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, POISON));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, GROUND));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, FLYING));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, PSYCHIC));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, BUG));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, NORMAL, ROCK));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, NORMAL, GHOST));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, DRAGON));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, DARK));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, NORMAL, STEEL));
        NORMAL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, NORMAL, FAIRY));

        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, NORMAL));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIRE, FIRE));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIRE, WATER));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, ELECTRIC));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIRE, GRASS));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIRE, ICE));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, FIGHTING));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, POISON));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, GROUND));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, FLYING));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, PSYCHIC));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIRE, BUG));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIRE, ROCK));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, GHOST));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIRE, DRAGON));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, DARK));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIRE, STEEL));
        FIRE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIRE, FAIRY));

        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, NORMAL));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, WATER, FIRE));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, WATER, WATER));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, ELECTRIC));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, WATER, GRASS));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, ICE));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, FIGHTING));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, POISON));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, WATER, GROUND));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, FLYING));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, PSYCHIC));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, BUG));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, WATER, ROCK));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, GHOST));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, WATER, DRAGON));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, DARK));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, STEEL));
        WATER.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, WATER, FAIRY));

        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, NORMAL));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, FIRE));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ELECTRIC, WATER));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ELECTRIC, ELECTRIC));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ELECTRIC, GRASS));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, ICE));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, FIGHTING));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, POISON));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, ELECTRIC, GROUND));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ELECTRIC, FLYING));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, PSYCHIC));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, BUG));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, ROCK));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, GHOST));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ELECTRIC, DRAGON));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, DARK));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, STEEL));
        ELECTRIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ELECTRIC, FAIRY));

        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, NORMAL));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, FIRE));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GRASS, WATER));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, ELECTRIC));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, GRASS));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, ICE));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, FIGHTING));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, POISON));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GRASS, GROUND));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, FLYING));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, PSYCHIC));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, BUG));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GRASS, ROCK));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, GHOST));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, DRAGON));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, DARK));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GRASS, STEEL));
        GRASS.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GRASS, FAIRY));

        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, NORMAL));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ICE, FIRE));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ICE, WATER));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, ELECTRIC));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ICE, GRASS));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ICE, ICE));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, FIGHTING));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, POISON));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ICE, GROUND));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ICE, FLYING));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, PSYCHIC));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, BUG));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, ROCK));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, GHOST));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ICE, DRAGON));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, DARK));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ICE, STEEL));
        ICE.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ICE, FAIRY));

        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIGHTING, NORMAL));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, FIRE));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, WATER));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, ELECTRIC));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, GRASS));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIGHTING, ICE));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, FIGHTING));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIGHTING, POISON));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, GROUND));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIGHTING, FLYING));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIGHTING, PSYCHIC));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIGHTING, BUG));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIGHTING, ROCK));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, FIGHTING, GHOST));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FIGHTING, DRAGON));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIGHTING, DARK));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FIGHTING, STEEL));
        FIGHTING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FIGHTING, FAIRY));

        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, NORMAL));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, FIRE));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, WATER));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, ELECTRIC));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, POISON, GRASS));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, ICE));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, FIGHTING));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, POISON, POISON));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, POISON, GROUND));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, FLYING));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, PSYCHIC));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, BUG));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, POISON, ROCK));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, POISON, GHOST));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, DRAGON));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, POISON, DARK));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, POISON, STEEL));
        POISON.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, POISON, FAIRY));

        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, NORMAL));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GROUND, FIRE));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, WATER));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GROUND, ELECTRIC));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GROUND, GRASS));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, ICE));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, FIGHTING));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GROUND, POISON));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, GROUND));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, GROUND, FLYING));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, PSYCHIC));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GROUND, BUG));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GROUND, ROCK));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, GHOST));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, DRAGON));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, DARK));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GROUND, STEEL));
        GROUND.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GROUND, FAIRY));

        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, NORMAL));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, FIRE));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, WATER));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FLYING, ELECTRIC));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FLYING, GRASS));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, ICE));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FLYING, FIGHTING));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, POISON));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, GROUND));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, FLYING));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, PSYCHIC));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FLYING, BUG));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FLYING, ROCK));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, GHOST));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, DRAGON));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, DARK));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FLYING, STEEL));
        FLYING.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FLYING, FAIRY));

        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, NORMAL));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, FIRE));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, WATER));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, ELECTRIC));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, GRASS));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, ICE));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, PSYCHIC, FIGHTING));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, PSYCHIC, POISON));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, GROUND));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, FLYING));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, PSYCHIC, PSYCHIC));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, BUG));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, ROCK));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, GHOST));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, DRAGON));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, PSYCHIC, DARK));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, PSYCHIC, STEEL));
        PSYCHIC.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, PSYCHIC, FAIRY));

        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, NORMAL));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, FIRE));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, WATER));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, ELECTRIC));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, BUG, GRASS));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, ICE));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, FIGHTING));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, POISON));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, GROUND));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, FLYING));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, BUG, PSYCHIC));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, BUG));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, ROCK));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, GHOST));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, BUG, DRAGON));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, BUG, DARK));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, STEEL));
        BUG.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, BUG, FAIRY));

        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, NORMAL));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ROCK, FIRE));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, WATER));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, ELECTRIC));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, GRASS));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ROCK, ICE));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ROCK, FIGHTING));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, POISON));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ROCK, GROUND));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ROCK, FLYING));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, PSYCHIC));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, ROCK, BUG));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, ROCK));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, GHOST));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, DRAGON));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, DARK));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, ROCK, STEEL));
        ROCK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, ROCK, FAIRY));

        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, GHOST, NORMAL));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, FIRE));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, WATER));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, ELECTRIC));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, GRASS));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, ICE));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, FIGHTING));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, POISON));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, GROUND));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, FLYING));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GHOST, PSYCHIC));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, BUG));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, ROCK));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, GHOST, GHOST));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, DRAGON));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, GHOST, DARK));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, STEEL));
        GHOST.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, GHOST, FAIRY));

        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, NORMAL));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, FIRE));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, WATER));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, ELECTRIC));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, GRASS));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, ICE));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, FIGHTING));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, POISON));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, GROUND));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, FLYING));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, PSYCHIC));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, BUG));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, ROCK));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, GHOST));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, DRAGON, DRAGON));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DRAGON, DARK));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, DRAGON, STEEL));
        DRAGON.typeInteractions.add(new TypeInteraction(StrengthType.NO_DAMAGE, DRAGON, FAIRY));

        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, NORMAL));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, FIRE));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, WATER));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, ELECTRIC));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, GRASS));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, ICE));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, DARK, FIGHTING));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, POISON));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, GROUND));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, FLYING));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, DARK, PSYCHIC));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, BUG));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, ROCK));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, DARK, GHOST));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, DRAGON));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, DARK, DARK));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, DARK, STEEL));
        DARK.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, DARK, FAIRY));

        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, NORMAL));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, STEEL, FIRE));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, STEEL, WATER));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, STEEL, ELECTRIC));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, GRASS));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, STEEL, ICE));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, FIGHTING));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, POISON));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, GROUND));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, FLYING));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, PSYCHIC));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, BUG));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, STEEL, ROCK));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, GHOST));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, DRAGON));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, STEEL, DARK));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, STEEL, STEEL));
        STEEL.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, STEEL, FAIRY));

        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, NORMAL));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FAIRY, FIRE));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, WATER));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, ELECTRIC));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, GRASS));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, ICE));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FAIRY, FIGHTING));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FAIRY, POISON));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, GROUND));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, FLYING));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, PSYCHIC));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, BUG));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, ROCK));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, GHOST));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FAIRY, DRAGON));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.MORE_DAMAGE, FAIRY, DARK));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.LESS_DAMAGE, FAIRY, STEEL));
        FAIRY.typeInteractions.add(new TypeInteraction(StrengthType.NEUTRAL, FAIRY, FAIRY));
    }

    public TypeInteraction getTypeInteractionTowards(PokemonTypes type){
        for (TypeInteraction typeInteraction : this.typeInteractions) {
            if (typeInteraction.getTypeEnemy() == type){
                return typeInteraction;
            }
        }

        return null;
    }
}
