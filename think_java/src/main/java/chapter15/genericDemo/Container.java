package chapter15.genericDemo;

/**
 * Created by wjk on 16/1/13.
 */
public class Container<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Container(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Container<String,String> container1 = new Container<String, String>("a","b");
        Container<Integer,Integer> container2 = new Container<Integer, Integer>(1,2);
        System.out.println(container1.getKey() + container1.getValue());
        System.out.println(container2.getKey() + container2.getValue());
    }
}
