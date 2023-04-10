package module12;

import java.util.Comparator;

public class PetsComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getName().length()-o2.getName().length();
    }
}
