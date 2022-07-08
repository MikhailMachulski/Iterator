import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
        random.ints(min - 1, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return (random != null);
            }

            @Override
            public Integer next() {
                return random.ints(min - 1, max + 1).iterator().nextInt();
            }
        };
    }
}
