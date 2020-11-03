package trains;

public abstract class Train {
    private static int idCounter = 1;
    protected int id = idCounter++;
    protected int cost;

    public int getCost() {
        return cost;
    }

    public Train() {
        this.id = id;
    }
}


