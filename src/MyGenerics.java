public class MyGenerics<K,V> implements MyDesign{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add() {
        return false;
    }

    public K key(Object o){
        return (K) o;
    }
}