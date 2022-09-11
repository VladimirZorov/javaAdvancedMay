package Aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private List<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<Fish>();
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

    public List<Fish> getFishInPool() {
        return fishInPool;
    }

    public void add(Fish fish) {
        if (!fishInPool.contains(fish)&&fishInPool.size()+1<capacity){
            this.fishInPool.add(fish);
        }
    }

    public boolean remove(String name) {
        for (Fish fishIn : fishInPool) {
            if (fishIn.getName().equals(name)) {
                fishInPool.remove(this.name);
                return true;
            }
        }
        return false;
    }

    public String findFish(String name){
        for (Fish fishIn : fishInPool) {
            if (!fishIn.equals(name)) {
                fishInPool.remove(this.name);
                return this.name;
            } else {
                return null;
            }
        }
        return name;
    }





    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Aquarium: %s ^ Size: %d",this.name, this.size));
        builder.append(System.lineSeparator());

        for (Fish fi : fishInPool) {
            builder.append(fi);
            builder.append(System.lineSeparator());

        }

        return builder.toString().trim();
    }
}
