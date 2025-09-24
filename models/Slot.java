package models;

public abstract class Slot {
    private final String id;
    private boolean occupied;
    private final int distance; 

    public Slot(String id, int distance) {
        this.id = id;
        this.distance = distance;
        this.occupied = false;
    }

    public String getId() { return id; }
    public int getDistance() { return distance; }
    public boolean isOccupied() { return occupied; }

    public void park(Vehicle vehicle) { occupied = true; }
    public void vacate() { occupied = false; }

    public abstract boolean canFit(Vehicle v);
}