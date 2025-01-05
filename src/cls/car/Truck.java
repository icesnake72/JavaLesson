package cls.car;

public abstract class Truck implements Car{

    private int capacity;

    public Truck() {
        capacity = 0;
    }

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    public void setCap(int capacity) {
        this.capacity = capacity;
    }

    public abstract void load(int weight);

    @Override
    public void go() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turn(boolean left) {

    }
}
