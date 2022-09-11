package Aquarium;

import java.util.ArrayList;
import java.util.Collection;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private Collection<String> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public Collection<String> getFishInPool() {
        return fishInPool;
    }

    public void add(Fish fish) {
        if (fishInPool.size() < capacity) {
            for (String fishIn : fishInPool) {
                if (!fishIn.equals(name)) {
                    fishInPool.add(this.name);
                }
            }
        }
    }

    public boolean remove(String name) {
        for (String fishIn : fishInPool) {
            if (!fishIn.equals(name)) {
                fishInPool.remove(this.name);
                return true;
            }
        }
        return false;
    }

    public String findFish(String name){
        for (String fishIn : fishInPool) {
            if (!fishIn.equals(name)) {
                fishInPool.remove(this.name);
                return this.name;
            } else {
                return null;
            }
        }
        return name;
    }

    public void report() {
        System.out.println("Aquarium Info:");
    }
}
