package innerClass;

/**
 * 内部类拥有对其外部类所有成员的访问权(就好像自己拥有这些成员一样),如何做到呢?
 * 当某个外部类的对象创建了一个内部类对象时,此内部类对象必定会秘密地捕获一个指向那个外围类对象的引用,然后当访问此外部类
 * 成员的时,就用那个引用选择外围类的成员.
 */
public class Sequence {
    //items和next为外部类
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10 ;i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + "");
            selector.next();
        }
    }
}