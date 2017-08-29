package pokemon.util;

public class WeigethedType<R> {

    private R object;
    private int weight;

    public WeigethedType(R object, int weight) {
        this.object = object;
        this.weight = weight;
    }

    public R getObject() {
        return object;
    }

    public int getWeight() {
        return weight;
    }

    public int incrWright(){
        return ++weight;
    }

    public int decrWright(){
        return --weight;
    }
}
