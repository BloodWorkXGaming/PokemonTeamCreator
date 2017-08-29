package pokemon.util;

public class WeightedType<R> {

    private R object;
    private int weight;

    public WeightedType(R object, int weight) {
        this.object = object;
        this.weight = weight;
    }

    public R getObject() {
        return object;
    }

    public int getWeight() {
        return weight;
    }

    public int incrWeight(){
        return ++weight;
    }

    public int decrWeight(){
        return --weight;
    }

    @Override
    public String toString() {
        return "["+ weight + "]: " + object.toString();
    }
}
