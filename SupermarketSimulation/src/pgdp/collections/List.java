package pgdp.collections;

public class List<T> {
    final private T info;
    private List<T> next;

    public List(T x) {
        info = x;
        next = null;
    }

    public List(T x, List<T> l) {
        info = x;
        next = l;
    }

    public void insert(T x) {
        next = new List<T>(x, next);
    }

    public void delete() {
        if (next != null)
            next = next.next;
    }

    public int length() {
        int result = 1;
        for (List<T> t = next; t != null; t = t.next)
            result++;
        return result;
    }

    @Override
    public String toString() {
        String result = "[" + info;
        for (List t = next; t != null; t = t.next)
            result = result + ", " + t.info;
        return result + "]";
    }

    public T getInfo() {
        return info;
    }

    public List<T> getNext() {
        return next;
    }

    public void addNextElement(List<T> obj) {
        this.next = obj;
    }
}
