package by.academy.lab6;
import java.util.Comparator;
 
public class CapacityComparator implements Comparator<Plane> {
 
 
    @Override
    public int compare(Plane o1, Plane o2) {
        if (o1.capacity==o2.capacity) {
            return 0;
        }
            else if (o1.capacity<o2.capacity) {
                return -1;
            }
            else
                return 1;
        }
}
 