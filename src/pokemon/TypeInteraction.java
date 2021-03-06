package pokemon;

public class TypeInteraction {
    private StrengthType strengthType;
    private PokemonTypes typeThis;
    private PokemonTypes typeEnemy;

    private InteractionType interactionType;

    public TypeInteraction(InteractionType interactionType, StrengthType strengthType, PokemonTypes typeThis, PokemonTypes typeEnemy) {
        this.interactionType = interactionType;
        this.strengthType = strengthType;
        this.typeThis = typeThis;
        this.typeEnemy = typeEnemy;
    }

    public PokemonTypes getTypeThis() {
        return typeThis;
    }

    public PokemonTypes getTypeEnemy() {
        return typeEnemy;
    }

    public StrengthType getStrengthType() {
        return strengthType;
    }

    @Override
    public String toString() {
        return typeThis + " -> " + typeEnemy + ": " + strengthType;
    }

    public InteractionType getInteractionType() {
        return interactionType;
    }

    public enum InteractionType{
        DEFENSE,
        ATTACK
    }
}
