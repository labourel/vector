/**
 * Created by Arnaud Labourel on 15/10/2018.
 */
public interface Vector {

    int[] toArray();

    int length();

    int get(int index);

    boolean set(int index, int value);

    void resize(int size);

    boolean add(int value);

    boolean fillFromStandardInput();

    int indexOf(int value);

    boolean remove(int index);

    boolean isSorted();

    Vector mergeSorted(Vector vector);

    boolean insertSorted(int value);

    void sort();
}
