package generic.test.ex1;

public class Container<T> {

    private T Item;

    public void setItem(T item) {
        this.Item = item;
    }
    public T getItem() {
        return Item;
    }
    public boolean isEmpty() {
        return Item == null;
    }
}
