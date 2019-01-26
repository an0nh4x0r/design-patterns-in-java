package in.swapnilsingh.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {

        if (index == bikes.length) {
            String[] largeBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largeBikes, 0, bikes.length);
            bikes = largeBikes;
            largeBikes = null;
        }

        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator iterator() {

        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return it;

    }
}
