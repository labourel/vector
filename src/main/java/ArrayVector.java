/**
 * Created by Arnaud Labourel on 15/10/2018.
 */
public class ArrayVector implements Vector {
    private static final int DEFAULT_CAPACITY = 10000;

    private final int[] array;
    private int size;

    public ArrayVector() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayVector(int capacity) {
        assert capacity >= 0;
        this.size = 0;
        array = new int[capacity];
        for(int index = 0; index<array.length; index++){
            array[index] = -1;
        }
    }

    @Override
    public String toString() {
        return "ArrayVector{}";
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean set(int index, int value) {
        return false;
    }

    @Override
    public void resize(int size) {

    }

    @Override
    public boolean add(int value) {
        return false;
    }

    @Override
    public boolean fillFromStandardInput() {
        return false;
    }

    @Override
    public int indexOf(int value) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean isSorted() {
        return false;
    }

    @Override
    public Vector mergeSorted(Vector vector) {
        return null;
    }

    @Override
    public boolean insertSorted(int value) {
        return false;
    }

    @Override
    public void sort() {

    }
}
